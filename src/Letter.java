public class Letter {
    /** Prints out a complete letter by printing the greeting,
     Followed by the special message, followed by the closing */

    private String fromWho;
    public Letter(String from)
    {
        fromWho = from;
    }

    public void writeLetter(String name)
    {
        greeting(name);
        specialMessage();
        closing();
    }

    public void greeting(String name)
    {
        System.out.println("Hello, " + name + "!");
    }

    public void specialMessage()
    {
        System.out.println("Java is pretty cool, wouldn’t you say?");
    }

    public void closing()
    {
        System.out.println("From, " + fromWho);
    }
}