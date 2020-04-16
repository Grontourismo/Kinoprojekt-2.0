package sample;

public class Film {
    private String filname;
    private short fsk;
    private short price;
    private String shortDescription;

    public Film(String filname, short fsk, short prince, String shortDescription) {
        this.filname = filname;
        this.fsk = fsk;
        this.price = prince;
        this.shortDescription = shortDescription;
    }

    public String getFilname() {
        return filname;
    }

    public short getFsk() {
        return fsk;
    }

    public short getPrice() {
        return price;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
