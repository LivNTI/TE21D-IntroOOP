public class Main {
    public static void main(String[] args) {

        Agare owner = new Agare("Bo", 45678);
        Hund dog = owner.addHund();

        System.out.println(owner.namn + "s hund heter " + owner.hund.name);
        System.out.println(dog.name + "s owner has phoneno " + dog.agare.tel);


    }
}
