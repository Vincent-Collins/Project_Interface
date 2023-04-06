public class AdultUsers implements LibraryUser{
    int age;
    String bookType;



    public void registerAccount() {
        if(age>12){

            System.out.print("You have successfully registered under an Adult Account");


        }
    }

    public void requestBook() {
        if(bookType=="Fiction"){

            System.out.print("Book Issued successfully, please return the book within 7 days");

        }else{
            System.out.println("Oops, you are allowed to take only adult books");
        }
    }



}
