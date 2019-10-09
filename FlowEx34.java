import java.util.*; //scanner import

public class FlowEx34 {

	public static void main(String[] args) {
		int menu = 0, num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		outer:                                                          //while������ outer�̶�� �̸��� ����
			while(true) {
				System.out.println("(1) square");
				System.out.println("(2) square root");
				System.out.println("(3) log");
				System.out.println("���ϴ� �޴� (1~3)�� �����ϼ���.(����:0)>");
				
				String tmp = scanner.nextLine();                        //�Է¹��� ���� ���� tmp�� ����
				menu       = Integer.parseInt(tmp);                     //���� menu�� tmp���� int�� ��ȯ�ؼ� ����
				
				if (menu == 0) {                                        //menu�� 0�϶�
					System.out.println("���α׷��� �����մϴ�.");
					break;                                              //outer����
				}else if (!(1 <= menu && menu <= 3)) {                  //menu�� �Է¹��� ���� 0�Ǵ� 1~3�� �ƴ� ��
					System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. (����� 0)");
					continue;                                           //��ӵ�
				}
				
				for (;;) {
					System.out.print("����� ���� �Է��ϼ���.(��� ����:0, ��ü ����: 99)>");
					tmp = scanner.nextLine();                           //�Է¹��� ���� ���� tmp�� ����
					num = Integer.parseInt(tmp);                        //���� tmp�� ���� int�� ��ȯ
					
					if (num == 0)                                       //num���� ���� 0�϶�
						break;                                          //for������ ����
					if (num == 99)                                      //num���� ���� 99�϶�
						break outer;                                    //outer���� ��ü�� �����
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
