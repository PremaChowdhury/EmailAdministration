package emailapp;

public class EmailApp {

    public static void main(String[] args)
    {
        Email eml = new Email("John", "Smith");
        //eml.setMailboxCapacity();
        System.out.println(eml.showInfo());
    }
}
