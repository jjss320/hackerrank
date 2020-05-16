package prac1;

public class Prac1 {
	public static void main(String[] args) {
////426
//	    // 객체 생성
//	    SmartPhone iPhone = new SmartPhone("아이폰 X");
//	    
//	    // 객체를 알람 인터페이스(역할)로 해석
//	    Alarm alarm = (Alarm) iPhone;
//	    
//	    // 알람 기기의 비프음 내기
//	    alarm.beep();
//
//	    // 알람 기기의 음악 재생하기
//	    alarm.playMusic("상어송");
//	  }
//	}
//
//	interface Alarm {
//	  public void beep();                  // 비프음
//	  public void playMusic(String title); // 음악 재생
//	}
//
//	/* 1. Alarm 인터페이스를 해당 클래스에 구현하세요. */
//	class SmartPhone implements Alarm{
//	  private String name; // 모델명

//	  public SmartPhone(String name) {
//	    this.name = name;
//	  }
//
//	  /* 2. beep() 메소드를 오버라이딩(재정의) 하세요. */ public void beep(){
//		  System.out.println("삐빕! 삐비비빕~!");
//	  }
//	  /* 3. playMusic() 메소드를 오버라이딩하세요. */public void playMusic(String a){
//		  System.out.print("[" + a + "]을 재생합니다..!");
//	  }
//	}
//427
	    // 성기사 객체 생성
	    HolyKnight uther = new HolyKnight("우서", 180);
	    
	    // 탱커로서의 역할 수행
	    Tanker t = uther;
	    t.increaseHp();
	    
	    // 힐러로서의 역할 수행
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

	/* 1. 탱커와 힐러 역할을 부여하세요. */
	class HolyKnight implements Tanker, Healer{
	  private String name;
	  private int hp;

	  public HolyKnight(String name, int hp) {
	    this.name = name;
	    this.hp = hp;
	  }

	  /* 2. Tanker의 메소드를 오버라이딩하세요. */
	public void heal() {
		System.out.println(name + "의 체력을 +" + hp +" 회복합니다.");
	}

	  /* 3. Healer의 메소드를 오버라이딩하세요. */
	public void increaseHp() {
		System.out.println("전체 체력 +"+ hp +"증가시킵니다.");
	}

	}