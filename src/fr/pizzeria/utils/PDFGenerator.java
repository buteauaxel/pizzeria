package fr.pizzeria.utils;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import fr.pizzeria.model.pizza.Pizza;

import java.io.FileOutputStream;
import java.util.List;
import java.io.FileNotFoundException;

/**
* @author Axel B.
 */
public class PDFGenerator {
  

	public static void PDFGenerator(final List<Pizza> lesPizzas){

        Document document = new Document(); /** créer un nouveau document*/

        try {
            PdfWriter.getInstance(document,
                new FileOutputStream("pdfTest.pdf")); /** Défini le nouveau document comme un pdf */

            document.open();
            for( Pizza p : lesPizzas){
            document.add(new Paragraph(p.toString()));
            }
            document.close(); /**  ferme le pdf */

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
