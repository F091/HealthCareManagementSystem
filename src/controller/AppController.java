package controller;

import model.DataLoader;

public class AppController {

    private final DataLoader loader;

    public AppController() {
        loader = new DataLoader();
        loader.loadAll();
    }

    public DataLoader getLoader() {
        return loader;
    }
}
