import java.util.*; //scanner import

public class FlowEx34 {

	public static void main(String[] args) {
		int menu = 0, num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		outer:                                                          //while구문에 outer이라는 이름을 붙임
			while(true) {
				System.out.println("(1) square");
				System.out.println("(2) square root");
				System.out.println("(3) log");
				System.out.println("원하는 메뉴 (1~3)를 선택하세요.(종료:0)>");
				
				String tmp = scanner.nextLine();                        //입력받은 값을 변수 tmp에 저장
				menu       = Integer.parseInt(tmp);                     //변수 menu에 tmp값을 int로 변환해서 저장
				
				if (menu == 0) {                                        //menu가 0일때
					System.out.println("프로그램을 종료합니다.");
					break;                                              //outer종료
				}else if (!(1 <= menu && menu <= 3)) {                  //menu에 입력받은 값이 0또는 1~3이 아닐 때
					System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
					continue;                                           //계속됨
				}
				
				for (;;) {
					System.out.print("계산할 값을 입력하세요.(계산 종료:0, 전체 종료: 99)>");
					tmp = scanner.nextLine();                           //입력받은 값을 변수 tmp에 저장
					num = Integer.parseInt(tmp);                        //변수 tmp의 값을 int로 변환
					
					if (num == 0)                                       //num변수 값이 0일때
						break;                                          //for구문이 끝남
					if (num == 99)                                      //num변수 값이 99일때
						break outer;                                    //outer구문 전체가 종료됨
					switch(menu) {
					case 1:
						System.out.println("result="+ num*num);
						break;
					case 2:
						System.out.println("result="+ Math.sqrt(num));
						break;
					case 3:
						System.out.println("result="+ Math.log(num));
						break;
					}
				}// for end
			}    // while end
			
	}            // main end

}
