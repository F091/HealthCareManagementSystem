package model;

public class Clinician {
// ---Fields---
// unique identifier for clinician
    private final String id;
    // full name of clinician
    private String name;
    // e.g.,  "doctor" etc
    private String role;
    // e.g., "cardiology" etc
    private String Specialty;
    // facility ID
    private String workplaceId;
    // contact email for clinician
    private String email;

    public Clinician(String id, String name, String role, String Specialty, String workplaceId, String email) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.Specialty = Specialty;
        this.workplaceId = workplaceId;
        this.email = email;

    }
 // getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public String getSpecialty() { return Specialty; }
    public String getWorkplaceId() { return workplaceId; }
    public String getEmail() { return email; }

//  setters
    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }
    public void setSpecialty(String Specialty) { this.Specialty = Specialty; }
    public void setWorkplaceId(String workplaceId) { this.workplaceId = workplaceId; }
    public void setEmail(String email) { this.email = email; }

//   methods
    @Override
    public String toString() {
        return "Clinician[id=" + id + ", name=" + name + ", role=" + role + ", Specialty=" + Specialty + ", workplaceId=" + workplaceId + "]";
    }



}
