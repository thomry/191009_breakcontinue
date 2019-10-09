
public class FlowEx33 {

	public static void main(String[] args) {       // for 구문에 Loop1이라는 이름을 붙임
		Loop1 : for (int i = 2; i <= 9; i++) {     // 2에서 하나씩 늘어나는 변수 i는 9와 작거나 같아질때까지 반복
			for (int j = 1; j <= 9; j++) {         // 1에서 하나씩 늘어나는 변수 j는 9와 작거나 같아질때까지 반복
				if ( j == 5)                       // 만약 j가 5와 같아지면
					break Loop1;                   // Loop1이 끝남
					//break;                       // System.our.println();으로 넘어감
					//continue Loop1;              // i end로 넘어가며 System.out.println();으로 넘어감
					//continue;                    // Loop1 end로 넘어가며 Loop1자체가 끝남
				System.out.println(i+"*"+ j +"="+ i*j);
			} //i end
			System.out.println();
		} //Loop1 end

	}

}
