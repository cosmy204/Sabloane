
public class NewCommand implements Command{
	
	@Override
	public void execute(){
		System.out.println("I start here : ");
		Element book = new Sectiune("book");
		try {
			//instance = new DocumentManager();
			book.addElement(new Paragraf("P1"));
			book.addElement(new Paragraf("P2"));
			//instance.setBook(book);
			DocumentManager.getInstance().setBook(book);
			//book.print();
			//book.print();
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
