package ClassMemoryLayout;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openjdk.jol.info.ClassLayout;


class A {
	
}

class B {
	@SuppressWarnings("unused")
	private int a;
	public int b;
}

class C extends B {
	public int d;
}

public class ClassLayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(VMSupport.vmDetails());
		//System.out.println(ClassLayout.parseClass(C.class).toPrintable());
        Logger.getGlobal().setLevel(Level.OFF);
        Logger.getGlobal().info(ClassLayout.parseClass(C.class).toPrintable());
//        System.out.println(new File("/classes").getAbsolutePath());  
//        System.out.println("sizeOf(new Object())=" + SizeOfAgent.sizeOf(new Object()));  
//        System.out.println("sizeOf(new A())=" + SizeOfAgent.sizeOf(new A()));  
//        System.out.println("sizeOf(new B())=" + SizeOfAgent.sizeOf(new B()));  
//        System.out.println("sizeOf(new C())=" + SizeOfAgent.sizeOf(new C()));  
	}

}
