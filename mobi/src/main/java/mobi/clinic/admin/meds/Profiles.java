package mobi.clinic.admin.meds;

import java.util.Scanner;

public class Profiles extends Admin {

    private String patientName;
    private String patientID;
    private String patientEmail;


    public Profiles(String patientName, String patientID, String patientEmail) {
        this.patientEmail = patientEmail;
        this.patientID = patientID;
        this.patientName = patientName;
    }

    public Profiles() {
    }


    public Object getPatient() {
        Profiles patient = null;
        return null;
    }


    public void setPatient(String patientNaming, String patientEmail, String patientID) {
        this.patientName = patientNaming;
        this.patientID = patientID;
        this.patientEmail = patientEmail;
    }


//    public String buildProfile() {
//        Scanner
//    }


}








































