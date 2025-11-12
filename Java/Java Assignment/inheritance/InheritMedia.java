package inheritance;
class Media
{
	String title;
	double duration;
	
	Media()
	{
		System.out.println("Media Default Constructor Called");
		title="not assign";
		duration=45.2;
	}
	
	  Media(String title, double duration) {
		 System.out.println("Media Parameter Constructor Called");
		this.title = title;
		this.duration = duration;
	}

	String getTitle() {
		return title;
	}
	 void setTitle(String title) {
		this.title = title;
	}
	 double getDuration() {
		return duration;
	}
	 void setDuration(double duration) {
		this.duration = duration;
	}
	 
	 void display()
	 {
		 System.out.println("Media Title is "+this.title);
		 System.out.println("Media Duration is "+this.duration);
	 }
	
}

class Audio extends Media
{
	
	String artist;
	
	Audio()
	{
		super();
		System.out.println("Audio Default Constructor Called");
		artist="XYZ";
	}
	
	  Audio(String title, double duration, String artist) {
		  super(title,duration);
		  System.out.println("Audio Para Constructor Called");
		this.artist = artist;
	}

	 String getArtist() {
		return artist;
	}
	 void setArtist(String artist) {
		this.artist = artist;
	}
	 
	 void display()
	 {
		super.display();
		 System.out.println("Audio Artist is "+this.artist);
		 
	 }
}

class Video extends Media
{
	
	int resolution;
	
	Video()
	{
		super();
		System.out.println("Video Default Constructor Called");
		resolution=62;
	}
	
	  Video(String title, double duration, int resolution) {
		  super(title,duration);
		  System.out.println("Video Para Constructor Called");
		this.resolution = resolution;
	}

	 int getResolution() {
		return resolution;
	}
	 void setResolution(int resolution) {
		this.resolution = resolution;
	}
	 
	 void display()
	 {
		super.display();
		 System.out.println("Video Resolution is "+this.resolution);
		 
	 }
}

class Podcast extends Media
{
	String hostname;
	
	Podcast()
	{
		super();
		System.out.println("Podcast Default Constructor Called");
		hostname="ABC";
	}
	
	  Podcast(String title, double duration, String hostname) {
		  super(title,duration);
		  System.out.println("Podcast Para Constructor Called");
		this.hostname = hostname;
	}

	 String getHostname() {
		return hostname;
	}
	 void setHostname(String hostname) {
		this.hostname = hostname;
	}
	 
	 void display()
	 {
		super.display();
		 System.out.println("Podcast Hostname is "+this.hostname);
		 
	 }
}

class InheritMedia {

	public static void main(String[] args) {
		Audio a1=new Audio();
		a1.display();
		System.out.println("\n\n");
		
		Audio a2=new Audio("Song",56,"CSED");
		a2.display();
		System.out.println("\n\n");
		
		Video v1=new Video();
		v1.display();
		System.out.println("\n\n");
		
		Video v2=new Video("Movie",60,92);
		v2.display();
		System.out.println("\n\n");
		
		Podcast p1=new Podcast();
		p1.display();
		System.out.println("\n\n");
		
		Podcast p2=new Podcast("Story",30,"trd");
		p2.display();
		System.out.println("\n\n");
		

	}

}
