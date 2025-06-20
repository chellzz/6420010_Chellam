public class FactoryMethodPatternExample {
public interface IDocument {
    void open();
}
public static class WordDocument implements IDocument {
    public void open() {
        System.out.println("Opening Word document...");
    }
}
public static class PdfDocument implements IDocument {
    public void open() {
        System.out.println("Opening PDF document...");
    }
}
public static class ExcelDocument implements IDocument {
    public void open() {
        System.out.println("Opening Excel document...");
    }
}
public static abstract class DocumentFactory {
    public abstract IDocument createDocument();
}
public static class WordFactory extends DocumentFactory {
    public IDocument createDocument() {
        return new WordDocument();
    }
}
public static class PdfFactory extends DocumentFactory {
    public IDocument createDocument() {
        return new PdfDocument();
    }
}
public static class ExcelFactory extends DocumentFactory {
    public IDocument createDocument() {
        return new ExcelDocument();
    }
}
public static class DocumentFactoryTest {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordFactory();
        IDocument wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfFactory();
        IDocument pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelFactory();
        IDocument excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}

}
