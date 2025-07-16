package HW7;

public class Dentist extends Doctor{
    public Dentist(String name, String surname, int cabinet){
        setName(name);
        setSurname(surname);
        setJobTitle("Дантист");
        setCabinet(cabinet);
    }

    public void treat(){
        System.out.println("Дантист лечит зуб.");
    }
}

