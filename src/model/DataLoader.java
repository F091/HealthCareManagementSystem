package model;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*
  DataLoader reads CSV files from the data folder and stores the data
  in arraylists of the model objects.

  Pattern used in each method:
  - open the file
  - skip header row
  - read each line
  - split line into columns
  - create an object
  - add to list
*/
public class DataLoader {

    private ArrayList<Patient> patients;
    private ArrayList<Clinician> clinicians;
    private ArrayList<Facility> facilities;
    private ArrayList<Appointment> appointments;
    private ArrayList<Prescription> prescriptions;
    private ArrayList<Referral> referrals;

    public DataLoader() {
        patients = new ArrayList<>();
        clinicians = new ArrayList<>();
        facilities = new ArrayList<>();
        appointments = new ArrayList<>();
        prescriptions = new ArrayList<>();
        referrals = new ArrayList<>();
    }

    // Call this once from Main (or your controller) to load everything
    public void loadAll() {
        loadPatients("data/patients.csv");
        loadClinicians("data/clinicians.csv");
        loadFacilities("data/facilities.csv");
        loadAppointments("data/appointments.csv");
        loadPrescriptions("data/prescriptions.csv");
        loadReferrals("data/referrals.csv");
    }

    // -------------------- Patients --------------------
    public void loadPatients(String filePath) {
        patients.clear();

        try {
            Scanner sc = new Scanner(new File(filePath));

            // header row
            if (sc.hasNextLine()) sc.nextLine();

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.trim().isEmpty()) continue;

                ArrayList<String> c = parseCsvLine(line);
                if (c.size() < 14) continue;

                Patient p = new Patient(
                        c.get(0).trim(),   // patient_id
                        c.get(1).trim(),   // first_name
                        c.get(2).trim(),   // last_name
                        c.get(3).trim(),   // date_of_birth
                        c.get(4).trim(),   // nhs_number
                        c.get(5).trim(),   // gender
                        c.get(6).trim(),   // phone_number
                        c.get(7).trim(),   // email
                        c.get(8).trim(),   // address
                        c.get(9).trim(),   // postcode
                        c.get(10).trim(),  // emergency_contact_name
                        c.get(11).trim(),  // emergency_contact_phone
                        c.get(12).trim(),  // registration_date
                        c.get(13).trim()   // gp_surgery_id
                );

                patients.add(p);
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Could not load patients file: " + filePath);
        }
    }

    // -------------------- Clinicians --------------------
    public void loadClinicians(String filePath) {
        clinicians.clear();

        try {
            Scanner sc = new Scanner(new File(filePath));
            if (sc.hasNextLine()) sc.nextLine();

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.trim().isEmpty()) continue;

                ArrayList<String> c = parseCsvLine(line);
                if (c.size() < 12) continue;

                Clinician cl = new Clinician(
                        c.get(0).trim(),   // clinician_id
                        c.get(1).trim(),   // first_name
                        c.get(2).trim(),   // last_name
                        c.get(3).trim(),   // title
                        c.get(4).trim(),   // speciality
                        c.get(5).trim(),   // gmc_number
                        c.get(6).trim(),   // phone_number
                        c.get(7).trim(),   // email
                        c.get(8).trim(),   // workplace_id
                        c.get(9).trim(),   // workplace_type
                        c.get(10).trim(),  // employment_status
                        c.get(11).trim()   // start_date
                );

                clinicians.add(cl);
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Could not load clinicians file: " + filePath);
        }
    }

    // -------------------- Facilities -------------
    public void loadFacilities(String filePath) {
        facilities.clear();

        try {
            Scanner sc = new Scanner(new File(filePath));
            if (sc.hasNextLine()) sc.nextLine();

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.trim().isEmpty()) continue;

                ArrayList<String> c = parseCsvLine(line);
                if (c.size() < 11) continue;

                int capacity = toInt(c.get(9).trim());

                Facility f = new Facility(
                        c.get(0).trim(),   // facility_id
                        c.get(1).trim(),   // facility_name
                        c.get(2).trim(),   // facility_type
                        c.get(3).trim(),   // address
                        c.get(4).trim(),   // postcode
                        c.get(5).trim(),   // phone_number
                        c.get(6).trim(),   // email
                        c.get(7).trim(),   // opening_hours
                        c.get(8).trim(),   // manager_name
                        capacity,          // capacity (int)
                        c.get(10).trim()   // specialities_offered
                );

                facilities.add(f);
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Could not load facilities file: " + filePath);
        }
    }

    // -------------------- Appointments -------------
    public void loadAppointments(String filePath) {
        appointments.clear();

        try {
            Scanner sc = new Scanner(new File(filePath));
            if (sc.hasNextLine()) sc.nextLine();

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.trim().isEmpty()) continue;

                ArrayList<String> c = parseCsvLine(line);
                if (c.size() < 13) continue;

                Appointment a = new Appointment(
                        c.get(0).trim(),   // appointment_id
                        c.get(1).trim(),   // patient_id
                        c.get(2).trim(),   // clinician_id
                        c.get(3).trim(),   // facility_id
                        c.get(4).trim(),   // appointment_date
                        c.get(5).trim(),   // appointment_time
                        c.get(6).trim(),   // duration_minutes
                        c.get(7).trim(),   // appointment_type
                        c.get(8).trim(),   // status
                        c.get(9).trim(),   // reason_for_visit
                        c.get(10).trim(),  // notes
                        c.get(11).trim(),  // created_date
                        c.get(12).trim()   // last_modified
                );

                appointments.add(a);
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Could not load appointments file: " + filePath);
        }
    }

    // ---------------- Prescriptions ---------------
    public void loadPrescriptions(String filePath) {
        prescriptions.clear();

        try {
            Scanner sc = new Scanner(new File(filePath));
            if (sc.hasNextLine()) sc.nextLine();

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.trim().isEmpty()) continue;

                ArrayList<String> c = parseCsvLine(line);
                if (c.size() < 15) continue;

                Prescription p = new Prescription(
                        c.get(0).trim(),   // prescription_id
                        c.get(1).trim(),   // patient_id
                        c.get(2).trim(),   // clinician_id
                        c.get(3).trim(),   // appointment_id
                        c.get(4).trim(),   // prescription_date
                        c.get(5).trim(),   // medication_name
                        c.get(6).trim(),   // dosage
                        c.get(7).trim(),   // frequency
                        c.get(8).trim(),   // duration_days
                        c.get(9).trim(),   // quantity
                        c.get(10).trim(),  // instructions
                        c.get(11).trim(),  // pharmacy_name
                        c.get(12).trim(),  // status
                        c.get(13).trim(),  // issue_date
                        c.get(14).trim()   // collection_date
                );

                prescriptions.add(p);
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Could not load prescriptions file: " + filePath);
        }
    }

    // --------------- Referrals -----------
    public void loadReferrals(String filePath) {
        referrals.clear();

        try {
            Scanner sc = new Scanner(new File(filePath));
            if (sc.hasNextLine()) sc.nextLine();

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.trim().isEmpty()) continue;

                ArrayList<String> c = parseCsvLine(line);
                if (c.size() < 16) continue;

                Referral r = new Referral(
                        c.get(0).trim(),   // referral_id
                        c.get(1).trim(),   // patient_id
                        c.get(2).trim(),   // referring_clinician_id
                        c.get(3).trim(),   // referred_to_clinician_id
                        c.get(4).trim(),   // referring_facility_id
                        c.get(5).trim(),   // referred_to_facility_id
                        c.get(6).trim(),   // referral_date
                        c.get(7).trim(),   // urgency_level
                        c.get(8).trim(),   // referral_reason
                        c.get(9).trim(),   // clinical_summary
                        c.get(10).trim(),  // requested_investigations
                        c.get(11).trim(),  // status
                        c.get(12).trim(),  // appointment_id
                        c.get(13).trim(),  // notes
                        c.get(14).trim(),  // created_date
                        c.get(15).trim()   // last_updated
                );

                referrals.add(r);
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Could not load referrals file: " + filePath);
        }
    }

    // ---------------- Getters ---------
    public ArrayList<Patient> getPatients() { return patients; }
    public ArrayList<Clinician> getClinicians() { return clinicians; }
    public ArrayList<Facility> getFacilities() { return facilities; }
    public ArrayList<Appointment> getAppointments() { return appointments; }
    public ArrayList<Prescription> getPrescriptions() { return prescriptions; }
    public ArrayList<Referral> getReferrals() { return referrals; }

    // --------------- Small helper -----------

    /*
      Splits CSV line into columns and keeps commas inside quotes together.
      Example: " 123 Oak Street, Birmingham " stays as one column.
    */
    private ArrayList<String> parseCsvLine(String line) {
        ArrayList<String> cols = new ArrayList<>();

        String current = "";
        boolean inQuotes = false;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch == '"') {
                inQuotes = !inQuotes;
            } else if (ch == ',' && !inQuotes) {
                cols.add(current);
                current = "";
            } else {
                current += ch;
            }
        }

        cols.add(current);
        return cols;
    }

    // Converts text to int safely (if fails, just return 0).
    private int toInt(String text) {
        try {
            return Integer.parseInt(text);
        } catch (Exception e) {
            return 0;
        }
    }
}

