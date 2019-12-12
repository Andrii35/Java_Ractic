package lab2.test;
import lab2.model.*;
import lab2.store.*;



	public class TestByConsole {
		private WoodDirectory wd=new WoodDirectory();
		private ProductStore ps=new ProductStore();
		public void addWood(int id, String name, float density) {
			 wd.add(new Wood(id,name,density));
		}
		
		public void addTimber(Wood w,float length, float height, float width) {
			ps.addTimber(new Timber(w,length,height,width));
		}
		
		public float wight() {
			float full_weight=0;
			for(Timber el:ps.getTimmb()) {
				full_weight+=el.weight();
			}
			return full_weight;
		}
		public void consoleTest() {
			
		}
	}

