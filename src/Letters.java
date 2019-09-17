
public class Letters {

	public static void main(String[] args) {
		Aunt();
		Grand();
		Mom();
	}
	public static void DearA() {
		System.out.println("Dear Aunnty,");
	}
	public static void DearG() {
		System.out.println("Dear Grandma,");
	}
	public static void End() {
		System.out.println("Well I won't take anymore of you time bye.");
		System.out.println("\nSincerly,\nArrow Batson");
	}
	public static void Aunt() {
		DearA(); 
		System.out.print("Hello there Jen how are you doing.\nHow was the move to your new place.\nI hope you are doing well.\nI am doing great.\nSchool is good and I have tons of friends.");
		End();
	}
	public static void Grand() {
		DearG();
		System.out.println("Hello Gandma how are you.");
		System.out.println("I hope you don't encounter any bears in the near future.");
		System.out.println("Are you and grandpa doing well.");
		System.out.println("Has grandpa somehow gotten another injure.");
		System.out.println("Is Cali doing well.");
		End();
	}
	public static void DearM() {
		System.out.println("Dear Mom,");
	}
	public static void Mom() {
		DearM();
		System.out.println("Hey mom it has been a while since we have last talked.");
		System.out.println("How are you.");
		System.out.println("How is dad.");
		System.out.println("How are Conner and Kim.");
		System.out.println("I hope that you are sill living at home and not somewhere else.");
		System.out.println("Did the tree house get finished?");
		End();
	}

}
