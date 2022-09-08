package com.bitlabs.JdbcExample;

import java.util.*;

public class App 
{
    public static void main( String[] args )throws Exception
    {
    	DaoInterface dao=new DaoImpl();
    	Patient p=new Patient();
    	Scanner sc=new Scanner(System.in);
    	int option=-1;
    	while(option!=0)
    	{
    	System.out.println("Enter 1 Add patient details");
    	System.out.println("Enter 2 Add viewAllPatients");
    	System.out.println("Enter 3 Add deletePetientById");
    	System.out.println("Enter 4 Add updatePetientInfo");
    	System.out.println("Enter 5 Add getPatientById");
    	System.out.println("Enter 6 Add addingMedicalRecords");
    	option=sc.nextInt();
    	switch(option)
    	{
    	case 1:
    	
    		System.out.println("Enter patient id");
    		p.setId(sc.nextInt());
    		System.out.println("Enter patient name");
    		p.setpName(sc.next());
    		System.out.println("Enter patient age");
    		p.setAge(sc.nextInt());
    		System.out.println("Enter patient city");
    		p.setCity(sc.next());
    		System.out.println("Enter patient mobilenumber");
    		p.setMobile(sc.nextLong());
    		System.out.println("Enter patient Aadharnumber");
    		p.setAadharnumber(sc.nextLong());
    		System.out.println("Enter patient Guardianname");
    		p.setGuardianname(sc.next());
    		System.out.println("Enter patient Guardianmobile");
    		p.setGuardianmobile(sc.nextLong());
    		dao.patientRegistration(p);
    	break;
    	case 2:
    	
    		dao.viewAllPatients();
    		break;
    	case 3:
    		System.out.println("Enter patient id");
    		int id=sc.nextInt();
    		dao.deletePetientById(id);
    		break;
    	case 4:
    		System.out.println("Enter patient  new name");
    		p.setpName(sc.next());
    		System.out.println("Enter patient new age");
    		p.setAge(sc.nextInt());
    		System.out.println("Enter patient id");
    		p.setId(sc.nextInt());
    		dao.updatePetientInfo(p);
    		break;
    	case 5:
    		System.out.println("Enter patient id");
    		p.setId(sc.nextInt());
    		dao.getPatientById(p.getId());
    		break;
    	case 6:
    		Medicins m=new Medicins();
    		System.out.println("Enter medicine id");
    		m.setM_id(sc.nextInt());
    		System.out.println("Enter medicine name");
    		m.setMname(sc.next());
    		System.out.println("Enter medicine cost");
    		m.setCost(sc.nextInt());
    		System.out.println("Enter supplier name");
    		m.setSuppliername(sc.next());
    		System.out.println("Enter quantity");
    		m.setQuantity(sc.nextInt());
    		System.out.println("Enter Manufacture_date");
    		m.setManufacture_date(sc.next());
    		System.out.println("Enter Expiry_date");
    		m.setExpiry_date(sc.next());
    		dao.addingMedicalRecords(m);
    		break;
    	}
    	
    }
}
}