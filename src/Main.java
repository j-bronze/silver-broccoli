
public class Main {
    public static void main(String[] args) {

        String  myInitialString = "My name is Broccoli.";
        System.out.println(myInitialString);
        processString(myInitialString);

        NewClass initialString = new NewClass();
        initialString.str = "My initial value";
        processNewClass(initialString);
        System.out.println(initialString);
    }
    public static void processString(String string){
        string += " Hello!!!!!!!!!!";
        System.out.println(string);
    }

    public static void processNewClass(NewClass string){
        string.str += " bububu. I've been changed.";
    }

}