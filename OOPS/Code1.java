class Pen {
    String colour;
    String type;

    public void write() {
        System.out.println("Writting something");
    }

    public void printColour() {

        // this keyword in JAVA. Whichever object calls the printColour() function it will refer the value of the colour variable that is accessed by that object.
        System.out.println("Colour of the pen is " + this.colour);
    }
}

public class Code1 {
    public static void main(String args[]) {

        Pen pen1 = new Pen();
        pen1.colour = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.colour = "red";
        pen2.type = "ballpoint";

        pen1.printColour();
        pen2.printColour();
    }
}