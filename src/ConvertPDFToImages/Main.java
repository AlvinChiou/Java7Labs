package ConvertPDFToImages;
public class Main {
    public static void main(String[] args) {
        ConvertPagesToImages convertPagesToImages = new ConvertPagesToImages();
        convertPagesToImages.sourceDir = "H:/PDFCopy/Google-Mapreduce.pdf";
        convertPagesToImages.destinationDir = "H:/PDFCopy/Converted/";
    }
}
