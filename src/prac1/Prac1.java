package prac1;

public class Prac1 {
	public static void main(String[] args) {
////426
//	    // ��ü ����
//	    SmartPhone iPhone = new SmartPhone("������ X");
//	    
//	    // ��ü�� �˶� �������̽�(����)�� �ؼ�
//	    Alarm alarm = (Alarm) iPhone;
//	    
//	    // �˶� ����� ������ ����
//	    alarm.beep();
//
//	    // �˶� ����� ���� ����ϱ�
//	    alarm.playMusic("����");
//	  }
//	}
//
//	interface Alarm {
//	  public void beep();                  // ������
//	  public void playMusic(String title); // ���� ���
//	}
//
//	/* 1. Alarm �������̽��� �ش� Ŭ������ �����ϼ���. */
//	class SmartPhone implements Alarm{
//	  private String name; // �𵨸�

//	  public SmartPhone(String name) {
//	    this.name = name;
//	  }
//
//	  /* 2. beep() �޼ҵ带 �������̵�(������) �ϼ���. */ public void beep(){
//		  System.out.println("�ߺ�! �ߺ���~!");
//	  }
//	  /* 3. playMusic() �޼ҵ带 �������̵��ϼ���. */public void playMusic(String a){
//		  System.out.print("[" + a + "]�� ����մϴ�..!");
//	  }
//	}
//427
	    // ����� ��ü ����
	    HolyKnight uther = new HolyKnight("�켭", 180);
	    
	    // ��Ŀ�μ��� ���� ����
	    Tanker t = uther;
	    t.increaseHp();
	    
	    // �����μ��� ���� ����
	    Healer h = uther;
	    h.heal();
	  }
	}

	interface Tanker {
	  public void increaseHp();
	}

	interface Healer {
	  public void heal();
	}

	/* 1. ��Ŀ�� ���� ������ �ο��ϼ���. */
	class HolyKnight implements Tanker, Healer{
	  private String name;
	  private int hp;

	  public HolyKnight(String name, int hp) {
	    this.name = name;
	    this.hp = hp;
	  }

	  /* 2. Tanker�� �޼ҵ带 �������̵��ϼ���. */
	public void heal() {
		System.out.println(name + "�� ü���� +" + hp +" ȸ���մϴ�.");
	}

	  /* 3. Healer�� �޼ҵ带 �������̵��ϼ���. */
	public void increaseHp() {
		System.out.println("��ü ü�� +"+ hp +"������ŵ�ϴ�.");
	}

	}