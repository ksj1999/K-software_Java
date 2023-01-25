
public class DataEx01 {
	public static void main(String[] args) { 
		char a='a'; //A. 
		char b="a"; //B. 
		String c="a"; //C. 
		String d='a'; //D. 
		char e='ab'; //E. 
		String f="ab"; //F.
		}
}
//B: char의 경우 “”를 사용하면 스트링으로 변환이 되는데 null 값을 저장하지 못하기 때문에 에러가 난다.
//D: string은 ""로 표기하는 것이 맞다.
//E: char에는 한가지 문자밖에 넣지 못한다.