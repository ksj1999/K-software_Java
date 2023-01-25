
public class FirstEx0125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;

// 슬래쉬 두번 한 줄 주석

/*""" 여러 줄 주석
 * 
 * 
 */
		
		
		System.out.println("Study");
		System.out.print("Hello JAVA\n");
		System.out.print("INHA\n");
		System.out.printf("DecimalNum=%d\n", 7);
		System.out.printf("a=%d\n", a);
		
		
		//float fv = 3.14f;  데이터 타입을 플로트로 캐스팅 함
		float fv = (float)3.14;  //플로트 타입으로 형 변환 해라
		double dv = 6.28;  //더블이 더 크다
		System.out.print("fv=" + fv);  //'+' 문자열 연결 연산자
		System.out.print("fv=" + fv + "\n");  //뉴라인 문자열
		System.out.printf("fv=%f\n", fv);  //플로트는 소숫점 6째 자리까지 출력 3.140000 / f앞 .2 소숫점 2째자리까지만 출력
		System.out.printf("fv=%.2f\n", fv);  //f앞 .2 소숫점 2째자리까지만 출력
		System.out.printf("fv=%07.2f\n", fv);  //밑과 동일 다만 빈칸은 0 으로 채우라
		System.out.printf("fv=%7.2f\n", fv);  //총 7자리 확보 후 소숫점이하 2째 자리까지만, 오른쪽 정렬
		System.out.printf("fv=%-7.2f\n", fv);  //위와 동일 다만 음수는 왼쪽 정렬
		
		
		System.out.printf("df=%,2f\n", dv);  //더블
		
		
		char   ch = 'A';
		//char   ch2 = "A"  캐릭터에서 큰 따옴표는 에러난다 / 
		//""는 스트링 취급이지만 스트링은 반드시 0으로 끝나야한다 하지만 "A"는 65에서 끝난다(4Byte를 2Byte에 집어넣는 것)
		System.out.printf("ch=%c\n", ch);  //캐릭터
		System.out.printf("ch=%d\n", (int)ch);  //A에 대한 아스키 코드 값
		
		
		String name = "gildong";
		System.out.println("name=" + name);
		System.out.print("name=" + name + "\n");
		System.out.printf("name=%s\n", name);
		
		
		final double PI = 3.14;  //파이널의 용도는 세가지  - 여기서는 상수로 고정
		//PI = 3.14; 상수는 수정 불가
		System.out.printf("PI=%.2f\n", PI);  //변수는 소문자, 상수는 대문자로 쓰는 것이 관례
		
		
		int s = 15 / 2;
		int p = 13 % 4;
		System.out.printf("s=%d, p=%d\n", s, p);
		
		int m = 3;
		//m = m + 1;  //1증가 시킨다
		//++m;  //동일
		m++;  //동일
		System.out.printf("m=%d\n", m);
		
		
		
		
	}

}

