package appTest;
import java.util.Scanner;
import FlayTyps.*;
import Flayers.*;
import java.util.Arrays;
public class AppRequest {

	
	private void addFlayer(Flayer obj,Flayer[]arr) {
		
		if(obj.getCount()==arr.length) {
		arr=Arrays.copyOf(arr, arr.length+arr.length/2);
		
		}
		arr[obj.getCount()-1]=obj;
		
				
	}
	
	public double generalWeight(Flayer obj) {
		
		return obj.getMaxLoad();
	}
	
	public int generalPlaces(Flayer obj) {
		
		return obj.getPlaces();
	}
	
	
	private Flayer[]sortByFlyWeight(Flayer []obj){
		Flayer temp;
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
	
	private Flayer findBySpritUse(int length, int spritVolume, Flayer[]obj) {
		
		int index=obj.length;
		int count=obj[0].getCount();
		for(int i=0;i<count;i++) {
			if((spritVolume/obj[i].getUseSprit())>length) {
				index=i;
			}
		}
		if(index==obj.length)
		return null;
		else
			return obj[index];
	   }
	public void appConsole(Flayer[]obj) {
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
				addFlayer(temp,obj);
				break;
			}
			case 2:{
				int volume=0;
				int count=obj[0].getCount();
				for(int i=0;i<count;i++) {
					volume+=generalPlaces(obj[i]);
				}
				
				System.out.println("General volume: "+volume+" places");
				break;
				
			}
			case 3:{
				int weight=0;
				int count=obj[0].getCount();
				for(int i=0;i<count;i++) {
					weight+=generalWeight(obj[i]);
					
				}
					
				System.out.println("General volume: "+weight+" places");
				break;
			}
			case 4:{
				obj=sortByFlyWeight(obj);
				break;
			}
			case 5:{
				int length=0;
				int spritVolume=0;
				System.out.println("Enter a length of flay: ");
				length=in.nextInt();
				System.out.println("Enter a sprit volume witch you have: ");
				spritVolume=in.nextInt();
				Flayer temp2;
				temp2=findBySpritUse(length,spritVolume,obj);
				System.out.println(temp2);
			}
			}
		}
	}
	
	
	}

