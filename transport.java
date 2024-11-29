package minipro;
import java.util.*;
class transport{
double distance_km;
int tm;
double tot_cost=0, t_c=0;
transport(){
	//default
}
transport(float accessed_d, int tm){
	distance_km = accessed_d;
	this.tm = tm;
}

	void display() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> transport = Arrays.asList("1.2-Wheeler", "2.3-Wheeler", "3.4-Wheeler");
		List<Integer> init = Arrays.asList(15,25,35);
		List<Integer> cost = Arrays.asList(12,17,20);
		System.out.println("\nPlease select the mode of transport for the day - ");
		System.out.println("Transport\tInitial(1km)\tPer km cost");
		for(int i=0;i<3;i++) {
		String t = transport.get(i);
		int in = init.get(i);
		int ch = cost.get(i);
		System.out.println(t+"\t  "+in+"\t\t  "+ch+"\n");}
		System.out.println("*******************************************************************\nPress option 1, 2 or 3 : ");
		tm = sc.nextInt();
		System.out.println("An excellent selection, truly!\n*******************************************************************");
	}
	
	double input() {
		switch(tm) 
		{
		case 1:
			_2wheeler obj1 = new _2wheeler();
			t_c = t_c + obj1.two(distance_km);
			break;
		case 2:
			_3wheeler obj2 = new _3wheeler();
			t_c = t_c + obj2.three(distance_km);
			break;
		case 3:
			_4wheeler obj3 = new _4wheeler();
			t_c = t_c + obj3.four(distance_km);
			break;	
		}
		
		return t_c;
	}
}


class _2wheeler extends transport{
	double two(double distance_km) 
	{
		if (distance_km <=1)
		{
			tot_cost= 15;
		}
		if (distance_km>1)
		{
			tot_cost = 15 + (12*(distance_km-1));
		}
		return tot_cost;
	}
}
class _3wheeler extends transport{
	double three(double distance_km) 
	{
		if (distance_km <=1)
		{
			tot_cost= 25;
		}
		if (distance_km>1)
		{
			tot_cost= 25+(17*(distance_km-1));
		}
		return tot_cost;
	}
}
class _4wheeler extends transport{
	double four(double distance_km) 
	{
		if (distance_km <=1)
		{
			tot_cost= 35;
		}
		if (distance_km>1)
		{
			tot_cost=35+(20*(distance_km-1));
		}
		return tot_cost;
	}
}