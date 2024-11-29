package minipro;
import java.util.*;
public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> Pickup = new ArrayList<>();
		ArrayList<String> Dropoff = new ArrayList<>();
		ArrayList<Float> Distance_travelled = new ArrayList<>();
		ArrayList<String> loc_options = new ArrayList<>();
		
		if(args.length>0) {
			//GUI
			String destination = null, current_loc = null;
			page_1GUI obj=new page_1GUI();
		}
		
		else {
		//Array Lists to display a detailed final bill
		
		//Initialising variables 1)waiting_period -> for waiting period charges; 2)cont -> to continue or stop the ride; 3) count-> to count total rides; 4)choice-> argument of ride_continuation.
		int waiting_period = 0, cont=0, count = 1, choice=0, tm=0;
		String desti=null;
		
		//Display welcome message
		System.out.println("*******************************************************************");
		System.out.println("	 	Welcome to the daily dose of daily planner");
		System.out.println("		  where planning is just a click away!");
		System.out.println("		   Pune Awaits! Are You Tour-Ready?");
		System.out.println("*******************************************************************");
		
		//Prompt for current location
		System.out.println("Please enter current location: ");			
		System.out.println("1. Kothrud\n2. Baner\n3. Deccan\n4. Wakad\n5. Chinchwad");
		List<String> currloc = Arrays.asList("Kothrud","Baner","Deccan","Wakad","Chinchwad");
		int current=sc.nextInt();
		current--;
		System.out.println("Your current location is: "+currloc.get(current));
		System.out.println("*******************************************************************");
		String current_loc = currloc.get(current);
		Pickup.add(current_loc);
		
		//Prompt for destination
		System.out.println("Please enter destination: ");					//destination
		System.out.println("1. FC\n2. Hinjewadi\n3. Pashan\n4. Koregaon Park\n5. Katraj");
		List<String> destloc = Arrays.asList("FC","Hinjewadi","Pashan","Koregaon-Park","Katraj");
		int dest=sc.nextInt();
		dest--;
		System.out.println("Your destination is: "+destloc.get(dest));
		System.out.println("*******************************************************************");
		desti = destloc.get(dest); //initialized in the beginning
		Dropoff.add(desti);
		
		//Creating object of class GEG to access data from the database in mysql
		GEG obj = new GEG();		
		float accessed_d = obj.distance(current_loc, desti);
		transport tm1 = new transport(accessed_d,tm);
		tm1.display();
		Distance_travelled.add(accessed_d);
		
		do {
		double total_cost = tm1.input() + waiting_period;
		
		//Prompt for continuation
		System.out.println("Would you like to \n1.Continue the ride \n2.Stop the ride \n3.Wait(Waiting charges are applicable)\n4.Go back to home and print bill\n 5.EXIT PROGEAM");
		cont = sc.nextInt();
		System.out.println("*******************************************************************");
		switch(cont) {
		case 1: 
			//To continue the ride further display details
			count++;
			System.out.println("Would you like to explore\n1.Cafes and Restaurants \n2.Tourism hubs \n(Please press 1 or 2)");
			choice = sc.nextInt();
			Ride_continuation obj2 = new Ride_continuation(desti,choice);
			loc_options = obj2.display();
			for(int i =0; i<3;i ++) {
				String s = loc_options.get(i);
				System.out.println(i+1+"."+" "+s);
			}
		
			System.out.println("Please enter the location number of your choice : ");
			int op = sc.nextInt();
			String place = loc_options.get(op-1);
			System.out.println("*******************************************************************");
			Pickup.add(desti);
			Dropoff.add(place);
			accessed_d = obj.distance(desti , place);
			Distance_travelled.add(accessed_d);
			transport tm2 = new transport(accessed_d,tm);
			tm2.input();
			desti = place;
			break; 
			
		case 2:
			//Stop the ride -> final bill
			System.out.println("*********************************BILL**********************************");
			System.out.println("Ride no. \t Pick Up Location \t Drop off Location \t distance travelled");
			for(int i =0;i<count;i++) {
				System.out.printf("%d \t\t %-27s %-30s %.2f\n ",i+1,Pickup.get(i),Dropoff.get(i),Distance_travelled.get(i));
			}
			System.out.println("Waiting charges :" + waiting_period);
			System.out.print("Your final bill : ");
			System.out.printf("%.2f", total_cost); 
			System.out.println("\nThankyou for planning with us!");
			System.out.println("*********************************BILL**********************************");
			break;
			
		case 3: 
			//Waiting period + extra charges.
			System.out.println("(1 min waiting = Rs. 1 waiting charge)\nHow many minutes would like us to wait?");
			int w = sc.nextInt();
			waiting_period = waiting_period+ w;
			System.out.println("Waiting charges :" + waiting_period);
			break;
			
		case 4:
			double c1=0;
			System.out.println("Which destination would you like to go back to ?\n1.Karve-Nagar\n2.Sinhagad Rd\n3.Kothrud");
			int c = sc.nextInt();
			switch(c) {
			
			case 1:
				accessed_d = 15;
				transport tm3 = new transport(accessed_d,tm);
				c1 = tm3.input();
				break;
			case 2:
				accessed_d =17;
				transport tm4 = new transport(accessed_d,tm);
				c1 = tm4.input();
				break;
			case 3:
				accessed_d=9;
				transport tm5 = new transport(accessed_d,tm);
				c1 = tm5.input();
				break;
			}
			
			System.out.println("*********************************BILL**********************************");
			System.out.println("Ride no. \t Pick Up Location \t Drop off Location \t distance travelled");
			for(int i =0;i<count;i++) {
				System.out.printf("%d \t\t %-27s %-30s %.2f\n ",i+1,Pickup.get(i),Dropoff.get(i),Distance_travelled.get(i));
			}
			System.out.println("Back to home");
			System.out.println("Waiting charges :" + waiting_period);
			System.out.print("Your final bill : ");
			System.out.printf("%.2f", (total_cost+c1)); 
			System.out.println("\nThankyou for planning with us!");
			System.out.println("*********************************BILL**********************************");
			break;
		case 5:
			break;
		}
		}while(cont!=5);
		
	}
	}
}

