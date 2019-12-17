package appTest;
import java.util.Scanner;
import FlayTyps.*;
import Flayers.*;
import java.util.Arrays;
public class appRequest {

	SmallFlyear smallf=new SmallFlyear();
	MiddleFlayer middlef=new MiddleFlayer();
	BigFlayer bigf=new BigFlayer();
	private Flayer[] addFlayer(Flayer obj,Flayer[]arr) {
		if(obj.getCount()==arr.length||obj.getCount()>arr.length)
		arr=Arrays.copyOf(arr, arr.length+arr.length/2);
	}
	public double generalWeight(Flayer obj) {
		double weight=0;
		weight+=obj.getMaxLoad();
		return weight;
	}
	public int generalPlaces(Flayer obj) {
		int places=0;
		places+=obj.getPlaces();
		return places;
	}
	public Flayer[]sortByFlyWeight(Flayer []obj){
		Flayer temp=new Flayer();
		boolean isSorted=true;
		while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < obj.length-1; i++) {
                if((obj[i].getTank()/obj[i].getUseSprit()) > (obj[i+1].getTank()/obj[i+1].getUseSprit())){
                    isSorted = false;
                    temp = obj[i];
                    obj[i] = obj[i+1];
                    obj[i+1] = temp;
                  }
              }
          }
		return obj;
		
	   }
	
	public Flayer findBySpritUse(double useSprit, Flayer[]obj) {
		int index=obj.length;
		for(int i=0;i<obj.length;i++) {
			if(obj[i].getUseSprit()==useSprit||obj[i].getUseSprit()<useSprit) {
				index=i;
			}
		}
		if(index==obj.length)
		return null;
		else
			return obj[index];
	   }
	public void appConsole() {
		int choise=10;
		Scanner in=new Scanner(System.in);
		Flayer temp;
		while(choise!=0) {
			System.out.println("Choise an action:");
			System.out.println("1.Add flayer\n2.General volume\n3.General weight\n4.Sort bey fly length\n5.Use of Sprit");
			choise=in.nextInt();
			switch(choise) {
			case 1:{
				String type;
				int tank;
				int places;
				double useSprit;
				double maxLoad;
				System.out.println("Enter a type of flayer: ");
				type=in.next();
				System.out.println("Enter a tank volum of flayer: ");
				tank=in.nextInt();
				System.out.println("Enter a places of flayer: ");
				places=in.nextInt();
				System.out.println("Enter a sprit using for one kilometr of flayer: ");
				useSprit=in.nextDouble();
				System.out.println("Enter a max. loading of flayer: ");
				maxLoad=in.nextDouble();
				if(places<150) {
				temp=new SmallFlyear(type,tank,places,useSprit,maxLoad);
				}else if(places>149&&places<220) {
					temp=new MiddleFlayer(type,tank,places,useSprit,maxLoad);
				}else {
					temp=new BigFlayer(type,tank,places,useSprit,maxLoad);
				}
				
			}
			}
		}
	}
	
	
	}

