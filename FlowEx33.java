
public class FlowEx33 {

	public static void main(String[] args) {       // for ������ Loop1�̶�� �̸��� ����
		Loop1 : for (int i = 2; i <= 9; i++) {     // 2���� �ϳ��� �þ�� ���� i�� 9�� �۰ų� ������������ �ݺ�
			for (int j = 1; j <= 9; j++) {         // 1���� �ϳ��� �þ�� ���� j�� 9�� �۰ų� ������������ �ݺ�
				if ( j == 5)                       // ���� j�� 5�� ��������
					break Loop1;                   // Loop1�� ����
					//break;                       // System.our.println();���� �Ѿ
					//continue Loop1;              // i end�� �Ѿ�� System.out.println();���� �Ѿ
					//continue;                    // Loop1 end�� �Ѿ�� Loop1��ü�� ����
				System.out.println(i+"*"+ j +"="+ i*j);
			} //i end
			System.out.println();
		} //Loop1 end

	}

}
