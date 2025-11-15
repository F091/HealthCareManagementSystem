package model;

// Represents a patient record in the HealthCareManagement system (model layer)
public class Patient {

    private final String id;   // unique patient ID
    private String name;  // full name of patient
    private String nhsNumber;  // NHS ID number
    private String contact;  // Phone/Email
    private String gpSurgeryId;//Facility ID for their GP Practice

    // constructor to create a patient with all key details
    public Patient(String id, String name, String nhsNumber, String contact, String gpSurgeryId) {
        this.id = id;
        this.name = name;
        this.nhsNumber = nhsNumber;
        this.contact = contact;
        this.gpSurgeryId = gpSurgeryId;

        // getters and setters for patient data
    }

    public String getId() {
        return id;

    }

    public String getName() {
        return name;

    }

    public String getNhsNumber() {
        return nhsNumber;

    }

    public String getContact() {
        return contact;

    }

    public String getGpSurgeryId() {
        return gpSurgeryId;

    }

    public void setName(String name) {
        this.name = name;

    }

    public void setNhsNumber(String nhsNumber) {
        this.nhsNumber = nhsNumber;

    }

    public void setContact(String contact) {
        this.contact = contact;

    }

    public void setGpSurgeryId(String gpSurgeryId) {
        this.gpSurgeryId = gpSurgeryId;

    }

    @Override
    //provides readable String representation of patient details
    // useful for laying out data in console/debugging
    public String toString() {
        return "Patient [id=" + id + ", name=" + name + ", nhsNumber=" + nhsNumber + ", contact=" + contact + ", gpSurgeryId=" + gpSurgeryId + "]";
    }

    }

