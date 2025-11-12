package inheritance;

class SocialMediaAccount
{
	String username;
	String email;
	String ispublic;
	String isverified;
	String countryorigin;
	int noofpost;
	int nooflike;
	int comments;
	String createdat;
	int noofimpression;
	
	SocialMediaAccount() {
		  System.out.println("SocialMediaAccount Default Constructor Called");
		username ="Raj";
		email ="xyz@gmail.com";
		ispublic ="Yes";
		isverified ="No";
		countryorigin ="India";
		noofpost =10;
		nooflike =50;
		comments =60;
		createdat ="ABC";
		noofimpression =800;
	}
	
	  SocialMediaAccount(String username, String email, String ispublic, String isverified, String countryorigin,
			int noofpost, int nooflike, int comments, String createdat, int noofimpression) {
		  System.out.println("SocialMediaAccount Parameter Constructor Called");
		this.username = username;
		this.email = email;
		this.ispublic = ispublic;
		this.isverified = isverified;
		this.countryorigin = countryorigin;
		this.noofpost = noofpost;
		this.nooflike = nooflike;
		this.comments = comments;
		this.createdat = createdat;
		this.noofimpression = noofimpression;
	}
	String getUsername() {
		return username;
	}
	 void setUsername(String username) {
		this.username = username;
	}
	 String getEmail() {
		return email;
	}
	 void setEmail(String email) {
		this.email = email;
	}
	 String getIspublic() {
		return ispublic;
	}
	 void setIspublic(String ispublic) {
		this.ispublic = ispublic;
	}
	 String getIsverified() {
		return isverified;
	}
	 void setIsverified(String isverified) {
		this.isverified = isverified;
	}
	 String getCountryorigin() {
		return countryorigin;
	}
	 void setCountryorigin(String countryorigin) {
		this.countryorigin = countryorigin;
	}
	 int getNoofpost() {
		return noofpost;
	}
	 void setNoofpost(int noofpost) {
		this.noofpost = noofpost;
	}
	 int getNooflike() {
		return nooflike;
	}
	 void setNooflike(int nooflike) {
		this.nooflike = nooflike;
	}
	 int getComments() {
		return comments;
	}
	 void setComments(int comments) {
		this.comments = comments;
	}
	 String getCreatedat() {
		return createdat;
	}
	 void setCreatedat(String createdat) {
		this.createdat = createdat;
	}
	 int getNoofimpression() {
		return noofimpression;
	}
	 void setNoofimpression(int noofimpression) {
		this.noofimpression = noofimpression;
	}
	 
	 void display()
	 {
		 System.out.println("SocialMediaAccount Username is "+this.username);
		 System.out.println("SocialMediaAccount Email is "+this.email);
		 System.out.println("SocialMediaAccount Is Public is "+this.ispublic);
		 System.out.println("SocialMediaAccount Is Verified is "+this.isverified);
		 System.out.println("SocialMediaAccount Country Origin is "+this.countryorigin);
		 System.out.println("SocialMediaAccount No Of Post are "+this.noofpost);
		 System.out.println("SocialMediaAccount No Of Like are "+this.nooflike);
		 System.out.println("SocialMediaAccount Comments is "+this.comments);
		 System.out.println("SocialMediaAccount Createdat is "+this.createdat);
		 System.out.println("SocialMediaAccount No Of Impression is "+this.noofimpression);
	 }
	
}

class InstagramAccount extends SocialMediaAccount
{
	long nooffollowers;
	int nooffollowing;
	int noofhighlight;
	int noofpostarchive;
	int noofstoryarchive;
	int noofaudiosquad;
	
	InstagramAccount() {
		super();
	  System.out.println("InstagramAccount Default Constructor Called");
	
	nooffollowers =21;
	nooffollowing = 00;
	noofhighlight =0 ;
	noofpostarchive = 0;
	noofstoryarchive = 0;
	noofaudiosquad =0;
}
	
	  InstagramAccount(String username, String email, String ispublic, String isverified, String countryorigin,
				int noofpost, int nooflike, int comments, String createdat, int noofimpression,long nooffollowers, int nooffollowing, int noofhighlight, int noofpostarchive,
			int noofstoryarchive, int noofaudiosquad) {
		  
		super( username,  email,  ispublic,  isverified,  countryorigin,noofpost,  nooflike,  comments,  createdat,  noofimpression);
		System.out.println("InstagramAccount Para Constructor Called");
		this.nooffollowers = nooffollowers;
		this.nooffollowing = nooffollowing;
		this.noofhighlight = noofhighlight;
		this.noofpostarchive = noofpostarchive;
		this.noofstoryarchive = noofstoryarchive;
		this.noofaudiosquad = noofaudiosquad;
	}
	long getNooffollowers() {
		return nooffollowers;
	}
	 void setNooffollowers(long nooffollowers) {
		this.nooffollowers = nooffollowers;
	}
	 int getNooffollowing() {
		return nooffollowing;
	}
	 void setNooffollowing(int nooffollowing) {
		this.nooffollowing = nooffollowing;
	}
	 int getNoofhighlight() {
		return noofhighlight;
	}
	 void setNoofhighlight(int noofhighlight) {
		this.noofhighlight = noofhighlight;
	}
	 int getNoofpostarchive() {
		return noofpostarchive;
	}
	 void setNoofpostarchive(int noofpostarchive) {
		this.noofpostarchive = noofpostarchive;
	}
	 int getNoofstoryarchive() {
		return noofstoryarchive;
	}
	 void setNoofstoryarchive(int noofstoryarchive) {
		this.noofstoryarchive = noofstoryarchive;
	}
	 int getNoofaudiosquad() {
		return noofaudiosquad;
	}
	 void setNoofaudiosquad(int noofaudiosquad) {
		this.noofaudiosquad = noofaudiosquad;
	}
	 
