import java.util.*;
class Foodlog {
   	String fooditemconsumed;
   	double quantity;
   	String time;
   	Foodlog() {

   	}
   	public Foodlog(String fooditemconsumed, double quantity, String time) {
   		this.fooditemconsumed = fooditemconsumed;
   		this.quantity = quantity;
   		this.time = time;
   	}
   	String getfooditemconsumed() {
   		return this.fooditemconsumed;
   	}
   	double getquantity() {
   		return this.quantity;
   	}
   	String gettime() {
   		return this.time;
   	}

   }
class Waterlog {
	double waterconsumed;
	String date;
	Waterlog(){

	}
	Waterlog(double waterconsumed, String date) {
		this.waterconsumed = waterconsumed;
		this.date = date;
	}
	double getwaterconsume() {
		return this.waterconsumed;
	}
	String getdate() {
		return this.date;
	}
}
class Physicalactivities {
	String activityname,date,starttime,endtime;
	Physicalactivities() {

	}
	Physicalactivities(String activityname, String date, String starttime, String endtime) {
    this.activityname = activityname;
    this.date = date;
    this.starttime = starttime;
    this.endtime = endtime;
	}
	String getactivityname() {
		return this.activityname;
	}
	String getdate() {
		return this.date;
	}
	String getstarttime() {
		return this.starttime;
	}
	String getendtime() {
		return this.endtime;
	}
}
class Weightlog {
	double kilo,fat;
	String date;
	Weightlog() {

	}
	Weightlog(double kilo, double fat, String date) {
		this.kilo = kilo;
		this.fat = fat;
		this.date =date;
	}
	double getkilo() {
		return this.kilo;
	}
	double getfat() {
		return this.fat;
	}
	String getdate() {
		return this.date;
	}

}
class Sleeplog {
	String starttime;
	String endtime;
	Sleeplog() {

	}
	Sleeplog(String starttime, String endtime) {
		this.starttime =starttime;
		this.endtime = endtime;
	} 
	String getstarttime() {
		return this.starttime;
	}
	String getendtime() {
		return this.endtime;
	}
}
class Summary {
	Summary() {

      }	

	final int HUND = 100; 
	int h=0,j=0,k=0,l=0,m=0;
	Foodlog[] foodobj = new Foodlog[HUND];
	Waterlog[] waterobj = new Waterlog[HUND];
	Weightlog[] weightobj = new Weightlog[HUND];
	Physicalactivities[] phyobj = new Physicalactivities[HUND];
	Sleeplog[] sleepobj = new Sleeplog[HUND];
	public void addFood(Foodlog item) {
		foodobj[h] = item;
		h++;
		//System.out.println(foodobj[i]);
	}
	public void addWater(Waterlog item) {
		waterobj[j] = item;
		j++;
	}
	public void addWeight(Weightlog item) {
		weightobj[k] = item;
		k++;
	}
	public void addPhysical(Physicalactivities item) {
		phyobj[l] = item;
		l++;
	}
	public void addSleep(Sleeplog item) {
		sleepobj[m] = item;
		m++;
	}
	public Foodlog getFoodlog(int index) {
	    return foodobj[index];
	}
	public Weightlog getWeightlog(int index) {
		return weightobj[index];
	}
	public Waterlog getWaterlog(int index) {
		return waterobj[index];
	}
	public Physicalactivities getPhysicalactivities(int index) {
		return phyobj[index];
	}
	public Sleeplog getSleeplog(int index) {
		return sleepobj[index];
	}
	public void print() {
		for(int i = 0; i<m;i++) {
			System.out.println(getFoodlog(i).getfooditemconsumed() + " "+ getFoodlog(i).getquantity() +" "+getFoodlog(i).gettime());
			System.out.println(getWeightlog(i).getkilo() + " "+getWeightlog(i).getfat()+" "+getWeightlog(i).getdate());
			System.out.println(getWaterlog(i).getwaterconsume()+" " +getWaterlog(i).getdate());
			System.out.println(getPhysicalactivities(i).getactivityname() + " " +getPhysicalactivities(i).getdate()+" "+getPhysicalactivities(i).getstarttime()+" "+getPhysicalactivities(i).getendtime());
			System.out.println(getSleeplog(i).getstarttime()+" "+getSleeplog(i).getendtime());
		}
	}

}
class client1 {
	public static void main(String[] args) {
	Summary s = new Summary();
	Scanner scan = new Scanner(System.in);
	while(scan.hasNext()) {
		String line = scan.nextLine();
		String[] tokens = line.split(" ");
		//System.out.println(tokens[0] + "....." +tokens[1]);
		//System.out.println(tokens[0]);
		switch (tokens[0]) {

			case "Foodlog":
			String[] items = tokens[1].split(",");
			System.out.println("Foodlog");
			s.addFood(new Foodlog(items[0],Double.parseDouble(items[1]),items[2]));
			break;
			case "Waterlog" :
			String[] items1 = tokens[1].split(",");
			System.out.println("Waterlog");
			s.addWater(new Waterlog(Double.parseDouble(items1[0]),items1[1]));
			break;
			case "Weightlog" :
			String[] items2 = tokens[1].split(",");
			System.out.println("Weightlog");
			s.addWeight(new Weightlog(Double.parseDouble(items2[0]),Double.parseDouble(items2[1]),items2[2]));
            break;
            case "Physicalactivities":
            String[] items3 = tokens[1].split(",");
            System.out.println("Physicalactivities");
            s.addPhysical(new Physicalactivities(items3[0],items3[1],items3[2],items3[3]));
            break;
            case "Sleeplog" :
            String[] items4 = tokens[1].split(",");
            System.out.println("Sleeplog");
            s.addSleep(new Sleeplog(items4[0],items4[1]));
            break;
            case "Summary":
            System.out.println("Summary");
            s.print();
            break;

			
		}
	}

		
	}

}

