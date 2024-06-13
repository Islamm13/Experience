package lesson13.association;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    private List<Member> members;

    public Library(){
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }

    public void addMember(Member member){
        members.add(member);
    }
    public void removeMember(Member member){
        members.remove(member);
    }
    public void displayBooks(){
        System.out.println("Books available in the library:");
        for (Book book : books){
            System.out.println(book);
        }
    }
    public void displayMember(){
        System.out.println("Member registered in the library:");
        for (Member member : members){
            System.out.println(member);
        }
    }

}
