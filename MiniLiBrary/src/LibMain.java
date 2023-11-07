import java.util.ArrayList;
import java.util.Scanner;

public class LibMain {
    public static void main(String[] args) {
        System.out.println("Hello Library!");
        Scanner myScan = new Scanner(System.in);

        ArrayList<Book> bookList = new ArrayList<Book>();
        int bookAmount = 3;

        for (int i = 0; i < bookAmount; i++) {
            System.out.print("Name: ");
            String name = myScan.nextLine();
            System.out.print("Autthor: ");
            String auth = myScan.nextLine();
            System.out.print("Pages: ");
            int pages = Integer.parseInt(myScan.nextLine()); //for c# use TryParse
            Book myBook = new Book(name, auth, pages);
            bookList.add(myBook);
        }

        for (int i = 0; i < bookList.size(); i++) {
            Book myBook = bookList.get(i);
            System.out.println(myBook.getName());
        }

        bookList.add(1, new Book("LotR", "JRRT", 600));
        System.out.println("new order:");
        for (int i = 0; i < bookList.size(); i++) {
            Book myBook = bookList.get(i);
            System.out.println(myBook.getName());
        }
    }


    public void exampleArrayList() {
        String[] stringArray = new String[100];

        ArrayList<String> strArrList = new ArrayList<String>();

        String str1 = "hello";

        strArrList.add(str1);
        strArrList.add("World");
        strArrList.add("example");

        System.out.println("The ArrayList is " + strArrList.size());

        for (int i = 0; i < strArrList.size(); i++) {
            System.out.println(strArrList.get(i));
        }
    }
}