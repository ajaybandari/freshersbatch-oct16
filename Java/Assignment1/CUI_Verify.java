import java.util.*;

public class CUI_Verify {
    public static void profileVerify(String u_name, String u_pass, String name, String password) {
        int i;
        Scanner scan = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            if ((u_name.equals(name)) && (u_pass.equals(password))) {
                System.out.println("Welcome " + u_name);
                break;
            } else if (i == 2) {
                System.out.println("");
                System.out.println("Contact Admin");
                break;
            } else {
                System.out.println("");
                System.out.println("Wrong Password or Username");
                System.out.println("Enter Username");
                u_name = scan.nextLine();
                System.out.println("Enter Password");
                u_pass = scan.nextLine();
                continue;
            }
        }
    }

    public static void main(String[] args) {
        String name = "Saneeth";
        String password = "Banik";
        String u_name;
        String u_pass;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        u_name = sc.nextLine();
        System.out.println("Enter password");
        u_pass = sc.nextLine();
        System.out.println("");
        profileVerify(u_name, u_pass, name, password);

    }
}
