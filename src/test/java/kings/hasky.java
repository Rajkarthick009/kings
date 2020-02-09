package kings;

public class hasky {
public static void main(String[] args) {

	String name= "Rajasekar24@gmail.com";
	int up=0;
	int low=0;
	int digit=0;
	int sp=0;
for (int i = 0; i <name.length(); i++) {
char ch=name.charAt(i);	

if (Character.isUpperCase(ch)) {
	up=up+1;
}else if (Character.isLowerCase(ch)) {
	low=low+1;
	
}else if (Character.isDigit(ch)) {
	digit=digit+1;

	
}else 	sp=sp+1;
	
}
	
}

}

