import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Down Town Hotel And Casino");
        System.out.println("=====================================");
        System.out.println(" ");
        System.out.println(" ");


        System.out.println("To Get Services Please Register to the System");
        System.out.println(" ");
        System.out.println("1. Log in to system");
        System.out.println("2. Exit from System");


        System.out.println("Enter Your Choice : ");
        int choice = sc.nextInt();
        System.out.println(" ");

        if (choice==1){

            System.out.println((" "));
            System.out.println("Please Enter your Full Name : ");
            String FullName = sc.next();
            System.out.println("Please Enter Your ID Number : ");
            String IdNumber = sc.next();
            customer customer = new customer(FullName,IdNumber);
            menu DisplayMenu = new menu();
            DisplayMenu.PrintMenu();
            System.out.println("Enter Your Choice : ");
            int Choice2 = sc.nextInt();

            if (Choice2 == 1){
                System.out.println("View Available Rooms");
                System.out.println("====================");
                System.out.println(" ");
                room availableRoom = new room();
                availableRoom.available();
                System.out.println(" ");
                System.out.println("If You Need To Allocate Room Press 1 :");
                System.out.println("If You Need To Exit System Press 2 :");
                System.out.println(" ");
                System.out.println("Enter Your Choose : ");
                int Choice3 = sc.nextInt();

                if(Choice3 ==1){
                    allocateRoom allocation = new allocateRoom();
                    System.out.println("Please Enter Room Number You Want : ");
                    int roomNo = sc.nextInt();
                    allocation.allocate(roomNo);


                }if(Choice3 ==2){
                    exit exitSystem = new exit();
                    exitSystem.ExitSys();
                }

            }if (Choice2 == 2){

                room availableRoom = new room();
                availableRoom.available();
                allocateRoom allocation = new allocateRoom();
                System.out.println("Please Enter Room Number You Want : ");
                int roomNo = sc.nextInt();
                allocation.allocate(roomNo);
                System.out.println("If You Want To Generate a Bill Please Press 1:");
                System.out.println("If You Want to exit from System please enter 2 :");



            }if(Choice2==3){
                System.out.println("Change/ Delete Room Allocation for a Guest");
            }if(Choice2==4){
                System.out.println("Check - in to a Room & Checkout from a Room");
                System.out.println(" ");
                System.out.println("Please Enter CHECK - IN Month : ");
                int month = sc.nextInt();
                System.out.println("Please Enter CHECK - IN Date : ");
                int day = sc.nextInt();
                System.out.println(" ");

                System.out.println("Please Enter CHECK - OUT Month : ");
                int monthOut = sc.nextInt();
                System.out.println("Please Enter CHECK - OUT Date : ");
                int dayOut = sc.nextInt();
                date calDate = new date();
                calDate.storeData(month,day,monthOut,dayOut);
                System.out.println(" ");
                System.out.println("If You Need to Generate Bill For You Please Press 1: ");
                System.out.println("If You Need to Exist from System Please Press 2: ");
                System.out.println(" ");
                System.out.println("Please Enter Your Choice : ");
                int choice4 = sc.nextInt();
                if(choice4 == 1){
                    generateBill genBill = new generateBill();
                    genBill.calculateBill();
                }if(choice4 == 2){
                    exit exitSystem = new exit();
                    exitSystem.ExitSys();
                }

            }if(Choice2 ==5){
                exit exitSystem = new exit();
                exitSystem.ExitSys();
            }


        }if (choice==2){
            exit exitSystem = new exit();
            exitSystem.ExitSys();
        }
    }
}