import java.util.*; //Scanner import

public class FlowEx32 {

	public static void main(String[] args) {
		int menu = 0, num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");
			
			String tmp = scanner.nextLine();                         //입력받은 값을 변수 tmp에 저장
			menu = Integer.parseInt(tmp);                            //변수 tmp의 값을 변수 menu에 int로 변환하여 저장
			
			if(menu == 0) {                                          //menu 0번이 입력되었을 때
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(!(1 <= menu && menu <= 3)) {                    //menu에 0혹은 1~3번 외의 번호가 입력되었을 때
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;
			}
			
			System.out.println("선택하신 메뉴는 "+menu +"번 입니다.");
		} //while end

	}

}
