package Day12;

abstract class Artist
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
	 
	 abstract void Perform();

	 
	 public String toString()
	 {
		 return "Artist ID :"+this.ID+"\n"+"Artist Name :"+this.Name+"\n"+"Artist Age :"+this.Age+"\n"+"Artist Genre :"+this.Genre+"\n"+"Artist Experiance :"+this.Experiance;
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
	 

	 
	 public String toString()
	 {
		 return super.toString()+"Singer VocalType :"+this.VocalType+"\n"+"Singer Music Type :"+this.MusicType+"\n"+
	 "Singer Albums Released :"+this.AlbumsReleased;
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
	 

	 
	 public String toString()
	 {
		 return super.toString()+"Painter Painting Style :"+this.PaintingStyle+"\n"+"Painter No of Exhibition :"+this.noofExhibition+"\n"+
				 "Painter PreferredMedium :"+this.PreferredMedium;
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
	 

	 
	 public String toString()
	 {
		 return super.toString()+"Actor Acting Style :"+this.ActingStyle+"\n"+"Actor Movies Done :"+this.MoviesDone+"\n"+
				 "Actor Industry :"+this.Industry;
	 }
}

 class ArtistPoly {

	public static void main(String[] args) {
		Artist a1;
//		 a1=new Artist(100,"Ranjan",23,"Painter",5);
//		 a1.display();
//		 a1.Perform();
//		 System.out.println();
		 
		 a1=new Singer(101,"Jia",26,"Singer",5,"Alto","Classical",12);
		 System.out.println(a1);
		 a1.Perform();
		 System.out.println();
		 
		 a1=new Actor(102,"Gargi",20,"Actor",10,"Modern",12,"Bollywood");
		 System.out.println(a1);
		 a1.Perform();
		 System.out.println();
		 
		 a1=new Painter(103,"Riya",23,"Painter",7,"Modern",10,"Canvas");
		 System.out.println(a1);
		 a1.Perform();
		 

	}

}
