public class Matchbox {
	String brand;
	double length;
	int NoOfSticks;
	double price;
	char Size;
	double weight;
	String type;
	
	Matchbox(){
		System.out.println("Matchbox constractor created");
		
	}
	Matchbox(String brand, double length, int NoOfSticks, double price,	char Size,double weight,String type){
		this.brand=brand;
		this.length=length;
		this.NoOfSticks=NoOfSticks;
		this.price=price;
		this.Size=Size;
		this.weight=weight;
		this.type=type;
	}

}
