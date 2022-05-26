package BooksFromFile;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class BooksFromFile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();

        System.out.println("enter book title:");
        String title = scanner.nextLine();
        System.out.println("enter release year:");
        int year = parseInt(scanner.nextLine());
        System.out.println("enter pages");
        int pages = parseInt(scanner.nextLine());
        System.out.println("enter author name");
        String name = scanner.nextLine();


    }

    public static List<Book> readBooks(String file){
        ArrayList<Book> books = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 4)
                    //params - str name, int pubyear, int pagecount, str author
                    .map(param -> new Book(param[0], Integer.valueOf(param[1]), Integer.valueOf(param[2]), param[3]))
                    .forEach(book -> books.add(book));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());;
        }
        return books;
    }
}
