package day44;
/*
CyberHouse
	instance fields : houseNum, design
	static field : neighbourhoodName
	add 2 args constructor
		to set the houseNum, design
	instance method
		void showAllInfo()
			just print the houseNum, design neighbourhoodName in one line
	static void method showNeighborhood
		print the neighbourhoodName only
		// try to access houseNum, design and see what happen
 */
public class CyberHouse {
    
    int houseNumber;
    String design;
    
    static String neighbourhoodName="Grand Hollow";
    
    public CyberHouse(int houseNumber, String design){
        this.houseNumber =houseNumber;
        this.design=design;
    }
    public void showAllInfo(){
        System.out.println(this.houseNumber+", "+this.design+", "+neighbourhoodName);
    }
    public static void showNeighborhood(){
        System.out.println("neighbourhoodName = " + neighbourhoodName);
    }
}
