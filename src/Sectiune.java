import java.util.ArrayList;

public class Sectiune implements Element {
	private String titlu;
	ArrayList<Element> secContinut = new ArrayList<Element>();
	public Sectiune(String titlu) {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addElement(Element el) throws Exception {
		// TODO Auto-generated method stub
		this.secContinut.add(el);
	}
	public ArrayList<Element> getChilds (){
		return secContinut;
		
	}
	public void removeElement(Element el) throws Exception{
		this.secContinut.remove(el);
	}
	public Element getChild(int poz) {
		return  secContinut.get(poz);
	}
	public void print() {
		for(int i=0;i<secContinut.size();i++) {
			System.out.println(secContinut.get(i));
		}
	}

	@Override
	public void accept(Visitor v) {
		v.visitSectiune(this);
		
	}
	public void nnotify() {
		
	}
	
	
}
