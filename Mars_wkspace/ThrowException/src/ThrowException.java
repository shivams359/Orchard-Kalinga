
public class ThrowException {
	
	public void ThrowException (int a , int b) {
		if(a<18||b<40)
			{
			try {
				throw  new Exception("check your details");
			} catch (Exception e) {
				e.printStackTrace();
			}
		      }
		else
			System.out.println("kindly go ahead");		
	}

}
