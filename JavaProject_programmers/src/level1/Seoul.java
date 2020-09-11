package level1;

public class Seoul {
	public String solution(String[] seoul) {
		String answer = "";
		String name = "Kim";
		
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals(name)) {
				answer = "김서방은" + i + "에 있다";
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Seoul s = new Seoul();
		String[] name= {"Jane", "Kim"};
		System.out.println(s.solution(name));
	}

}
