public class FlowEx30 {

	public static void main(String[] args) {
		int sum = 0;
		int i   = 0;    //변수 초기값
		
		while(true) {
			if(sum>100)
				break;  //변수 sum의 값이 100보다 클때 while구문이 깨짐
			++i ;       //i값이 늘어남
			sum += i;   //변수 sum에 i의 값을 더함
		}               //while end
		
		System.out.println("i="+i);
		System.out.println("sum="+sum);

	}

}
