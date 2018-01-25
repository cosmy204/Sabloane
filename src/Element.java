
public interface Element{// extends Clonable{
//	public String name;
//	public Element(String name) {
	//	this.name=name;
	//}
	public abstract void print() ;
	
	public abstract void addElement(Element el) throws Exception;
	
	public abstract void removeElement(Element el) throws Exception;
	public abstract Element getChild(int poz) throws Exception ;

	public abstract void accept(Visitor v);
}
