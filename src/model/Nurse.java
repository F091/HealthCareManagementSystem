package model;

// A nurse is also a Clinician
public class Nurse extends Clinician {

    public Nurse(String id,
                 String name,
                 String workplaceId,
                 String email) {

        // Nurses may not always have a specialty, so we pass ""
        super(id, name, "Nurse", "", workplaceId, email);
    }
}