package customizeexception;

public class MovieBooking {
	String movieName;
	static double ticketPrice;
	static int totalTicketAvailable;	
	//int usercount;
	//int choice;
	
	String movie[]= {
		"3 Idiots",
		"Dangal",
		"Bahubali 2: The Conclusion",
		"Kabir Singh",
		"Chhichhore",
		"Zindagi Na Milegi Dobara",
		"Tanhaji",
		"Uri: The Surgical Strike",
		"War",
		"Bajrangi Bhaijaan"
	};
	
	static 
	{
		ticketPrice=200;
		totalTicketAvailable=50;
	}
	
	
	
	static int getRemainingTickets()
	{
		return totalTicketAvailable;
	}
	
	public String bookTickets(int choice,int usercount) throws InvalidTicketNumberException,InvalidMovieSelectionException,TicketsSoldOutException
	{
		if(usercount<=0)
		{
			throw new InvalidTicketNumberException();
		}
		else if(choice<1 || choice>movie.length)
		{
			throw new InvalidMovieSelectionException();
		}
		else if (usercount>totalTicketAvailable ) {
			throw new TicketsSoldOutException();
		}
		else
		{
			System.out.println("Booking Successfull!!");
		}
		
		totalTicketAvailable-=usercount;
		
		return movie[choice-1];
	}
}
