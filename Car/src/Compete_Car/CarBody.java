package Compete_Car;

public class CarBody {
 private int length;
 private int brith;
 private String type;
 public CarBody() {
	 length=2000;
	 brith=1500;
	 type="usuel";
	 
 }
 public CarBody(int l,int b, String type) {
	 this();
	 length=l;
	 brith=b;
	 this.type=type;
 }
 public int getLength() {
	 return length;
 }
 public int getBrith() {
	 return brith;
 }
 public void setBrith(int brith) {
	 this.brith=brith;
 }
 public String getType() {
	 return type;
 }
 public void setLengtth(int length) {
	 this.length=length;
 }
 public void setType(String type) {
	 this.type=type;
 }
 public String toString() {
	 return "Lentgh: "+length+"\nBrith: "+brith+"\nType: "+type;
 }
 public void changeLength(int addedlength) {
	 length+=addedlength;
 }
 public void changeBrith(int addedbrith) {
	 length+=addedbrith;
 }
}
