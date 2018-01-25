import java.util.ArrayList;

public class Carte implements Element{
private String titlu;
private ArrayList<Autor> aTeam;
private ArrayList<Element> continut = new ArrayList<Element>();

	public Carte(String titlu,ArrayList<Autor> aTeam) {
		// TODO Auto-generated constructor stub
		this.titlu=titlu;
		this.aTeam=aTeam;
	}
	public void addCapitol(Element el) {
		this.continut.add(el);
	}
	
	public void print() {
		for(int i=0;i<continut.size();i++) {
			System.out.println(continut.get(i));
		}
	}
	public void accept(Visitor v) {
		for(Element e:continut) {
			e.accept(v);
		}
	}
	@Override
	public void addElement(Element el) throws Exception {
		// TODO Auto-generated method stub
		this.continut.add(el);
	}
	public void removeElement(Element el) throws Exception{
		this.continut.remove(el);
	}
	public Element getChild(int poz) {
		return  continut.get(poz);
	}
	
}
