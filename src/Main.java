import lesson13.composition.House;
import lesson13.composition.Room;

public class Main {
    public static void main(String[] args) {


//        Book book = new Book("Heyat","Insan");
//
//        Member member = new Member("Islam");
//
//        Library library = new Library();
//
//        library.addBook(book);
//
//        library.addMember(member);
//
//        System.out.println("Books");
//
//        library.displayBooks();
//
//        System.out.println("Member");
//
//        library.displayMember();


//        Universty universty = new Universty(" Programmer University");
//
//        Department department =new Department("Java");
//        Department department1 =new Department("C#");
//
//        universty.addDepartment(department);
//        universty.addDepartment(department1);
//
//        universty.displayDepartments();


        House house =new House("Room");
        Room room =new Room(90,"Studio");
        house.addRoom(room);
        house.displayRooms();





    }

}