package testNgFeature;
import org.testng.annotations.Test;

public class DependencyTest {
	@Test
	public void meth1()
	{
		System.out.println("m1");
		int x=10/2;
	}
	@Test(dependsOnMethods="meth1")
	public void meth2()
	{
		System.out.println("m2");
	}

}
