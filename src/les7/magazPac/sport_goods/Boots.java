package sport_goods;

/**
 * Created by java on 19.01.2018.
 */
public class Boots {
    private String brend;
    private int size;
    private int prise;

    public Boots() {
    }

    public Boots(String brend) {
        this.brend = brend;
    }

    public Boots(int size, String brend) {
        this.size = size;
        this.brend = brend;
    }

    public Boots(String brend, int prise, int size) {
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
