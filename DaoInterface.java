package com.bitlabs.JdbcExample;

public interface DaoInterface {
	
	public void patientRegistration(Patient p);
	
    public void viewAllPatients();
    public void deletePetientById(int id);
    public void updatePetientInfo(Patient p);
    public void getPatientById(int id);
    public void addingMedicalRecords(Medicins m);
}
