import java.util.*;


public class Main {


    public static void main(String[] args) {

        KidUsers kidU = new KidUsers();

        AdultUsers adultU = new AdultUsers();






        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int num = sc.nextInt();

        if (num < 12) {
            kidU.registerAccount();

            if (num > 12) {
                adultU.registerAccount();


            }
        }


            System.out.println("Enter book type");
            String bk = sc.nextLine();
            if (bk == "Kids") {

                kidU.requestBook();
            }
                if(bk=="Fiction"){

                    adultU.requestBook();



                }

        }


    }
