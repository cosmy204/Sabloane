import java.util.ArrayList;

public class Paragraf extends AbstractElement1 implements AlignStrategy {

private String text;
private ArrayList<Element> paragraf = new ArrayList<Element>();
	public Paragraf(String text) {
	
		this.text=text;// TODO Auto-generated constructor stub
	}
	public void setText(String txt) {
		this.text=txt;
	}
	public void print() {
	//	printAlign(text);
	}
	public void setAlign(AlignStrategy al) {
		al.printAlign(text);
	}
	public String changeText(String text) {
	
			setText(text);
			return text;
		
	}
	/*
	public void addEleent(Element el) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("No suported element");
	}

	
	public void removeElement(Element el) throws Exception {
		throw new Exception("Cand add element here!");
		// TODO Auto-generated method stub
		
	}

	
	public Element getChild(int poz) throws Exception {
		// TODO Auto-generated method stub
		//return paragraf.get(poz);
		throw new Exception ("Cant get child here!");
	}
*/
	@Override
	public void printAlign(String text) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void accept(Visitor v) {
		v.visitParagrapf(this);
		
	}
	public void nnotify() {
		if(changeText(text) != null)
		{
			System.out.println(" it was modified! ");
		}
		else
		{
			System.out.println(" no modifie here !");
		}
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
