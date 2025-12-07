package model;

public class Clinician {

    private String id;
    private String firstName;
    private String lastName;
    private String title;
    private String speciality;
    private String gmcNumber;
    private String phone;
    private String email;
    private String workplaceId;
    private String workplaceType;
    private String employmentStatus;
    private String startDate;


    public Clinician(
            String id,
            String firstName,
            String lastName,
            String title,
            String speciality,
            String gmcNumber,
            String phone,
            String email,
            String workplaceId,
            String workplaceType,
            String employmentStatus,
            String startDate
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.speciality = speciality;
        this.gmcNumber = gmcNumber;
        this.phone = phone;
        this.email = email;
        this.workplaceId = workplaceId;
        this.workplaceType = workplaceType;
        this.employmentStatus = employmentStatus;
        this.startDate = startDate;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return title + " " + firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return getFullName() + " (" + speciality + ")";
    }
}
