public class KidUsers implements LibraryUser {


    int age;
    String bookType;

    public void registerAccount() {


        if (age < 12) {

            System.out.println("Sorry, Age must be less than 12 to register as a kid");

        }
    }

    public void requestBook() {
        if (bookType == "Kids") {
            System.out.println("Book Issued successfully, please return the book within 10 days ");

        }
    }

}
