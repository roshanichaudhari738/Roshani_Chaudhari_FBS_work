package Day12;

abstract class Instrument
{
	String InstrumentName;
	String Brand;
	
	 Instrument(String instrumentName, String brand) {
		InstrumentName = instrumentName;
		Brand = brand;
	}
	
	 String getInstrumentName() {
		return InstrumentName;
	}
	 void setInstrumentName(String instrumentName) {
		InstrumentName = instrumentName;
	}
	 String getBrand() {
		return Brand;
	}
	 void setBrand(String brand) {
		Brand = brand;
	}
	 
	 abstract void play();
	 
	 void display()
	 {
		 System.out.println("Instrument Name is:"+this.InstrumentName);
		 System.out.println("Instrument Brand is:"+this.Brand);
	 }
	 
	 public String toString()
	 {
		 return "Instrument Name is:"+this.InstrumentName+"\n"+"Instrument Brand is:"+this.Brand;
	 }
	
	
}

class Guitar extends Instrument
{
	int Stringcount;
	String Color;
	
	public Guitar(String instrumentName, String brand, int stringcount, String color) {
		super(instrumentName, brand);
		Stringcount = stringcount;
		Color = color;
	}
	public int getStringcount() {
		return Stringcount;
	}
	public void setStringcount(int stringcount) {
		Stringcount = stringcount;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
	void play()
	 {
		 System.out.println("Guitar Play");
	 }
	
	public String toString()
	{
		return super.toString()+" Guitar Stringcount is:"+this.Stringcount+" Guitar Color is:"+this.Color;
	}
}

class Piano extends Instrument
{
	int Keycount;

	public Piano(String instrumentName, String brand, int keycount) {
		super(instrumentName, brand);
		Keycount = keycount;
	}

	public int getKeycount() {
		return Keycount;
	}

	public void setKeycount(int keycount) {
		Keycount = keycount;
	}
	
	void play()
	 {
		 System.out.println("Piano Play");
	 }
	
	public String toString()
	{
		return super.toString()+" Piano Keycount is:"+this.Keycount;
	}
	
}

public class InstrumentPoly {

	public static void main(String[] args) {
		Instrument i1;
//		i1=new Instrument("Piano","XYZ");
//		i1.play();
//		i1.display();
//		System.out.println();
		
		i1=new Guitar("Guitar","XYZ",12,"Black");
		i1.play();
		System.out.println(i1.toString());
		System.out.println();
		
		i1=new Piano("Piano","XYZ",50);
		i1.play();
		System.out.println(i1.toString());
		
		

	}

}
