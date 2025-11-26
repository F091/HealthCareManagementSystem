package model;

public class Prescription {

    private final String id;           // unique prescription ID
    private String patientId;          // link to Patient.id
    private String clinicianId;        // link to Clinician.id
    private String medication;         // e.g. "Amoxicillin 500mg"
    private String dosage;             // e.g. "1 tablet 3 times per day"
    private String instructions;       // additional notes
    private String dateIssued;         // simple String date, e.g "2025-12-01"

    public Prescription(String id,
                        String patientId,
                        String clinicianId,
                        String medication,
                        String dosage,
                        String instructions,
                        String dateIssued) {

        this.id = id;
        this.patientId = patientId;
        this.clinicianId = clinicianId;
        this.medication = medication;
        this.dosage = dosage;
        this.instructions = instructions;
        this.dateIssued = dateIssued;
    }

    // Getters
    public String getId() { return id; }
    public String getPatientId() { return patientId; }
    public String getClinicianId() { return clinicianId; }
    public String getMedication() { return medication; }
    public String getDosage() { return dosage; }
    public String getInstructions() { return instructions; }
    public String getDateIssued() { return dateIssued; }

    // Setters
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public void setClinicianId(String clinicianId) { this.clinicianId = clinicianId; }
    public void setMedication(String medication) { this.medication = medication; }
    public void setDosage(String dosage) { this.dosage = dosage; }
    public void setInstructions(String instructions) { this.instructions = instructions; }
    public void setDateIssued(String dateIssued) { this.dateIssued = dateIssued; }

    @Override
    public String toString() {
        return "Prescription[id=" + id +
                ", patientId=" + patientId +
                ", clinicianId=" + clinicianId +
                ", medication=" + medication +
                ", dosage=" + dosage +
                ", dateIssued=" + dateIssued + "]";
    }
}
