
public class FlowEx31 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {  //i가 10보다 작거나 같을때까지 반복. i는 하나씩 늘어남.
			if (i%3 == 0)                //i를 3으로 나눈 나머지가 0일때
				continue;                //반복구문의 블럭 끝으로 이동.
			System.out.println(i);       //결과 3의 배수만 출력이 되지않음.
		}

	}

}
