package com.flight_reservation.utilities;

import java.io.FileOutputStream;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.flight_reservation.Entities.Reservation;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
@Component
public class PDFGenerator {


	public void generateItinenarary(Reservation reservation, String filePath) {
		Document document = new Document();

		try {
			PdfWriter.getInstance(document, new FileOutputStream(filePath));
			document.open();
			document.add(generateTable(reservation));
			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private PdfPTable generateTable(Reservation reservation) {
		PdfPTable table = new PdfPTable(2);
		PdfPCell cell;

		cell = new PdfPCell(new Phrase("Flight Itinerary"));
		cell.setColspan(2);
		table.addCell(cell);

		cell = new PdfPCell(new Phrase("Flight Details"));
		cell.setColspan(2);
		table.addCell(cell);
		table.addCell("Departure City");
		table.addCell(reservation.getFlight().getDepartCity());
		table.addCell("Arrival City");
		table.addCell(reservation.getFlight().getArrivCity());
		table.addCell("Flight Number");
		table.addCell(reservation.getFlight().getFlightNo());

		cell = new PdfPCell(new Phrase("Passenger Details"));
		cell.setColspan(2);
		table.addCell(cell);
		table.addCell("Passenger Name");
		table.addCell(reservation.getPassenger().getName());
		table.addCell("Passenger Email");
		table.addCell(reservation.getPassenger().getEmail());
		table.addCell("Mobile Number");
		table.addCell(reservation.getPassenger().getMobile());
		return table;
	}
	}
