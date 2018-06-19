import model.Gear;

public class Java {
    public static void main(String[] args) {
        Gear shimano  = new Gear();
        shimano.setModel("Shimano");
        shimano.setSize(5);

        Gear irani = new Gear();
        irani.setModel("Iran docharkh");
        irani.setSize(6);

        System.out.println(shimano.getSize());
        System.out.println(irani.getModel() + " = " + irani.getSize());
    }
}
