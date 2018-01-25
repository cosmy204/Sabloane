
public class Imagine extends AbstractElement1 {
	

String titluImagine;

	public Imagine(String titluImagine) {
	
		this.titluImagine=titluImagine;// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Visitor v) {
		v.visitImage(this);
		
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
	
	/*
	@Override
	public void print() {
		System.out.println(titluImagine);
		
	}


	@Override
	public void addEleent(Element el) throws Exception {
		throw new Exception("Cant add element here!");// TODO Auto-generated method stub
		
	}


	@Override
	public void removeElement(Element el) throws Exception {
		throw new Exception("Cant remove element here!");// TODO Auto-generated method stub
		
	}


	@Override
	
	public Element getChild(int poz) throws Exception {
		// TODO Auto-generated method stub
		//return paragraf.get(poz);
		throw new Exception ("Cant get child here!");
	}
*/
}
