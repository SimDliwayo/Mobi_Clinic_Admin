package mobi.clinic.admin;

import mobi.clinic.admin.meds.MedsManager;

public class Driver {
    public static void main(String[] args) {
        MedsManager manager = new MedsManager();
        manager.welcomeMenu();
    }
}
