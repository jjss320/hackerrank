package prac1;

public class p429 {
	  public static void main(String[] args) {
	    // 다양한 객체 생성
	    Bird bird = new Bird();
	    Helicopter copter = new Helicopter();
	    Rocket rocket = new Rocket();
	    
	    // 인터페이스 타입으로 그룹화
	    Flyable[] flyableThings = { bird, copter, rocket };
	    
	    // 모든 날것들을 날림
	    for (int i = 0; i < flyableThings.length; i++) {
	      Flyable temp = flyableThings[i];
	      temp.fly();
	    }
	  }
	}

	interface Flyable {
	  public void fly();
	}

	/* 1. Bird 클래스에 Flyable 인터페이스를 구현하세요. */
	class Bird implements Flyable {
	  /* 1.1 fly() 메소드를 오버라이딩 하세요. */
	  public void fly(){
	    System.out.println("<새>가 날개를 퍼덕이며 날라갑니다!");
	  }
	}

	/* 2. Helicopter 클래스에 Flyable 인터페이스를 구현하세요. */
	class Helicopter implements Flyable {
	  /* 2.1 fly() 메소드를 오버라이딩 하세요. */
	  public void fly(){
	    System.out.println("<헬리콥터>가 프로펠러를 힘차게 돌리며 날라갑니다!");
	  }
	}

	/* 3. Rocket 클래스에 Flyable 인터페이스를 구현하세요. */
	class Rocket implements Flyable {
	  /* 3.1 fly() 메소드를 오버라이딩 하세요. */
	  public void fly(){
	    System.out.println("<로켓>가 제트 엔진으 분출하며 날라갑니다!");
	  }
	}