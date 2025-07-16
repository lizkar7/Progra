package HW7;

public class Patient {
    private String Name;
    private String Surname;
    private int treatmentPlan;
    private Doctor doctor;

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Doctor setDoctor(Doctor doctor) {
        this.doctor = doctor;
        return doctor;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
