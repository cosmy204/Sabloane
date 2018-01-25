import java.util.ArrayList;

public class TextSpecial extends AbstractElement1 implements AlignStrategy{
 
	private String text;
	private ArrayList<Element> textSpecial = new ArrayList<Element>();
	TextSpecial(String text){
		this.text=text;
	}
	public void accept(Visitor v) {
		v.visitTextSpecial(this);
		
	}

	@Override
	public void printAlign(String text) {
		// TODO Auto-generated method stub
		
	}
	public void setAlign(AlignStrategy al) {
		al.printAlign(text);
	}
	public void nnotify() {
		
	}
	@Override
	public void attach(Observer ob) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dettach(Observer ob) {
		// TODO Auto-generated method stub
		
	}
	
}
