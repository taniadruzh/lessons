package les7_19_01_18.sport_goods;

/**
 * Created by java on 19.01.2018.
 */
public class Dress {
    private String brend;
    private int size;
    private int prise;

    public Dress() {
    }

    public Dress(String brend) {
        this.brend = brend;
    }

    public Dress(int size, String brend) {
        this.size = size;
        this.brend = brend;
    }

    public Dress(String brend, int prise, int size) {
        this.brend = brend;
        this.prise = prise;
        this.size = size;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }
}
