public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World");
		int num = 123, sum = 0;
		while(num > 0){
			sum = sum + num%10;
			num = num / 10;
		}
		System.out.println("Sum is: "+sum);
    }
}