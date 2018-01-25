import java.util.ArrayList;

public class Tabel extends AbstractElement1 {
	
private String titluTabel;
	public Tabel(String titluTabel) {
		
		this.titluTabel=titluTabel;// TODO Auto-generated constructor stub
	}
	
	@Override
	public void print() {
		//System.out.println(titluTabel);
		
	}
/*
	@Override
	public void addEleent(Element el) throws Exception {
		throw new Exception ( "Cant add element here!");// TODO Auto-generated method stub
		
	}

	@Override
	public void removeElement(Element el) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Cant remove element here!");
		
	}

	@Override
	
	public Element getChild(int poz) throws Exception {
		// TODO Auto-generated method stub

		throw new Exception ("Cant get child here!");
	}
*/

	@Override
	public void accept(Visitor v) {
		v.visitTabel(this);
		
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
