package mobi.clinic.admin.meds;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedsManager {


    // The idea behind this list implementation is that the Admin needs to be able to have Admin privileges
    // to all departments so these subclasses will get some methods and properties from Admin class.
    private final ArrayList<Admin> adminProcesses = new ArrayList<>(List.of(
            new Medicines(),
            new Ambulances(),
            new ClinicBusyness()
    ));


    private final String[] clientUserMenu = {
            "View Medicine assigned to you.",
            "Want to request an Ambulance?",
            "Is your appointment nearing? Manage Your appointments",
            "Exit"
    };



    public void welcomeMenu() {
        System.out.println("Welcome to Mobi_Clinic...");
        boolean startProcess = false;
        while (!startProcess) {
            startProcess = clientUserMenu();
        }
        System.out.println("Goodbye see you soon!");
    }

    private boolean clientUserMenu() {
        showDepartments(false);
        return mainMenu();
    }

    private boolean mainMenu() {
        System.out.println("Main Menu");
        for (int i = 0; i < clientUserMenu.length; i++) {
            System.out.println("\t[" + (i + 1) + "] " + clientUserMenu[i] + "\n");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Select an option: ");
        int choice = scanner.nextInt();

        // Check if the user chooses to exit (assuming 0 is the exit option)
        if (choice == 4) {
            return true;
        }
        return false;
    }

    private void showDepartments(boolean displayOptions) {
        System.out.println();
        if(!displayOptions) {
            System.out.println("Choose Your Departments:");
        }
        for (int i = 0; i < getAdminProcesses().size(); i++) {
            if (displayOptions) {
                System.out.println("\t[");
                System.out.println(Integer.toString(i + 1));
                System.out.println("] ");
            }
        }

    }

    public ArrayList<Admin> getAdminProcesses() {
        return adminProcesses;
    }
}
