package UI;
import java.util.Scanner;
import Auth.SqlLite;
import Auth.Handlers.AdminAuthHandler;
import Auth.Handlers.AuthHandler;
import Auth.Handlers.UserAuthHandler;
import Auth.Models.Admin;
import Auth.Models.User;

public class MainMenuView {
    public static void displayAuthMenu() {
        SqlLite.createTables();
        AuthHandler auth;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Admin login \n 2. User login \n 3. Register User account \n 4. Exit program");
        System.out.println("Input your desired login panel: ");
        int option = sc.nextInt();
        
        if (option == 1) {
            System.out.println("Enter your email: ");
            String email = sc.next();
            System.out.println("Enter your password: ");
            String password = sc.next();
            auth = new AdminAuthHandler();
            if (auth.login(email, password)) {
                System.out.println("Login successful");
                Admin admin = (Admin) auth.getUserInfo(email);
                admin.adminPanel();
            } else {
                System.out.println("Login failed");
            }
        } else if (option == 2) {
            System.out.println("Enter your email: ");
            String email = sc.next();
            System.out.println("Enter your password: ");
            String password = sc.next();
            auth = new UserAuthHandler();
            if (auth.login(email, password)) {
                System.out.println("Login successful");
                User user = (User) auth.getUserInfo(email);
                user.userPanel();
            } else {
                System.out.println("Login failed");
            }
        } else if (option == 3) {
            System.out.println("Enter your name: ");
            String name = sc.next();
            System.out.println("Enter your email: ");
            String email = sc.next();
            System.out.println("Enter your password: ");
            String password = sc.next();
            auth = new UserAuthHandler();
            if (auth.Register(name, email, password)) {
                System.out.println("Registration successful");
            } else {
                System.out.println("Registration failed");
            }
        }else if (option == 4 ){
            System.out.println("Exiting program!");
            System.exit(0);
        } 
        else {
            System.out.println("Invalid option");
            displayAuthMenu();
        }
        sc.close();
    }
    public static void showServices(){
        String option;
        System.out.println("Avaliable Services:");
        System.out.println("1. Mobile Recharge Service \n2. Internet Recharge Service \n3. Landline Recharge Service \n4. Donations Services\n5.search for a service\n 6.exit Menu");
        System.out.println("Choose a Service: ");
        Scanner sc = new Scanner(System.in);
        option = sc.next();
        if(option == "1"){
            System.out.print("Showing the avaliable Mobile providers");
        }
        else if(option == "2"){
            System.out.print("Showing the avaliable Internet providers");
        }
        else if(option == "3"){
            System.out.print("Showing the avaliable Landline providers");
        }
        else if(option == "4"){
            System.out.print("Showing the avaliable NGO(s)");
        }
        else if(option == "5"){
            System.out.println("");
        }
        else if(option == "6"){
            System.out.println("Going Back!");
            User.UserOptionsMenu();
        }
        else{
            System.out.println("Invalid option!");
        }

        
    }

}