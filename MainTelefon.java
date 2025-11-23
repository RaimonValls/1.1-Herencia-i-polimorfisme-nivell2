package ExerciciTelefon;

public class MainTelefon {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone("samsung","Galaxy S25");
        System.out.println(phone1);
        phone1.trucar("677565739");
        phone1.fotografiar();
        phone1.alarma();

    }
}
