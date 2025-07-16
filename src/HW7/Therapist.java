package HW7;

public class Therapist extends Doctor {
    public Therapist(String name, String surname, int cabinet){
        setName(name);
        setSurname(surname);
        setJobTitle("Терапевт");
        setCabinet(cabinet);
    }

    public void treat() {
        System.out.println("Терапевт лечит от простуды.");
    }

    public void assignDoctor(Patient patient) {
        Doctor doctor = null;

        int code = patient.getTreatmentPlan();

        if (code >= 0) {
            if (code == 1) {
                doctor = new Surgeon("Мария","Федотова", 512);
            } else if (code == 2) {
                doctor = new Dentist("Иван", "Лабутин", 613);
            } else if (code >= 3) {
                doctor = new Therapist("Пелагея","Авхачева",419);
            }
        }

        if(doctor!=null){
            patient.setDoctor(doctor);
        }

    }
}
