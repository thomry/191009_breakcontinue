public class FlowEx30 {

	public static void main(String[] args) {
		int sum = 0;
		int i   = 0;    //���� �ʱⰪ
		
		while(true) {
			if(sum>100)
				break;  //���� sum�� ���� 100���� Ŭ�� while������ ����
			++i ;       //i���� �þ
			sum += i;   //���� sum�� i�� ���� ����
		}               //while end
		
		System.out.println("i="+i);
		System.out.println("sum="+sum);

	}

}
