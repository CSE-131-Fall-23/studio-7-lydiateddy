package studio7;

import com.sun.net.httpserver.Authenticator.Result;

public class Die {
	private int n;
	
	public Die(int intin)
	{
		n = intin;
	}
	
	public int result()
	{
		return (int) (Math.random()*n + 1);
	}
	
	public static void main(String[] args) {
		Die a = new Die(6);
		System.out.println(a.result());
		
	}

}
