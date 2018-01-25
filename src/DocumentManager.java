
public class DocumentManager {
//e sablon singleton
	private static DocumentManager instance;
	private  Element book;
	
	private DocumentManager() {
		
	}
	public static DocumentManager getInstance(){
		if(instance == null)
			instance = new DocumentManager();
		return instance;
		
	}
	public void setBook(Element book) {
		this.book = book;
		
	}
	public Element getBook() {
		// TODO Auto-generated method stub
		return book;

	}
	
}
