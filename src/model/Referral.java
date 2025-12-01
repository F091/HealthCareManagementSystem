package model;

// Represents a referral from one clinician to another for a patient
public class Referral {

    private final String id;           // unique referral ID
    private String patientId;          // Patient being referred
    private String fromClinicianId;   // who is making the referral (e.g GP)
    private String toClinicianId;      // who will receive the referral (e.g specialist)
    private String urgency;           // "Routine", "Urgent", "Two-Week Wait"
    private String reason;             // short summary of why they are referred
    private String date;               // date of referral as a simple String

    public Referral(String id,
                    String patientId,
                    String fromClinicianId,
                    String toClinicianId,
                    String urgency,
                    String reason,
                    String date) {

        this.id = id;
        this.patientId = patientId;
        this.fromClinicianId = fromClinicianId;
        this.toClinicianId = toClinicianId;
        this.urgency = urgency;
        this.reason = reason;
        this.date = date;
    }

    // Getters
    public String getId() { return id; }
    public String getPatientId() { return patientId; }
    public String getFromClinicianId() { return fromClinicianId; }
    public String getToClinicianId() { return toClinicianId; }
    public String getUrgency() { return urgency; }
    public String getReason() { return reason; }
    public String getDate() { return date; }

    // Setters
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public void setFromClinicianId(String fromClinicianId) { this.fromClinicianId = fromClinicianId; }
    public void setToClinicianId(String toClinicianId) { this.toClinicianId = toClinicianId; }
    public void setUrgency(String urgency) { this.urgency = urgency; }
    public void setReason(String reason) { this.reason = reason; }
    public void setDate(String date) { this.date = date; }

    @Override
    public String toString() {
        return "Referral[id=" + id +
                ", patientId=" + patientId +
                ", fromClinicianId=" + fromClinicianId +
                ", toClinicianId=" + toClinicianId +
                ", urgency=" + urgency +
                ", date=" + date + "]";
    }
}
