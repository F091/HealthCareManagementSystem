package app;

import model.DataLoader;

public class Main {

    public static void main(String[] args) {

        // Create the data loader
        DataLoader loader = new DataLoader();

        // Load all CSV data
        loader.loadAll();

        // Simple output to check data loaded correctly
        System.out.println("Patients loaded: " + loader.getPatients().size());
        System.out.println("Clinicians loaded: " + loader.getClinicians().size());
        System.out.println("Facilities loaded: " + loader.getFacilities().size());
        System.out.println("Appointments loaded: " + loader.getAppointments().size());
        System.out.println("Prescriptions loaded: " + loader.getPrescriptions().size());
        System.out.println("Referrals loaded: " + loader.getReferrals().size());
    }
}
