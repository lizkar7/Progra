package HW7;

public class Surgeon extends Doctor{
    public Surgeon(String name, String surname, int cabinet){
        setName(name);
        setSurname(surname);
        setJobTitle("Хирург");
        setCabinet(cabinet);
    }

    public void treat(){
        System.out.println("Хирург проводит операцию.");
    }
}

