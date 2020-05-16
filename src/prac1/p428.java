package prac1;

public class p428 {
	  public static void main(String[] args) {
	    // Person 객체 생성
	    Person park = new Person("홍팍");

	    // 각 직업으로 변신
	    Developer devPark = park;
	    Instructor instPark = park;
	    Masseur masPark = park;
	    
	    /* 3. 직업별 메소드를 호출하여 코드를 완성하세요. */
	    devPark.programming("JAVA");
	    instPark.teach("자료구조");
	    masPark.massage();
	  }
	}

	interface Developer {
	  public void programming(String lang);
	}

	interface Instructor {
	  public void teach(String subject);
	}

	interface Masseur {
	  public void massage();
	}

	/* 1. Person 클래스에 개발자, 강사, 마사지사 역할을 부여하세요. */
	class Person implements Developer, Instructor, Masseur{
	  private String name;
	  public Person(String name) {
	    this.name = name;
	  }

	  public void programming(String a){
	    System.out.println(name + " -> "+ a +"프로그래밍 중!");
	  }
	  public void teach(String b){
	    System.out.println(name + " -> " + b + "수업 중!");
	  }
	  public void massage(){
	    System.out.println(name + " -> 마사지 중!");
	  }
	  /* 2. 구현하기로 한 인터페이스의 메소드를 오버라이딩 하세요.*/
	}
