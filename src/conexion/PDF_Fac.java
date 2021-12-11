/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.*;

/**
 *
 * @author Alan
 */
public class PDF_Fac {
    Connection conexion;
    Conexion cone= new Conexion();
    String cliente;
    String catalogo;
    String vendedor;
    String fecha;
    String descripcion;
    String total;
               
    
    
    public void pdf(String ID ){
        
        
        conexion= cone.getConexion();
        try {
            PreparedStatement pst= conexion.prepareStatement("select * from facturacion where id_facturacion='"+ID+"'");
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
                cliente= rs.getString("id_cliente");
                catalogo=rs.getString("id_catalogo");
                vendedor= rs.getString("id_vendedor");
                fecha= rs.getString("fecha");
                descripcion= rs.getString("descripción");
                total= rs.getString("total");
               
            }     
        } catch (Exception e) {
        }
         Document documento= new Document();
         try {
            String ruta= System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/Desktop/Factura.pdf"));
            documento.open();
             //Parrafo de encabezado
                Paragraph par1 = new Paragraph();
                Font fontitulo = new Font(Font.FontFamily.HELVETICA,16,Font.BOLD,BaseColor.BLACK);
                par1.add(new Phrase("Factura de venta",fontitulo));
                par1.setAlignment(Element.ALIGN_CENTER);
                par1.add(new Phrase(Chunk.NEWLINE));
                par1.add(new Phrase(Chunk.NEWLINE));
                documento.add(par1);
                
                Font fontparrafo = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.NORMAL,BaseColor.BLACK);
                
                //Parrafo para indicar no de compra y fecha en que se realizo
                Paragraph par2 = new Paragraph();
                par2.add(new Phrase("Fecha de compra: "+fecha, fontparrafo));
                par2.add(new Phrase(Chunk.NEWLINE));
                par2.setAlignment(Element.ALIGN_LEFT);
                par2.add(new Phrase(Chunk.NEWLINE));
                documento.add(par2); 
                
                Paragraph par3 = new Paragraph();
                par3.add(new Phrase("Numero de la factura: "+ID, fontparrafo));
                par3.add(new Phrase(Chunk.NEWLINE));
                par3.setAlignment(Element.ALIGN_RIGHT);
                par3.add(new Phrase("ID del vendedor: "+vendedor, fontparrafo));
                par3.add(new Phrase(Chunk.NEWLINE));
                par3.add(new Phrase(Chunk.NEWLINE));
                par3.setAlignment(Element.ALIGN_RIGHT);
                
                documento.add(par3); 
            
            PdfPTable tabla= new PdfPTable(3);           
            tabla.addCell("ID del producto");
            tabla.addCell("Descripción");
            tabla.addCell("Total");
            
            tabla.addCell(catalogo);
            tabla.addCell(descripcion);
            tabla.addCell(total);
            documento.add(tabla);
            documento.close();
        } catch (Exception e) {
        }
        
     
        
          
    
    
    }
    
}
