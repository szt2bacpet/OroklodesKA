package zoo;

public class Emlos extends Animal {
    public Emlos(String nev, int kor, String neme, String hang) {
        super(nev, kor, neme, hang);
    }

    @Override
    public void szaporodik() {
        System.out.println("Az emlősök élő utódokat hoznak létre.");
    }

    @Override
    public void mozog() {
        System.out.println("Az emlősök általában sétálnak vagy futnak.");
    }
}