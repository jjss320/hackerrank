package prac1;

public class p428 {
	  public static void main(String[] args) {
	    // Person ��ü ����
	    Person park = new Person("ȫ��");

	    // �� �������� ����
	    Developer devPark = park;
	    Instructor instPark = park;
	    Masseur masPark = park;
	    
	    /* 3. ������ �޼ҵ带 ȣ���Ͽ� �ڵ带 �ϼ��ϼ���. */
	    devPark.programming("JAVA");
	    instPark.teach("�ڷᱸ��");
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

	/* 1. Person Ŭ������ ������, ����, �������� ������ �ο��ϼ���. */
	class Person implements Developer, Instructor, Masseur{
	  private String name;
	  public Person(String name) {
	    this.name = name;
	  }

	  public void programming(String a){
	    System.out.println(name + " -> "+ a +"���α׷��� ��!");
	  }
	  public void teach(String b){
	    System.out.println(name + " -> " + b + "���� ��!");
	  }
	  public void massage(){
	    System.out.println(name + " -> ������ ��!");
	  }
	  /* 2. �����ϱ�� �� �������̽��� �޼ҵ带 �������̵� �ϼ���.*/
	}
