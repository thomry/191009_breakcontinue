
public class FlowEx31 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {  //i�� 10���� �۰ų� ���������� �ݺ�. i�� �ϳ��� �þ.
			if (i%3 == 0)                //i�� 3���� ���� �������� 0�϶�
				continue;                //�ݺ������� �� ������ �̵�.
			System.out.println(i);       //��� 3�� ����� ����� ��������.
		}

	}

}
