/*
compile: javac hello.java //generate hello.class
run: java hello //run class file
 */
public class hello {
	public static void main(String[] args){
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("Hello World");
	}
}
