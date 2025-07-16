package HW7;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        patient1.setName("Гоша");
        patient1.setSurname("Иванов");
        patient1.setTreatmentPlan(1);

        Patient patient2 = new Patient();
        patient2.setName("Федор");
        patient2.setSurname("Попкин");
        patient2.setTreatmentPlan(2);

        Patient patient3 = new Patient();
        patient3.setName("Вика");
        patient3.setSurname("Кузнецова");
        patient3.setTreatmentPlan(3);

        Therapist therapist = new Therapist("Пелагея", "Авхачева", 419);

        therapist.assignDoctor(patient1);
        therapist.assignDoctor(patient2);
        therapist.assignDoctor(patient3);

        Patient[] patients = {patient1, patient2, patient3};

        for (Patient patient : patients) {
            System.out.printf("Пациент: %s %s\n", patient.getName(), patient.getSurname());
            if (patient.getDoctor() != null) {
                Doctor d = patient.getDoctor();
                System.out.printf("Назначенный врач: %s %s %s каб. %d\n",
                        d.getName(),d.getSurname(),d.getJobTitle(), d.getCabinet());
                d.treat();
            } else {
                System.out.println("Пациенту не был назначен врач.");
            }
            System.out.println();
        }

    }

}
