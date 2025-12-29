package view;

import model.DataLoader;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/*
  Simple Swing GUI to show loaded data.
  Uses tabs and lists to keep it clear and easy to explain.
*/
public class MainView extends JFrame {

    private final DataLoader loader;

    private final JTabbedPane tabs;

    // Lists for each tab
    private final JList<String> patientsList;
    private final JList<String> cliniciansList;
    private final JList<String> appointmentsList;
    private final JList<String> prescriptionsList;

    // Models (the data behind each list)
    private final DefaultListModel<String> patientsModel;
    private final DefaultListModel<String> cliniciansModel;
    private final DefaultListModel<String> appointmentsModel;
    private final DefaultListModel<String> prescriptionsModel;

    public MainView(DataLoader loader) {
        this.loader = loader;

        setTitle("Healthcare Management System");
        setSize(900, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout with padding (just makes it look nicer)
        JPanel root = new JPanel(new BorderLayout());
        root.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(root);

        // Top: simple status text
        JLabel status = new JLabel("Data loaded successfully. Choose a tab and select an item.");
        root.add(status, BorderLayout.NORTH);

        // Centre: tabs
        tabs = new JTabbedPane();

        patientsModel = new DefaultListModel<>();
        cliniciansModel = new DefaultListModel<>();
        appointmentsModel = new DefaultListModel<>();
        prescriptionsModel = new DefaultListModel<>();

        patientsList = new JList<>(patientsModel);
        cliniciansList = new JList<>(cliniciansModel);
        appointmentsList = new JList<>(appointmentsModel);
        prescriptionsList = new JList<>(prescriptionsModel);

        tabs.addTab("Patients", new JScrollPane(patientsList));
        tabs.addTab("Clinicians", new JScrollPane(cliniciansList));
        tabs.addTab("Appointments", new JScrollPane(appointmentsList));
        tabs.addTab("Prescriptions", new JScrollPane(prescriptionsList));

        root.add(tabs, BorderLayout.CENTER);

        // Bottom: one button = interactive but simple
        JButton viewSelectedBtn = new JButton("View Selected");
        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottom.add(viewSelectedBtn);
        root.add(bottom, BorderLayout.SOUTH);

        // Fill the lists from the loaded data
        loadListData();

        // Button action: show details for whatever is selected
        viewSelectedBtn.addActionListener(e -> showSelectedDetails());
    }

    /*
      Loads the list text from the objects already loaded by DataLoader.
      We keep it simple: we store a shortened version of toString().
    */
    private void loadListData() {
        patientsModel.clear();
        for (int i = 0; i < loader.getPatients().size(); i++) {
            patientsModel.addElement(makeSummary(loader.getPatients().get(i).toString()));
        }

        cliniciansModel.clear();
        for (int i = 0; i < loader.getClinicians().size(); i++) {
            cliniciansModel.addElement(makeSummary(loader.getClinicians().get(i).toString()));
        }

        appointmentsModel.clear();
        for (int i = 0; i < loader.getAppointments().size(); i++) {
            appointmentsModel.addElement(makeSummary(loader.getAppointments().get(i).toString()));
        }

        prescriptionsModel.clear();
        for (int i = 0; i < loader.getPrescriptions().size(); i++) {
            prescriptionsModel.addElement(makeSummary(loader.getPrescriptions().get(i).toString()));
        }
    }

    /*
      Makes list entries readable by cutting very long strings.
      This is just for display; the full object is still available.
    */
    private String makeSummary(String text) {
        int max = 70;
        if (text.length() <= max) return text;
        return text.substring(0, max) + "...";
    }

    /*
      Shows a popup with the full details of the selected item.
      Uses the tab to decide which list we are reading from.
    */
    private void showSelectedDetails() {
        int tabIndex = tabs.getSelectedIndex();

        if (tabIndex == 0) { // Patients
            int idx = patientsList.getSelectedIndex();
            if (idx < 0) {
                showMessage("Please select a patient first.");
                return;
            }
            showMessage(loader.getPatients().get(idx).toString());
        }

        if (tabIndex == 1) { // Clinicians
            int idx = cliniciansList.getSelectedIndex();
            if (idx < 0) {
                showMessage("Please select a clinician first.");
                return;
            }
            showMessage(loader.getClinicians().get(idx).toString());
        }

        if (tabIndex == 2) { // Appointments
            int idx = appointmentsList.getSelectedIndex();
            if (idx < 0) {
                showMessage("Please select an appointment first.");
                return;
            }
            showMessage(loader.getAppointments().get(idx).toString());
        }

        if (tabIndex == 3) { // Prescriptions
            int idx = prescriptionsList.getSelectedIndex();
            if (idx < 0) {
                showMessage("Please select a prescription first.");
                return;
            }
            showMessage(loader.getPrescriptions().get(idx).toString());
        }
    }

    private void showMessage(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }
}
