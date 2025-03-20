# publicAccessModifier
  Tour.java
  package Privatepack;
import Privatepack2.House;
public class Tour {
	public static void main(String[]args) {
		House h=new House();
		System.out.println(h.age);
		System.out.println(h.name);
		System.out.println(h.salary);
		System.out.println(h.place);
	}
}
House.java
  package Privatepack2;

public class House {
	public int age=59;
	public String name="vaishu";
	public float salary=78900.0f;
	public String place="krishnagiri";

}
