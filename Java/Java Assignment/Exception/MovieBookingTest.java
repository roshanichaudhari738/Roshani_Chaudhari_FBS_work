package customizeexception;

import java.util.Scanner;

public class MovieBookingTest {

	public static void main(String[] args) {
		MovieBooking mb=new MovieBooking();
		Scanner sc=new Scanner(System.in);
		
		while (MovieBooking.getRemainingTickets()>0) {
			System.out.println("----Available movie----");
			System.out.println(" 1. 3 Idiots\n 2. Dangal\n 3. Bahubali 2: The Conclusion\n 4. Kabir Singh\n 5. Chhichhore\n "
					+ "6. Zindagi Na Milegi Dobara\n 7. Tanhaji\n 8. Uri: The Surgical Strike\n 9. War\n 10. Bajrangi Bhaijaan");
			System.out.println("\nEnter your choice:");
			int choice=sc.nextInt();
			System.out.println("Remaining Tickets "+mb.getRemainingTickets());
			System.out.println("Enter the no. of ticket:");
			int usercount=sc.nextInt();
			
			try {
				String movieName=mb.bookTickets(choice,usercount);
				
				double totalAmt=usercount * mb.ticketPrice;
				
				System.out.println("Successfull Booking "+movieName+"!!");
				System.out.println("Ticket count "+usercount);
				System.out.println("Total Amount "+totalAmt);
				
			} catch (InvalidTicketNumberException te) {
				System.out.println(te);
			}
			catch (InvalidMovieSelectionException me) {
				System.out.println(me);
			}
			catch (TicketsSoldOutException tse) {
				System.out.println(tse);
			}
		}
		sc.close();

	}

}
