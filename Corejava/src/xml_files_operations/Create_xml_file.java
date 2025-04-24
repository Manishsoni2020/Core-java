package xml_files_operations;

import java.io.FileWriter;
import java.io.IOException;

public class Create_xml_file {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\hp\\Desktop\\books.xml");

            // Start XML
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            writer.write("<library>\n");

            // Add 50 books
            for (int i = 1; i <= 50; i++) {
                writer.write("  <book>\n");
                writer.write("    <id>" + i + "</id>\n");
                writer.write("    <title>Book Title " + i + "</title>\n");
                writer.write("    <author>Author " + i + "</author>\n");
                writer.write("    <price>" + (100 + i * 2.5) + "</price>\n");
                writer.write("  </book>\n");
            }

            // Close XML
            writer.write("</library>");
            writer.flush();
            writer.close();

            System.out.println("✅ XML file 'books.xml' created with 200+ lines.");

        } catch (IOException e) {
            System.out.println("❌ Error while creating XML file.");
            e.printStackTrace();
        }
    }
}
