package Observer;

public class LabSP {


public static void main(Strings[] args){	
	Observer o= new SimpleObserver();
	Paragraph p1= new Paragraph(....);
		Paragraph p2=new Paragraph(...);
		Image img=new Image(....);
		Sectiune s= new Sectiune(...);
		p1.attach(s);
		p2.attach(s);
		img.attach(s);
		s.attach(s);
		s.addElemelnt(p1);
		x.addElement(img);
	}
}