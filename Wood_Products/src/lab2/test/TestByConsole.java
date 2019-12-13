package lab2.test;
import java.util.Scanner;
import lab2.model.*;
import lab2.store.*;



	public class TestByConsole {
		private WoodDirectory wd=new WoodDirectory();
		private ProductStore ps=new ProductStore();

		
		private float weight() {
			float full_weight=0;
			for(AbstractTimber el:ps.getTimmb()) {
				full_weight+=el.weight();
			}
			return full_weight;
		}
		public void consoleTest() {
			int count=10;
			int wood_id;
			String wood_name;
			float wood_dencity;
			Scanner in=new Scanner(System.in);
			while(count!=0) {
				System.out.println("Choise an action:\n1.Add wood;\n2.Add timber;"
						                + "\n3.Calculate general weight;\n0.EXIT");
				count=in.nextInt();
				switch(count) {
				case 1:{
										
					System.out.println("Enter wood id");
					wood_id=in.nextInt();
					System.out.println("Enter wood dencity");
					wood_dencity=in.nextFloat();
					System.out.println("Enter wood name");
					wood_name=in.next();
					
					if(wd.add(new Wood(wood_id,wood_name,wood_dencity))) {
						System.out.println("New wood was added");
						System.out.println();
					}else {
						System.out.println("Added wood is allready exist");
					}
					break;
				}
				case 2:{
					
					float length;
					float height;
					float width;
					int id;
					System.out.println("Enter timber length");
					length=in.nextFloat();
					System.out.println("Enter timber height");
					height=in.nextFloat();
					System.out.println("Enter timber width");
					width=in.nextFloat();
					System.out.println("Enter wood_id");
					id=in.nextInt();
					ps.addTimber(new Timber(wd.get(id),length,height,width));
					break;
				}
				case 3:{
					float general_w;
					general_w=weight();
					System.out.printf("General weight from timbers is: %f2",general_w);
					break;
				}
				default:{
					if(count==0) {
						System.out.println("Programm is closed");
					}
					else {
						System.out.println("Choise from 1 to 3");
					}
				}
				}
			}
			
		}
	}

