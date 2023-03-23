package package1;

import org.testng.annotations.Test;

public class LoginTest {

	@Test(priority=2)
	public void login() {
		System.out.println("Login is successfull");
	}
	@Test(priority=1)
	public void logout() {
		System.out.println("Logout is successfull");
	}
	@Test                  
	public void afhj() {
		System.out.println("zfhj is successfull");
	}
}
