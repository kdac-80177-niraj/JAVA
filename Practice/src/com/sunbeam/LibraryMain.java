package com.sunbeam;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		List<Books> list = new ArrayList<>();
		List<Library> lib = new ArrayList<>();
		do {
			System.out.println("0. Exit.");
			System.out.println("1. Add Book To List.");
			System.out.println("2. Display Books From List.");
			System.out.println("3. Display Specific Book From List.");
			System.out.println("4. Delete Specific Book.");
			System.out.println("5. Sort Books on Book Name.");
			System.out.println("6. Display books in reverse order.");
			System.out.println("7. Modify book.");
			System.out.println("8. Save Book into file.");
			System.out.println("9. Read Book from file.");
			System.out.println("10. Create Book in dbs.");
			System.out.println("11. Read Book from dbs.");
			System.out.println("12. Update Book in dbs.");
			System.out.println("13. Delete Book from dbs.");
			System.out.println("Enter Your Choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				System.out.println("Exited.........");
				break;
			case 1:
				Books b = new Books();
				b.accept();
				list.add(b);
				Library l1 = new Library(b.getName(),b.getISBN());
				//lib.add(l1);
				//System.out.println(l1.getName());
				break;
			case 2:
				for (Books books : list) {
					if(books != null)
						System.out.println(books);
					else
						System.out.println("List is empty.");
				}
				break;
			case 3:
				System.out.println("Enter Book name: ");
				String key = sc.next();
				Books book = new Books();
				book.setName(key);
				if(list.contains(book)) {
					int index = list.indexOf(book);
					System.out.println(list.get(index));
				}else {
					System.out.println("Book not found.");
				}
				break;
			case 4:
				System.out.println("Enter book name to delete: ");
				String name = sc.next();
				Books book1 = new Books();
				book1.setName(name);
				if(list.contains(book1)) {
					int index = list.indexOf(book1);
					list.remove(index);
				}
				break;
			case 5:
				class bookNameComparator implements Comparator<Books>{

					@Override
					public int compare(Books b1, Books b2) {
						// TODO Auto-generated method stub
						int diff = b1.getName().compareTo(b2.getName());
						
						return diff;
					}
					
				}
				list.sort(new bookNameComparator());
				for (Books books : list) {
					System.out.println(books);
				}
				break;
			case 6:
				ListIterator<Books> itr = list.listIterator(list.size());
				while(itr.hasPrevious()) {
					Books b1 = itr.previous();
					System.out.println(b1);
				}
				break;
			case 7:
				System.out.println("Enter ISBN of book to be modified: ");
				int isbn = sc.nextInt();
				Books b2 = new Books();
				b2.setISBN(isbn);
				int index = list.indexOf(b2);
				if(index == -1)
					System.out.println("Book not found");
				else {
					Books oldBook = list.get(index);
					System.out.println("Old book details: "+oldBook);
					System.out.println("Modify Book: ");
					Books newBook = new Books();
					newBook.accept();
					list.set(index, newBook);
					System.out.println("Book details modified");
				}
				break;
			case 8:
				try(FileOutputStream fout = new FileOutputStream("Books.txt")) {
					try(ObjectOutputStream oout = new ObjectOutputStream(fout)){
						for (Books b3 : list) {
							oout.writeUTF(b3.getName());
							oout.writeInt(b3.getISBN());
							oout.writeUTF(b3.getAuthor());
							oout.writeDouble(b3.getPrice());
							oout.writeUTF(b3.getDateOfIssue());
							oout.writeUTF(b3.getDateOfRecollected());
						}
					}
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
			case 9:
				try(FileInputStream fin = new FileInputStream("Books.txt")){
					try(ObjectInputStream oin = new ObjectInputStream(fin)){
						while(true) {
							Books b4 = new Books();
							b4.setName(oin.readUTF());
							b4.setISBN(oin.readInt());
							b4.setAuthor(oin.readUTF());
							b4.setPrice(oin.readDouble());
							b4.setDateOfIssue(oin.readUTF());
							b4.setDateOfRecollected(oin.readUTF());
							System.out.println(b4);
						}
					}catch(EOFException e) {
						
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 10:
				Books b3 = new Books();
				try(BooksDao bd = new BooksDao()){
					b3.accept();
					int cnt = bd.createBook(b3);
					System.out.println("Rows Added: "+cnt);
				}catch(Exception e) {
					e.printStackTrace();
				}

				break;
			case 11:
				try(BooksDao bd = new BooksDao()){
					bd.readBook();
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 12:
				Books b4 = new Books();
				System.out.println("Enter id to update: ");
				int id = sc.nextInt();
				try(BooksDao bd = new BooksDao()){
					System.out.println("Old details:\n");
					bd.readBookOnRequirement(id);
					System.out.println("Update user detail: \n");
					b4.accept();
					int cnt = bd.updateBook(b4, id);
					System.out.println("Rows updated: "+cnt);
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 13: 
				System.out.println("Enter ISBN to delete: ");
				int isbn1 = sc.nextInt();
				try(BooksDao bd2 = new BooksDao()){
					bd2.deleteBook(isbn1);
					System.out.println("Row deleted");
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("Wrong choice entered.......");
				break;
			}
		} while (choice != 0);

	}

}
