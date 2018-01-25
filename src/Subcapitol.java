import java.util.ArrayList;

public class Subcapitol 
{
	ArrayList<Element> elemente = new ArrayList<Element>();

	
	public Subcapitol() 
	{
		
		
	}
	
	public void addElement(Element elem)
	{
		elemente.add(elem);
	}
	
	public void print()
	{
		for(Element el:elemente)
		{
			System.out.println(el.toString());
		}
		
	}
	
}
