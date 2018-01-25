import java.awt.Image;

public class ImageProxy extends AbstractElement1{
	private String fileName;
	private Image initialImage=null;
	
	ImageProxy(String fileName) {
		this.fileName=fileName;
		//this.initialImage=loadImage(fileName);
	}
	public void print() {
		System.out.println("Try to print..");
	}
	@Override
	public void accept(Visitor v) {
			v.visitImageProxy(this);
		
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
