package model;

// A specialist clinician with a defined specialty
public class Specialist extends Clinician {

    public Specialist(String id,
                      String name,
                      String specialty,
                      String workplaceId,
                      String email) {

        super(id, name, "Specialist", specialty, workplaceId, email);
    }
}
