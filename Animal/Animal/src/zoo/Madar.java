package zoo;

public class Madar extends Animal {
    public Madar(String nev, int kor, String neme, String hang) {
        super(nev, kor, neme, hang);
    }

    @Override
    public void szaporodik() {
        System.out.println("A madarak tojást raknak.");
    }

    @Override
    public void mozog() {
        System.out.println("A madarak repülhetnek vagy sétálhatnak.");
    }
}