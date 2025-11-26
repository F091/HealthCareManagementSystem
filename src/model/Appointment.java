package model;

public class Appointment {

    private final String id;          // unique appointment ID
    private String patientId;         // link to Patient.id
    private String clinicianId;       // link to Clinician.id
    private String facilityId;        // link to Facility.id
    private String dateTime;          // simple String: "2025-11-30 10:30"
    private String status;            // e.g. "Scheduled", "Completed", "Cancelled"
    private String reason;            // reason for visit / notes

    public Appointment(String id,
                       String patientId,
                       String clinicianId,
                       String facilityId,
                       String dateTime,
                       String status,
                       String reason) {
        this.id = id;
        this.patientId = patientId;
        this.clinicianId = clinicianId;
        this.facilityId = facilityId;
        this.dateTime = dateTime;
        this.status = status;
        this.reason = reason;
    }

    public String getId() {
        return id;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getClinicianId() {
        return clinicianId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getStatus() {
        return status;
    }

    public String getReason() {
        return reason;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setClinicianId(String clinicianId) {
        this.clinicianId = clinicianId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Appointment[id=" + id +
                ", patientId=" + patientId +
                ", clinicianId=" + clinicianId +
                ", facilityId=" + facilityId +
                ", dateTime=" + dateTime +
                ", status=" + status + "]";
    }
}
