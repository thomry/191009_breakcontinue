import java.util.*; //Scanner import

public class FlowEx32 {

	public static void main(String[] args) {
		int menu = 0, num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("���ϴ� �޴�(1~3)�� �����ϼ���.(����:0)>");
			
			String tmp = scanner.nextLine();                         //�Է¹��� ���� ���� tmp�� ����
			menu = Integer.parseInt(tmp);                            //���� tmp�� ���� ���� menu�� int�� ��ȯ�Ͽ� ����
			
			if(menu == 0) {                                          //menu 0���� �ԷµǾ��� ��
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else if(!(1 <= menu && menu <= 3)) {                    //menu�� 0Ȥ�� 1~3�� ���� ��ȣ�� �ԷµǾ��� ��
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
				continue;
			}
			
			System.out.println("�����Ͻ� �޴��� "+menu +"�� �Դϴ�.");
		} //while end

	}

}
