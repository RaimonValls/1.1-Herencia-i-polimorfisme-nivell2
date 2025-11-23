package ExerciciTelefon;

public class Telefon {
    private String marca;
    private String model;

    public Telefon(String marca,String model) {
        this.marca = marca;
        this.model = model;
    }
    public String getMarca() {
        return marca;
    }
    public String getModel() {
        return model;
    }
    public void trucar(String numTelefon){
        System.out.println("S'està trucant al número: "+numTelefon);
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
