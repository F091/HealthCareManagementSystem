package model;

public class Appointment {

    private String id;
    private String patientId;
    private String clinicianId;
    private String facilityId;
    private String date;
    private String time;
    private String durationMinutes;
    private String type;
    private String status;
    private String reasonForVisit;
    private String notes;
    private String createdDate;
    private String lastModified;

    public Appointment(
            String id,
            String patientId,
            String clinicianId,
            String facilityId,
            String date,
            String time,
            String durationMinutes,
            String type,
            String status,
            String reasonForVisit,
            String notes,
            String createdDate,
            String lastModified
    ) {
        this.id = id;
        this.patientId = patientId;
        this.clinicianId = clinicianId;
        this.facilityId = facilityId;
        this.date = date;
        this.time = time;
        this.durationMinutes = durationMinutes;
        this.type = type;
        this.status = status;
        this.reasonForVisit = reasonForVisit;
        this.notes = notes;
        this.createdDate = createdDate;
        this.lastModified = lastModified;
    }

    public String getId() {
        return id;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Appointment " + id + " on " + date + " at " + time;
    }
}
