package Day12;

class Artist
{
	int ID;
	String Name;
	int Age;
	String Genre;
	int Experiance;
	
	  Artist(int iD, String name, int age, String genre, int experiance) {
		ID = iD;
		Name = name;
		Age = age;
		Genre = genre;
		Experiance = experiance;
	}
	 
	int getID() {
		return ID;
	}
	 void setID(int iD) {
		ID = iD;
	}
	 String getName() {
		return Name;
	}
	 void setName(String name) {
		Name = name;
	}
	 int getAge() {
		return Age;
	}
	 void setAge(int age) {
		Age = age;
	}
	 String getGenre() {
		return Genre;
	}
	 void setGenre(String genre) {
		Genre = genre;
	}
	 int getExperiance() {
		return Experiance;
	}
	 void setExperiance(int experiance) {
		Experiance = experiance;
	}
	 
	 void Perform()
	 {
		 System.out.println("Artist perform a specific work");
	 }
	 
	 void display()
	 {
		 System.out.println("Artist ID :"+this.ID);
		 System.out.println("Artist Name :"+this.Name);
		 System.out.println("Artist Age :"+this.Age);
		 System.out.println("Artist Genre :"+this.Genre);
		 System.out.println("Artist Experiance :"+this.Experiance);
	 }
}

class Singer extends Artist
{
	String VocalType;
	String MusicType;
	int AlbumsReleased;
	
	  Singer(int iD, String name, int age, String genre, int experiance, String vocalType, String musicType,
			int albumsReleased) {
		super(iD, name, age, genre, experiance);
		VocalType = vocalType;
		MusicType = musicType;
		AlbumsReleased = albumsReleased;
	}
	  
	String getVocalType() {
		return VocalType;
	}
	 void setVocalType(String vocalType) {
		VocalType = vocalType;
	}
	 String getMusicType() {
		return MusicType;
	}
	 void setMusicType(String musicType) {
		MusicType = musicType;
	}
	 int getAlbumsReleased() {
		return AlbumsReleased;
	}
	 void setAlbumsReleased(int albumsReleased) {
		AlbumsReleased = albumsReleased;
	}
	 
	 void Perform()
	 {
		 System.out.println("Singer perform a live song");
	 }
	 
	 void display()
	 {
		 super.display();
		 System.out.println("Singer VocalType :"+this.VocalType);
		 System.out.println("Singer Music Type :"+this.MusicType);
		 System.out.println("Singer Albums Released :"+this.AlbumsReleased);
	 }
	 
}

class Painter extends Artist
{
	String PaintingStyle;
	int noofExhibition;
	String PreferredMedium;
	
	
	  Painter(int iD, String name, int age, String genre, int experiance, String paintingStyle, int noofExhibition,
			String preferredMedium) {
		super(iD, name, age, genre, experiance);
		PaintingStyle = paintingStyle;
		this.noofExhibition = noofExhibition;
		PreferredMedium = preferredMedium;
	}
	 
	String getPaintingStyle() {
		return PaintingStyle;
	}
	 void setPaintingStyle(String paintingStyle) {
		PaintingStyle = paintingStyle;
	}
	 int getNoofExhibition() {
		return noofExhibition;
	}
	 void setNoofExhibition(int noofExhibition) {
		this.noofExhibition = noofExhibition;
	}
	 String getPreferredMedium() {
		return PreferredMedium;
	}
	 void setPreferredMedium(String preferredMedium) {
		PreferredMedium = preferredMedium;
	}
	 
	 void Perform()
	 {
		 System.out.println("Painter creating a artwork");
	 }
	 
	 void display()
	 {
		 super.display();
		 System.out.println("Painter Painting Style :"+this.PaintingStyle);
		 System.out.println("Painter No of Exhibition :"+this.noofExhibition);
		 System.out.println("Painter PreferredMedium :"+this.PreferredMedium);
	 }
}

class Actor extends Artist
{
	String ActingStyle;
	int MoviesDone;
	String Industry;
	
	 Actor(int iD, String name, int age, String genre, int experiance, String actingStyle, int moviesDone,
			String industry) {
		super(iD, name, age, genre, experiance);
		ActingStyle = actingStyle;
		MoviesDone = moviesDone;
		Industry = industry;
	}
	
	 String getActingStyle() {
		return ActingStyle;
	}
	 void setActingStyle(String actingStyle) {
		ActingStyle = actingStyle;
	}
	 int getMoviesDone() {
		return MoviesDone;
	}
	 void setMoviesDone(int moviesDone) {
		MoviesDone = moviesDone;
	}
	 String getIndustry() {
		return Industry;
	}
	 void setIndustry(String industry) {
		Industry = industry;
	}
	 
	 void Perform()
	 {
		 System.out.println("Actor is acting in a scene on stage/screen");
	 }
	 
	 void display()
	 {
		 super.display();
		 System.out.println("Actor Acting Style :"+this.ActingStyle);
		 System.out.println("Actor Movies Done :"+this.MoviesDone);
		 System.out.println("Actor Industry :"+this.Industry);
	 }
}

 class ArtistPoly {

	public static void main(String[] args) {
		Artist a1;
		 a1=new Artist(100,"Ranjan",23,"Painter",5);
		 a1.display();
		 a1.Perform();
		 System.out.println();
		 
		 a1=new Singer(101,"Jia",26,"Singer",5,"Alto","Classical",12);
		 a1.display();
		 a1.Perform();
		 System.out.println();
		 
		 a1=new Actor(102,"Gargi",20,"Actor",10,"Modern",12,"Bollywood");
		 a1.display();
		 a1.Perform();
		 System.out.println();
		 
		 a1=new Painter(103,"Riya",23,"Painter",7,"Modern",10,"Canvas");
		 a1.display();
		 a1.Perform();
		 

	}

}
