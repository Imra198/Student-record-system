import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInteraction {

    public static void main(String[] args)  {

        Node n0 = new Node(0, 123432, "Bob", "Marley", 18, "BSc Computer Science");
        Node n1 = new Node(1, 666666, "Louis", "Cyphre", 20, "BSc Software Engineering");
        Node n2 = new Node(2, 765239, "Gabrielle", "Angela", 21, "BSc Cyber Security");
        Node n3 = new Node(3, 905938, "Muhammed", "Ali", 32, "MEng Computer Engineering");
        Node n4 = new Node(4, 232591, "Gabor", " Capek", 20, "BA Games Design");
        Node n5 = new Node(5, 443820, "Srinivasa", " Ramanujan", 19, "BA Machine Learning");

        Node n6 = new Node();
        Scanner io = new Scanner(System.in);
        n6.setID(6);

        System.out.println("Please enter Student ID");
        int StudentID = io.nextInt();
        n6.setStudentID(StudentID);

        System.out.println("Please enter first name");
        String firstname = io.next();
        n6.setFirstname(firstname);

        System.out.println("Please enter surname");
        String surname = io.next();
        n6.setSurname(surname);

        System.out.println("Please enter age");
        int age = io.nextInt();
        n6.setAge(age);

        System.out.println("Please enter study programme");
        String programme = io.next();
        n6.setProgramme(programme);

        Server server = new Server(7);

        server.add(n0);
        server.add(n1);
        server.add(n2);
        server.add(n3);
        server.add(n4);
        server.add(n5);
        server.add(n6);

        System.out.println(server.toString());




    }



}
