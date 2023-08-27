/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author josep
 */

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.util.List;

public class Reporte {
    public static void generarReportePDF(List<String[]> registros) throws FileNotFoundException {
    try {
        Document document = new Document();
        String destino = "reporte_horarios.pdf"; 
        PdfWriter.getInstance(document, new FileOutputStream(destino));
        document.open();

        Font font = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
        Paragraph title = new Paragraph("Reporte de Horarios", font);
        title.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(title);

        for (String[] registro : registros) {
            for (String campo : registro) {
                Paragraph paragraph = new Paragraph(campo);
                document.add(paragraph);
            }
            document.add(new Paragraph("\n")); 
        }

        document.close();
        System.out.println("Se ha generado el reporte en PDF");

    } catch (DocumentException e) {
        e.printStackTrace();
    }
}

}
