package prac1;

public class p429 {
	  public static void main(String[] args) {
	    // �پ��� ��ü ����
	    Bird bird = new Bird();
	    Helicopter copter = new Helicopter();
	    Rocket rocket = new Rocket();
	    
	    // �������̽� Ÿ������ �׷�ȭ
	    Flyable[] flyableThings = { bird, copter, rocket };
	    
	    // ��� ���͵��� ����
	    for (int i = 0; i < flyableThings.length; i++) {
	      Flyable temp = flyableThings[i];
	      temp.fly();
	    }
	  }
	}

	interface Flyable {
	  public void fly();
	}

	/* 1. Bird Ŭ������ Flyable �������̽��� �����ϼ���. */
	class Bird implements Flyable {
	  /* 1.1 fly() �޼ҵ带 �������̵� �ϼ���. */
	  public void fly(){
	    System.out.println("<��>�� ������ �۴��̸� ���󰩴ϴ�!");
	  }
	}

	/* 2. Helicopter Ŭ������ Flyable �������̽��� �����ϼ���. */
	class Helicopter implements Flyable {
	  /* 2.1 fly() �޼ҵ带 �������̵� �ϼ���. */
	  public void fly(){
	    System.out.println("<�︮����>�� �����緯�� ������ ������ ���󰩴ϴ�!");
	  }
	}

	/* 3. Rocket Ŭ������ Flyable �������̽��� �����ϼ���. */
	class Rocket implements Flyable {
	  /* 3.1 fly() �޼ҵ带 �������̵� �ϼ���. */
	  public void fly(){
	    System.out.println("<����>�� ��Ʈ ������ �����ϸ� ���󰩴ϴ�!");
	  }
	}