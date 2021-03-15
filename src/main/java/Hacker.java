import java.io.*;
import java.util.Scanner;


public class Hacker {
    public static void scanningfile (String combined, String secret) {

       int a = 0;
       if(combined == secret)
           a = 1;

        switch (a) {
            case 1:
                System.out.println("Congrats Hacker");
                break;
            default:
                System.out.println("Wrong password n00b");
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter Password pt.1 : ");
        String password = scan1.next();

        System.out.println("Enter Password pt.2 : ");
        int passnum = scan1.nextInt();

        System.out.println("Enter Password pt.3 : ");
        String passphrase = scan1.next();
        passphrase = passphrase + scan1.nextLine();

        System.out.println("Combined Password: " + password + passnum + passphrase);

        String Combinedpass = password + passnum + passphrase;

        // part 2 reading secret file
        File Secretfile = new File("src/main/java/Secret.txt");
        BufferedReader br = new BufferedReader(new FileReader(Secretfile));

        String st;
        while ((st = br.readLine()) != null);
        scanningfile(Combinedpass, st);

    }

}
