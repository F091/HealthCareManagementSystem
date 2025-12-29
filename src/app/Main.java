package app;

import model.DataLoader;
import view.MainView;

public class Main {

    public static void main(String[] args) {

        // Load CSV data first
        DataLoader loader = new DataLoader();
        loader.loadAll();

        // Start the GUI
        MainView view = new MainView(loader);
        view.setVisible(true);
    }
}
