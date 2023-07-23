package test;
import java.io.IOException;
import java.util.Scanner;

import airtable.*;
import stat.*;
public class Test2 {

	public static void main(String[] args) throws IOException {
//		RecordUser user = new RecordUser();
//		user.reformatData();
//		RecordGroup group = new RecordGroup();
//		group.reformatData();
//		
//		try {
//			String responseUser = GetRequest.getFromAirtable("appfpkYiYDZtMWJhA", "tblexw8RrU1S7drHh", "patJOGkmzGUONSJVC.1e139f03d8fc3789fa64c266896a4a32fd875c90d0c83e895e28e49a44ed89b7");
//			GetRequest.toJsonFile(responseUser , "user.json");
//			String responseGroup = GetRequest.getFromAirtable("appfpkYiYDZtMWJhA", "tblhmlceroOgnh6Ed", "patJOGkmzGUONSJVC.1e139f03d8fc3789fa64c266896a4a32fd875c90d0c83e895e28e49a44ed89b7");
//			GetRequest.toJsonFile(responseGroup , "group.json");
//			JsonFileToExcelConverter.toExcel();
//			System.out.println("All the thing is done! Check data statistic result in the folder RESULT");
//		} catch (IOException e) {
//			System.out.println("All the thinng not done! IOException");
//		}
//		
//	}
	
	  String general = "----------------------------------------------\n" +
                "               Application\n" +
                "How can I help you? Please choose an option:\n" +
                "--FB API--\n" +
                "1. Getting users data\n" +
                "2. Getting groups data\n" +
                "Note: After getting information from FB API, data will be auto synced to Airtable\n" +
                "--Airtable--\n" +
                "3. Getting users data to 'user.json' file\n" +
                "4. Getting groups data to 'group.json' file\n" +
                "--Statistic data to Excel and Charts--\n" +
                "5. Create Excel file for data in json files got from Airtable\n" +
                "6. Create bar chart GroupAdminBarChart\n" +
                "7. Create bar chart GroupDescriptionsBarChart\n" +
                "8. Create pie chart GroupAdminPieChart\n" +  
                "----------------------------------------------\n" +
                "9. Exit";
       while (true)
       {
        	System.out.println(general);
            Scanner input = new Scanner(System.in);
            String option = input.nextLine();

            if (option.equals("1"))
            {
            	System.out.println("--1. Getting User Data--");
            	RecordUser user = new RecordUser();
				user.reformatData();
			}
           	else if (option.equals("2"))
            {
            	System.out.println("--2. Getting Group Data--");
            	RecordGroup group = new RecordGroup();
				group.reformatData();
			}
            else if (option.equals("3"))
            {
            	System.out.println("--3. Getting users data to 'user.json' file--");
            	String responseUser = GetRequest.getFromAirtable("appfpkYiYDZtMWJhA", "tblexw8RrU1S7drHh", "patJOGkmzGUONSJVC.1e139f03d8fc3789fa64c266896a4a32fd875c90d0c83e895e28e49a44ed89b7");
				GetRequest.toJsonFile(responseUser , "user.json");
				System.out.println("Succeed getting users data to 'user.json' file!");
            }
            else if (option.equals("4"))
            {
            	System.out.println("--4. Getting users data to 'group.json' file--");
            	String responseGroup = GetRequest.getFromAirtable("appfpkYiYDZtMWJhA", "tblhmlceroOgnh6Ed", "patJOGkmzGUONSJVC.1e139f03d8fc3789fa64c266896a4a32fd875c90d0c83e895e28e49a44ed89b7");
				GetRequest.toJsonFile(responseGroup , "group.json");
				System.out.println("Succeed getting users data to 'group.json' file!");
            }
            else if (option.equals("5"))
            {
            	System.out.println("--5. Create Excel file for data in json files got from Airtable--");
            	JsonFileToExcelConverter.toExcel();
            }
            else if (option.equals("6"))
            {
            	System.out.println("--6. Create bar chart GroupAdminBarChart--");
            	GroupAdminBarChart.getGroupAdminBarChart();
            }
            else if (option.equals("7"))
            {
            	System.out.println("--7. Create bar chart GroupDescriptionsBarChart--");
            	DescriptionsChart.getDescriptionBarChart();
            }
            else if (option.equals("8"))
            {
            	System.out.println("--8. Create pie chart GroupAdminPieChart--");
            	GroupAdminPieChart.getGroupAdminPieChart();
            }
            else if (option.equals("9"))
            {
                break;
            }
            System.out.println("Do you want to continue using application? Y/N");
            String choosing = input.nextLine();
            if (choosing.equals("Y") || choosing.equals("y") || choosing.equals("Yes") || choosing.equals("yes"))
            {
                continue;
            }
            else
            {
                break;
            }
       }
   }
}