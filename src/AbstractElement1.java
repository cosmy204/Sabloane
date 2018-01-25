
public abstract class AbstractElement1 implements Element, Subject{
	@Override
	public void addElement(Element el) throws Exception {
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

	public void print() {};
	
}
