package member;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj1= new Member("blue");
		Member obj2= new Member("blue");
		Member obj3= new Member("red");
		
		if(obj1.equals(obj2)) {// ==(메모리 주소가 같은지)   -> id동일하면 같은 객체로 처리
			System.out.println("obj1와 obj2는 동등합니다");
		}else {
			System.out.println("obj1와 obj2는 동등하지 않습니다");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1와 obj3는 동등합니다");
		}else {
			System.out.println("obj1와 obj3는 동등하지 않습니다");
		}
		System.out.println("---------------------------------------");
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		System.out.println("---------------------------------------");
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		System.out.println("---------------------------------------");
		System.out.println(obj1.id.toString());
		System.out.println(obj2.id.toString());
		System.out.println(obj3.id.toString());
	}
}
