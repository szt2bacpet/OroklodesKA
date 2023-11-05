package zoo;

public abstract class Animal {
    private String nev;
    private int kor;
    private String neme;
    private String hang;

    public Animal(String nev, int kor, String neme, String hang) {
        this.nev = nev;
        this.kor = kor;
        this.neme = neme;
        this.hang = hang;
    }

    public String getNev() {
        return nev;
    }

    public abstract void szaporodik();

    public void hangotAdKi() {
        System.out.println(nev + " hangot ad ki: " + hang);
    }

    public abstract void mozog();
}





