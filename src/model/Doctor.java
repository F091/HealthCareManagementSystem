package model;

// A doctor is a specific type of Clinician
public class Doctor extends Clinician {

    public Doctor(String id,
                  String name,
                  String specialty,
                  String workplaceId,
                  String email) {

        // "Doctor" is the fixed role for this subclass
        super(id, name, "Doctor", specialty, workplaceId, email);
    }
}