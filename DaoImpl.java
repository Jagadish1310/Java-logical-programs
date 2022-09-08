package com.bitlabs.JdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class DaoImpl implements DaoInterface{
	

	Connection con=null;
	public  DaoImpl()
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jagadish","root","sespl!@3");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void patientRegistration(Patient p) {
		
		if(con!=null)
		{
			try {
				PreparedStatement pstmt=con.prepareStatement("insert into patient values(?,?,?,?,?,?,?,?)");
				pstmt.setInt(1,p.getId());
				pstmt.setString(2,p.getpName());
				pstmt.setInt(3,p.getAge());
				pstmt.setString(4,p.getCity());
				pstmt.setLong(5,p.getMobile());
				pstmt.setLong(6,p.getAadharnumber());
				pstmt.setString(7,p.getGuardianname());
				pstmt.setLong(8,p.getGuardianmobile());
				int i=pstmt.executeUpdate();
				if(i!=0)
				{
					System.out.println("patient information inserted");
				}
				else
				{
					System.out.println("not added");
				}
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
	}
	//public void addingMedicalRecords(Medicins m) {
		//try {
			
		//}
		//catch(Exception e){
			//System.out.println(e);
		//}
	//}
	public void viewAllPatients() {
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from patient");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(3));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public void deletePetientById(int id) {
		try {
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate("delete from patient where id='"+id+"'");
			  if(i!=0) {
				  System.out.println("patient details deleted scucessfully");
			  }
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public void updatePetientInfo(Patient p) {
		try {
		Statement stmt=con.createStatement();
		int i=stmt.executeUpdate("update patient set pname='"+p.getpName()+"',age='"+p.getAge()+"'where id ='"+p.getId()+"'");
		if(i!=0) {
			   System.out.println("Patient details updated successfully");
		   }
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		
	}
	public void getPatientById(int id) {
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from patient where id='"+id+"'");
		      while(rs.next()) {
		    	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));
		      }
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void addingMedicalRecords(Medicins m) {
		if(con!=null)
		{
		try {
			PreparedStatement ps=con.prepareStatement("insert into medicins values(?,?,?,?,?,?,?)");
			ps.setInt(1,m.getM_id());
			ps.setString(2,m.getMname());
			ps.setInt(3,m.getCost());
			ps.setString(4,m.getSuppliername());
			ps.setInt(5,m.getQuantity());
			ps.setString(6,m.getManufacture_date());
			ps.setString(7,m.getExpiry_date());
			int i=ps.executeUpdate();
			if(i!=0)
			{
				System.out.println("medical information inserted");
			}
		
	       }
		catch(Exception e)
		{
			System.out.println(e);
		}
	   }
	}
}
