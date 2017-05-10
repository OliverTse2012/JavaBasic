package assertion;

public class AssertFoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//断言1结果为true，则继续往下执行 
		int x = 1;
		
        assert x > 0; 
        System.out.println("断言1没有问题，Go！"); 

        System.out.println("\n-----------------\n"); 

        //断言2结果为false,程序终止 
        assert x < 0 : x; 
        System.out.println("断言2没有问题，Go！"); 
	}

}
