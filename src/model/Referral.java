package model;

public class Referral {

    private String id;
    private String patientId;
    private String fromClinicianId;
    private String toClinicianId;
    private String fromFacilityId;
    private String toFacilityId;
    private String referralDate;
    private String urgencyLevel;
    private String referralReason;
    private String clinicalSummary;
    private String requestedInvestigations;
    private String status;
    private String appointmentId;
    private String notes;
    private String createdDate;
    private String lastUpdated;

    public Referral(
            String id,
            String patientId,
            String fromClinicianId,
            String toClinicianId,
            String fromFacilityId,
            String toFacilityId,
            String referralDate,
            String urgencyLevel,
            String referralReason,
            String clinicalSummary,
            String requestedInvestigations,
            String status,
            String appointmentId,
            String notes,
            String createdDate,
            String lastUpdated
    ) {
        this.id = id;
        this.patientId = patientId;
        this.fromClinicianId = fromClinicianId;
        this.toClinicianId = toClinicianId;
        this.fromFacilityId = fromFacilityId;
        this.toFacilityId = toFacilityId;
        this.referralDate = referralDate;
        this.urgencyLevel = urgencyLevel;
        this.referralReason = referralReason;
        this.clinicalSummary = clinicalSummary;
        this.requestedInvestigations = requestedInvestigations;
        this.status = status;
        this.appointmentId = appointmentId;
        this.notes = notes;
        this.createdDate = createdDate;
        this.lastUpdated = lastUpdated;
    }

    public String getId() {
        return id;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getFromClinicianId() {
        return fromClinicianId;
    }

    public String getToClinicianId() {
        return toClinicianId;
    }

    public String getUrgencyLevel() {
        return urgencyLevel;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Referral " + id + " for patient " + patientId
                + " (urgency: " + urgencyLevel + ", status: " + status + ")";
    }
}
