package member2;

public class Member implements Cloneable{
	public String id;
	public String name; 
	public String password;
	public int age;
	public boolean adult;
	public Car car;
	
	public Member(String id, String name, String password, int age, boolean adult, Car car) {
		this.id =id;
		this.name= name;
		this.password= password;
		this.age= age;
		this.adult=adult;
		this.car=car;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//먼저 얕은 복제를 한다
		Member cloned = (Member)super.clone();
		//참조 객체를 (car)싶은 복제를 한다
		cloned.car=new Car(this.car.model);
		
		return cloned;
	}
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member)clone();
		}catch (CloneNotSupportedException e ) {
			System.out.println("복제가 이루어지지 않았습니다");
		}
		return cloned;
	}
	
	
	
}
