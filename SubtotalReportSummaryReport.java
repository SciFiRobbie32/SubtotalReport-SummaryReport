
/*/*This program is to calculate how many people of what party and gender contributed cash to the cause of saving the barns.
 * Robert Hannah 01/16/2019
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.text.*;
import java.util.*;

public class SubtotalReportSummaryReport {

	//variables
	static String iStudent, iGender, iCollege, iString, oMajor, iDate;
	static double iDonate, cTotal, cTotalInfo = 0, cTotalManu = 0, cTotalTran = 0, cTotalDonate = 0, cMaleDonate = 0, cFemaleDonate = 0,
			cMaleIDonate = 0, cFemaleIDonate = 0, cMaleMDonate = 0, cFemaleMDonate = 0, cMaleTDonate = 0, cFemaleTDonate = 0;
	static int cMaleCount = 0, cFemaleCount = 0, cTotalM = 0, cTotalF = 0, iMajor, hMajor, cInfo = 0, cManu = 0, cTran = 0, cMaleInfo = 0,
			cFemaleTran = 0, cMaleManu = 0, cFemaleManu = 0, cMaleTran = 0, cFemaleInfo = 0, cOverAll = 0, cRecordCount = 0;
	static boolean endPrgm = false;
	static Scanner myScanner;
	static PrintWriter pwSubtotal;
	static PrintWriter pwSummary;
	static String record;
	
	public static void main(String[] args) {
		init();
		while (endPrgm != true) {
			calcs();
			input();
		}
		PrintSubtotal();
		PrintSummary();
		System.out.print(" Program Ended, Have a Good Day");
		pwSubtotal.close();
		pwSummary.close();
		System.exit(1);

	}
	public static void init() {
		// Set up input Scanner
		try {
		myScanner = new Scanner(new File("IHCCFUN2.DAT"));
		myScanner.useDelimiter(System.getProperty("line.separator"));
		}

		catch (FileNotFoundException e) {
			System.out.print("No File Found");
			System.exit(1);	
		}
		
		try {
			pwSummary = new PrintWriter(new File ("Summary.prt"));
			}
			catch (Exception e) {
			}
		
		try {
			pwSubtotal = new PrintWriter(new File ("Subtotal.prt"));
			}
			catch (Exception e) {
			}
		
		input();
		hMajor = iMajor;
		LocalDate iDate = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		pwSubtotal.format("%13s%11s%9s%n", "Indian Hills ", " Subtotals ", iDate.format(dtf));
		pwSummary.format("%13s%9s%9s%n", "Indian Hills ", " Summary ", iDate.format(dtf));
		pwSubtotal.format("%n%11s%1s%6s%4s%5s%24s%8s%n", "Student ID", " ", "Gender", " ", "Major", " ", "Donation");
	}
	public static void input() {
		//Check and fill any records
		if (myScanner.hasNext()) {
			record = myScanner.next();
			iStudent = record.substring(0,6);
			iGender = record.substring(7,8);
			iString = record.substring(8,10);
			iMajor = Integer.parseInt(iString);
			iString = record.substring(10,17);
			iDonate = Double.parseDouble(iString);
		}	
		else {
			System.out.print("Here");
			//End the loop if there arn't any records by changing "End" to true
			endPrgm = true;
			
		}
	}
	
	public static void calcs() {
		if (iGender.equals("M")) {
			cMaleDonate += iDonate;
		}
		else {
			cFemaleDonate += iDonate;
		}
		if (iMajor != hMajor) {
			PrintSubtotal();
		}
		
		switch (iMajor) {
		case 1:
			cRecordCount++;
			oMajor = "COMPUTER SOFTWARE DEVLOPMENT";
			cTotal = iDonate + cTotal;
			if (iGender.equals("M")) {
				cMaleCount += 1;
				cTotalM += 1;
			}
			else {
				cFemaleCount += 1;
				cTotalF += 1;
			}
			break;
		case 2:
			cRecordCount++;
			oMajor = "DIESEL POWER SYSTEMS TECHNOLOGY";
			cTotal = iDonate + cTotal;
			if (iGender.equals("M")) {
				cMaleCount += 1;
				cTotalM += 1;
			}
			else {
				cFemaleCount += 1;
				cTotalF += 1;
			}
			break;
		case 3:
			cRecordCount++;
			oMajor = "AUTOMOTIVE TECHNOLOGY";
			cTotal = iDonate + cTotal;
			if (iGender.equals("M")) {
				cMaleCount += 1;
				cTotalM += 1;
			}
			else {
				cFemaleCount += 1;
				cTotalF += 1;
			}
			break;
		case 4:
			cRecordCount++;
			oMajor = "LASER/ELECTRO-OPTICS TECHNOLOGY";
			cTotal = iDonate + cTotal;
			if (iGender.equals("M")) {
				cMaleCount += 1;
				cTotalM += 1;
			}
			else {
				cFemaleCount += 1;
				cTotalF += 1;
			}
			break;
		case 5:
			cRecordCount++;
			oMajor = "ROBOTICS/AUTOMATION TECHNOLOGY";
			cTotal = iDonate + cTotal;
			if (iGender.equals("M")) {
				cMaleCount += 1;
				cTotalM += 1;
			}
			else {
				cFemaleCount += 1;
				cTotalF += 1;
			}
			break;
		case 6:
			cRecordCount++;
			oMajor = "DIGITAL FORENSICS";
			cTotal = iDonate + cTotal;
			if (iGender.equals("M")) {
				cMaleCount += 1;
				cTotalM += 1;
			}
			else {
				cFemaleCount += 1;
				cTotalF += 1;
			}
			break;
		case 7:
			cRecordCount++;
			oMajor = "MACHINE TECHNOLOGY";
			cTotal = iDonate + cTotal;
			if (iGender.equals("M")) {
				cMaleCount += 1;
				cTotalM += 1;
			}
			else {
				cFemaleCount += 1;
				cTotalF += 1;
			}
			break;
		case 8:
			cRecordCount++;
			oMajor = "GEOSPATIAL TECHNOLOGY";
			cTotal = iDonate + cTotal;
			if (iGender.equals("M")) {
				cMaleCount += 1;
				cTotalM += 1;
			}
			else {
				cFemaleCount += 1;
				cTotalF += 1;
			}
			break;
		case 9:
			cRecordCount++;
			oMajor = "ADMINISTRATIVE ASSISTANT";
			cTotal = iDonate + cTotal;
			if (iGender.equals("M")) {
				cMaleCount += 1;
				cTotalM += 1;
			}
			else {
				cFemaleCount += 1;
				cTotalF += 1;
			}
			break;
		case 10:
			cRecordCount++;
			oMajor = "ACCOUNTING ASSISTANT";
			cTotal = iDonate + cTotal;
			if (iGender.equals("M")) {
				cMaleCount += 1;
				cTotalM += 1;
			}
			else {
				cFemaleCount += 1;
				cTotalF += 1;
			}
			break;
		case 11:
			cRecordCount++;
			oMajor = "WELDING TECHNOLOGY";
			cTotal = iDonate + cTotal;
			if (iGender.equals("M")) {
				cMaleCount += 1;
				cTotalM += 1;
			}
			else {
				cFemaleCount += 1;
				cTotalF += 1;
			}
			break;
		case 12:
			cRecordCount++;
			oMajor = "AUTOMOTIVE COLLISION TECHNOLOGY";
			cTotal = iDonate + cTotal;
			if (iGender.equals("M")) {
				cMaleCount += 1;
				cTotalM += 1;
			}
			else {
				cFemaleCount += 1;
				cTotalF += 1;
			}
			break;
		case 13:
			cRecordCount++;
			oMajor = "AVAIATION PILOT TRAINING";
			cTotal = iDonate + cTotal;
			if (iGender.equals("M")) {
				cMaleCount += 1;
				cTotalM += 1;
			}
			else {
				cFemaleCount += 1;
				cTotalF += 1;
			}
			break;
			
		}
		String oGender, oDonate;
		if (iGender.equals("M")) {
			oGender = "Male";
		}
		else {
			oGender = "Female";
		}
		DecimalFormat dfFormater = new DecimalFormat("$##,###.00");
		oDonate = dfFormater.format(iDonate);
		pwSubtotal.format("%n%7s%5s%6s%1s%31s%1s%7s%n", iStudent, " ", oGender, " ", oMajor, " ", oDonate);
		
		
		if (iMajor == 1 || iMajor == 6 || iMajor == 8 || iMajor == 9 || iMajor == 10) {
			cInfo += 1;
			cTotalInfo += iDonate;
			if (iGender.equals("M")) {
				cMaleInfo += 1;
				cOverAll += 1;
				cMaleIDonate += iDonate;
			}
			else {
				cFemaleInfo += 1;
				cOverAll += 1;
				cFemaleIDonate += iDonate;
			}
			
		}
		if (iMajor == 4 || iMajor == 5 || iMajor == 7 || iMajor == 11) {
			cManu += 1;
			cTotalManu += iDonate;
			if (iGender.equals("M")) {
				cMaleManu += 1;
				cOverAll += 1;
				cMaleMDonate += iDonate;
			}
			else {
				cFemaleManu += 1;
				cOverAll += 1;
				cFemaleMDonate += iDonate;
			}
			
		}
		if (iMajor == 2 || iMajor == 3 || iMajor == 12 || iMajor == 13) {
			cTran += 1;
			cTotalTran += iDonate;
			if (iGender.equals("M")) {
				cMaleTran += 1;
				cOverAll += 1;
				cMaleTDonate += iDonate;
			}
			else {
				cFemaleTran += 1;
				cOverAll += 1;
				cFemaleTDonate += iDonate;
			}
			
		}
		cTotalDonate += iDonate;
	}
	public static void PrintSubtotal() {
		String oTotal;
		DecimalFormat dfFormater = new DecimalFormat("$##,###.00");
		oTotal = dfFormater.format(cTotal);
		pwSubtotal.format("%n%-32s%10s%-3s%18s%8s%n", oMajor, " Records:  ", cRecordCount, " Total Donations: ", oTotal);
		hMajor = iMajor;
		cTotal = 0;
		cRecordCount = 0;
	}
	
	public static void PrintSummary() {
		String oAvg, oAvgM, oAvgF, oAvgIF, oAvgIM, oAvgMF, oAvgMM, oAvgTF, oAvgTM, oMenTran, oFemTran, oMenManu, oFemManu, oMenInfo, oFemInfo,
		oTotalDonate;
		double cAvg, cAvgIF, cAvgIM, cAvgMF, cAvgMM, cAvgTF, cAvgTM, cAvgF, cAvgM;
		DecimalFormat dfFormater = new DecimalFormat("$##,###.00");
		cAvg = cTotalDonate/cOverAll;
		cAvg = cAvg * 100;
		cAvg = Math.round(cAvg);
		cAvg = cAvg/100;
		cAvgIF = cFemaleIDonate/cFemaleInfo;
		cAvgIF = cAvgIF * 100;
		cAvgIF = Math.round(cAvgIF);
		cAvgIF = cAvgIF/100;
		cAvgIM = cMaleIDonate/cMaleInfo;
		cAvgIM = cAvgIM * 100;
		cAvgIM = Math.round(cAvgIM);
		cAvgIM = cAvgIM/100;
		cAvgMF = cFemaleMDonate/cFemaleManu;
		cAvgMF = cAvgMF * 100;
		cAvgMF = Math.round(cAvgMF);
		cAvgMF = cAvgMF/100;
		cAvgMM = cMaleMDonate/cMaleManu;
		cAvgMM = cAvgMM * 100;
		cAvgMM = Math.round(cAvgMM);
		cAvgMM = cAvgMM/100;
		cAvgTF = cFemaleTDonate/cFemaleTran;
		cAvgTF = cAvgTF * 100;
		cAvgTF = Math.round(cAvgTF);
		cAvgTM = cMaleTDonate/cMaleTran;
		cAvgTF = cAvgTF/100;
		cAvgTM = cAvgTM * 100;
		cAvgTM = Math.round(cAvgTM);
		cAvgTM = cAvgTM/100;
		cAvgM = cMaleTDonate + cMaleMDonate + cMaleIDonate;
		cAvgM = cAvgM * 100;
		cAvgM = Math.round(cAvgM);
		cAvgM = cAvgM/100;
		cAvgF = cFemaleTDonate + cFemaleMDonate + cFemaleIDonate;
		cAvgF = cAvgF * 100;
		cAvgF = Math.round(cAvgF);
		cAvgF = cAvgF/100;
		oAvg  = dfFormater.format(cAvg);
		oAvgF = dfFormater.format(cAvgF);
		oAvgM = dfFormater.format(cAvgM);
		oAvgIF = dfFormater.format(cAvgIF);
		oAvgIM = dfFormater.format(cAvgIM);
		oAvgMF = dfFormater.format(cAvgMF);
		oAvgMM = dfFormater.format(cAvgMM);
		oAvgTF = dfFormater.format(cAvgTF);
		oAvgTM = dfFormater.format(cAvgTM); 
		pwSummary.format("%n%13s%-2s%15s%-2s%9s%8s%n", "Record Count: ", cTotalF, "Females: ", cTotalF, " Average: ", oAvgF);
		pwSummary.format("%n%13s%-2s%15s%-2s%9s%8s%n", "Record Count: ", cTotalM, "Males: ", cTotalM, " Average: ", oAvgM);
		pwSummary.format("%n%13s%-2s%15s%-2s%9s%8s%n", "Record Count: ", cMaleInfo, "Male Info: ", cMaleInfo, " Average: ", oAvgIM);
		pwSummary.format("%n%13s%-2s%15s%-2s%9s%8s%n", "Record Count: ", cFemaleInfo, "Female Info: ", cFemaleInfo, " Average: ", oAvgIF);
		pwSummary.format("%n%13s%-2s%15s%-2s%9s%8s%n", "Record Count: ", cMaleManu, "Male Manu: ", cMaleManu, " Average: ", oAvgMM);
		pwSummary.format("%n%13s%-2s%15s%-2s%9s%8s%n", "Record Count: ", cFemaleManu, "Female Manu: ", cFemaleManu, " Average: ", oAvgMF);
		pwSummary.format("%n%13s%-2s%15s%-2s%9s%8s%n", "Record Count: ", cMaleTran, "Male Tran: ", cMaleTran, " Average: ", oAvgTM);
		pwSummary.format("%n%13s%-2s%15s%-2s%9s%8s%n", "Record Count: ", cFemaleTran, "Female Tran: ", cFemaleTran, " Average: ", oAvgTF);
		pwSummary.format("%n%13s%-2s%15s%-2s%9s%8s%n", "Record Count: ", cOverAll, "OverAll: ", cOverAll, " Average: ", oAvg);
		oTotalDonate = dfFormater.format(cTotalDonate);
		pwSubtotal.format("%n%18s%-4s%12s%13s%n","Number Of Students: ", cOverAll, " Grand Totals: ", oTotalDonate);
	}
}
