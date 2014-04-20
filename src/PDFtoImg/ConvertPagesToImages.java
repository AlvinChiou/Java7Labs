package PDFtoImg;

/**
 * Created by Alvin on 2014/4/21.
 */
import com.sun.pdfview.PDFFile;
import com.sun.pdfview.PDFPage;

import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Transparency;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;

public class ConvertPagesToImages {

    public static void setup() throws IOException {

        //load a pdf from a byte buffer
        File file = new File("H:\\Google-Mapreduce.pdf");
        RandomAccessFile raf = new RandomAccessFile(file, "r");
        FileChannel channel = raf.getChannel();
        ByteBuffer buf = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
        PDFFile pdffile = new PDFFile(buf);

        int numPgs = pdffile.getNumPages();

        for (int i=0; i<numPgs; i++)
        {
            // draw the first page to an image
            PDFPage page = pdffile.getPage(i);

            //get the width and height for the doc at the default zoom
            Rectangle rect = new Rectangle(0,0,
                    (int)page.getBBox().getWidth(),
                    (int)page.getBBox().getHeight());

            //generate the image
            Image img = page.getImage(
                    rect.width, rect.height, //width & height
                    rect, // clip rect
                    null, // null for the ImageObserver
                    true, // fill background with white
                    true  // block until drawing is done
            );

            //save it as a file
            BufferedImage bImg = toBufferedImage( img );
            File yourImageFile = new File("H:\\page_" + i + ".png");
            ImageIO.write( bImg,"png",yourImageFile);
        }
    }

    // This method returns a buffered image with the contents of an image
    public static BufferedImage toBufferedImage(Image image) {
        if (image instanceof BufferedImage) {
            return (BufferedImage)image;
        }

        // This code ensures that all the pixels in the image are loaded
        image = new ImageIcon(image).getImage();

        // Create a buffered image with a format that's compatible with the screen
        BufferedImage bimage = null;
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            // Determine the type of transparency of the new buffered image
            int transparency = Transparency.OPAQUE;

            // Create the buffered image
            GraphicsDevice gs = ge.getDefaultScreenDevice();
            GraphicsConfiguration gc = gs.getDefaultConfiguration();
            bimage = gc.createCompatibleImage(
                    image.getWidth(null), image.getHeight(null), transparency);
        } catch (HeadlessException e) {
            System.out.println("The system does not have a screen");
        }

        if (bimage == null) {
            int type = BufferedImage.TYPE_INT_RGB;
            bimage = new BufferedImage(image.getWidth(null), image.getHeight(null), type);
        }

        // Copy image to buffered image
        Graphics g = bimage.createGraphics();

        // Paint the image onto the buffered image
        g.drawImage(image, 0, 0, null);
        g.dispose();

        return bimage;
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    ConvertPagesToImages.setup();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
