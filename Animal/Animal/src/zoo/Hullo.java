package zoo;

public class Hullo extends Animal {
    public Hullo(String nev, int kor, String neme, String hang) {
        super(nev, kor, neme, hang);
    }

    @Override
    public void szaporodik() {
        System.out.println("A hüllők tojást raknak.");
    }

    @Override
    public void mozog() {
        System.out.println("A hüllők általában másznak vagy csúsznak.");
    }
}