package model;

public class Prescription {

    private String id;
    private String patientId;
    private String clinicianId;
    private String appointmentId;
    private String prescriptionDate;
    private String medicationName;
    private String dosage;
    private String frequency;
    private String durationDays;
    private String quantity;
    private String instructions;
    private String pharmacyName;
    private String status;
    private String issueDate;
    private String collectionDate;

    public Prescription(
            String id,
            String patientId,
            String clinicianId,
            String appointmentId,
            String prescriptionDate,
            String medicationName,
            String dosage,
            String frequency,
            String durationDays,
            String quantity,
            String instructions,
            String pharmacyName,
            String status,
            String issueDate,
            String collectionDate
    ) {
        this.id = id;
        this.patientId = patientId;
        this.clinicianId = clinicianId;
        this.appointmentId = appointmentId;
        this.prescriptionDate = prescriptionDate;
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.frequency = frequency;
        this.durationDays = durationDays;
        this.quantity = quantity;
        this.instructions = instructions;
        this.pharmacyName = pharmacyName;
        this.status = status;
        this.issueDate = issueDate;
        this.collectionDate = collectionDate;
    }

    public String getId() {
        return id;
    }

    public String getPatientId() {
        return patientId;
    }

    @Override
    public String toString() {
        return "Prescription " + id + " for patient " + patientId
                + " (" + medicationName + ", " + dosage + ")";
    }
}
