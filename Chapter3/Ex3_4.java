package Chapter3;

public class Ex3_4 {
    public static void main(String[] args) {
        /*
        *  (Random month) Write a program that randomly generates an integer between 1 and 12 and
        *  displays the English month names January, February, . . . , December for
        *  the numbers 1, 2, . . . , 12, accordingly.
        * */
        int number = (int)(Math.random() * 12);
        switch (number) {
            case 0: System.out.println("January"); break;
            case 1: System.out.println("February"); break;
            case 2: System.out.println("March"); break;
            case 3: System.out.println("April"); break;
            case 4: System.out.println("May"); break;
            case 5: System.out.println("June"); break;
            case 6: System.out.println("July"); break;
            case 7: System.out.println("August"); break;
            case 8: System.out.println("September"); break;
            case 9: System.out.println("October"); break;
            case 10: System.out.println("November"); break;
            case 11: System.out.println("December");
        }
    }
}
