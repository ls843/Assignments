class Printer {
    public void printDocument(Document doc) {
        System.out.println("Printing document...");
        System.out.println("Content: " + doc.content);
    }
}

public class Document {
    String content;

    public Document(String content) {
        this.content = content;
    }

    public void sendToPrinter(Printer p) {
        p.printDocument(this);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        Document doc = new Document("Hello, this is a document");

        doc.sendToPrinter(printer);
    }
}
