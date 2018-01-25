import java.util.ArrayList;

public class Capitol {
	String titlu;
	public Capitol(String titlu) {
		this.titlu=titlu;
	}
	ArrayList<Element> elemente = new ArrayList<Element>();

	
	public void addElement(Element elem)
	{
		elemente.add(elem);
	}
	
}
