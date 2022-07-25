package org.India;


public class SouthIndian extends Indian {

	@Override
	void breakfast() {
		System.out.println("idly or Dosa");
	}
private void dressing() {
	System.out.println("saree or vaseti");
	
}
public static void main(String[] args) {
	SouthIndian s=new SouthIndian();
	s.breakfast();
	s.adharcard();
	s.pancard();
	s.voteid();
	s.dressing();
}



}