	 void display()
	 {
		 super.display();
		 System.out.println("InstagramAccount No Of Followers is "+this.nooffollowers);
		 System.out.println("InstagramAccount No Of Following is "+this.nooffollowing);
		 System.out.println("InstagramAccount No Of Highlight is "+this.noofhighlight);
		 System.out.println("InstagramAccount No Of Postarchive is "+this.noofpostarchive);
		 System.out.println("InstagramAccount No Of storyarchive is "+this.noofstoryarchive);
		 System.out.println("InstagramAccount No Of Audiosquad are "+this.noofaudiosquad);
	 }
}

class LinkedIn extends SocialMediaAccount
{
	int noofconnection;
	int noofprofileview;
	int noofjobsapplied;
	
	LinkedIn() {
	  super();
		System.out.println("LinkedIn Default Constructor Called");
	noofconnection =52;
	noofprofileview =0 ;
	noofjobsapplied =0;
}
	
	  LinkedIn(String username, String email, String ispublic, String isverified, String countryorigin,
				int noofpost, int nooflike, int comments, String createdat, int noofimpression,int noofconnection, int noofprofileview, int noofjobsapplied) {
		  super( username,  email,  ispublic,  isverified,  countryorigin,noofpost,  nooflike,  comments,  createdat,  noofimpression);
			System.out.println("LinkedIn Para Constructor Called");
		this.noofconnection = noofconnection;
		this.noofprofileview = noofprofileview;
		this.noofjobsapplied = noofjobsapplied;
	}
	int getNoofconnection() {
		return noofconnection;
	}
	 void setNoofconnection(int noofconnection) {
		this.noofconnection = noofconnection;
	}
	 int getNoofprofileview() {
		return noofprofileview;
	}
	 void setNoofprofileview(int noofprofileview) {
		this.noofprofileview = noofprofileview;
	}
	 int getNoofjobsapplied() {
		return noofjobsapplied;
	}
	 void setNoofjobsapplied(int noofjobsapplied) {
		this.noofjobsapplied = noofjobsapplied;
	}
	 
	 void display()
	 {
		 super.display();
		 System.out.println("InstagramAccount No Of Connection is "+this.noofconnection);
		 System.out.println("InstagramAccount No Of profileview is "+this.noofprofileview);
		 System.out.println("InstagramAccount No jobs applied is "+this.noofjobsapplied);
	 }
}

class Youtube extends SocialMediaAccount
{
	int noofsubscriber;
	int watchtime;
	String ismonetized;
	double estimatedrevenue;
	
	Youtube() {
	super();
	System.out.println("You Tube Default Constructor Called");
	noofsubscriber =0 ;
	watchtime = 0;
	ismonetized ="Not" ;
	estimatedrevenue = 0;
}
	
	  Youtube(String username, String email, String ispublic, String isverified, String countryorigin,
				int noofpost, int nooflike, int comments, String createdat, int noofimpression,int noofsubscriber, int watchtime, String ismonetized, double estimatedrevenue) {
		super(username,  email,  ispublic,  isverified,  countryorigin,noofpost,  nooflike,  comments,  createdat,  noofimpression);
		System.out.println("You Tube Para Constructor Called");
		this.noofsubscriber = noofsubscriber;
		this.watchtime = watchtime;
		this.ismonetized = ismonetized;
		this.estimatedrevenue = estimatedrevenue;
	}
	int getNoofsubscriber() {
		return noofsubscriber;
	}
	 void setNoofsubscriber(int noofsubscriber) {
		this.noofsubscriber = noofsubscriber;
	}
	 int getWatchtime() {
		return watchtime;
	}
	 void setWatchtime(int watchtime) {
		this.watchtime = watchtime;
	}
	 String getIsmonetized() {
		return ismonetized;
	}
	 void setIsmonetized(String ismonetized) {
		this.ismonetized = ismonetized;
	}
	 double getEstimatedrevenue() {
		return estimatedrevenue;
	}
	 void setEstimatedrevenue(double estimatedrevenue) {
		this.estimatedrevenue = estimatedrevenue;
	}
	 
	 void display()
	 {
		 super.display();
		 System.out.println("Youtube No Of Subscriber is "+this.noofsubscriber);
		 System.out.println("Youtube No Of watchtime is "+this.watchtime);
		 System.out.println("Youtube No is monetized is "+this.ismonetized);
		 System.out.println("Youtube No Estimated Revenue is "+this.estimatedrevenue);
	 }
}

class ScocialAccountInherit {

	public static void main(String[] args) {
		InstagramAccount ia1=new InstagramAccount();
		ia1.display();
		System.out.println("\n\n");
		
		InstagramAccount ia2=new InstagramAccount("Gargi","gargi123@gmail.com","No","Yes","India",100,20,70,"Gargi",1000,30,400,50,80,7,6);
		ia2.display();
		System.out.println("\n\n");
		
		LinkedIn li1=new LinkedIn();
		li1.display();
		System.out.println("\n\n");
		
		LinkedIn li2=new LinkedIn("Jiya","jiya4568@gmail.com","Yes","No","UK",580,220,740,"Kia",4500,900,60,700);
		li2.display();
		System.out.println("\n\n");
		
		Youtube yt1=new Youtube();
		yt1.display();
		System.out.println("\n\n");
		
		Youtube yt2=new Youtube("Gargi","gargi123@gmail.com","No","Yes","India",100,20,50,"Gargi",1000,600,60,"XYZ",96300);
		yt2.display();
		System.out.println("\n\n");

	}

}
