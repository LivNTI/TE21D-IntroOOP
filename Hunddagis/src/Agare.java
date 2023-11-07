public class Agare {
    String namn;
    int tel;
    Hund hund;

    public Agare(String namn, int tel) {
        this.namn = namn;
        this.tel = tel;
    }

    public Hund addHund() {
        Hund dog = new Hund("Spot", this);
        hund = dog;
        return hund;

    }

}
