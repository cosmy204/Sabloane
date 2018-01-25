import javax.swing.SwingUtilities;

//import gui.NewCommand;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String []args) throws Exception
	{
		Carte ca = new Carte(null, null);
		Paragraf p = new Paragraf("Paragraf 1 ");
		p.setAlign(new LeftAlign());
		Tabel t = new Tabel("Tabelul");
		//t.addEleent(null);
		Paragraf p2 = new Paragraf("Paragraf 2");
		p2.setAlign(new CenterAlign());
		Sectiune se = new Sectiune("Sectiunea");
		TextSpecial txtsp = new TextSpecial("Acesta este textul special!");
		txtsp.setAlign(new CenterAlign());
		se.addElement(p);
		se.addElement(t);
		se.addElement(p2);
		ca.addElement(se);
		ca.addElement(txtsp);
		ca.print();
		//se.addElement(p);
		//ca.addElement(p2);
		//System.out.println(p.text + t.titluTabel );
		se.print();
		DocumentStatisticVisitor doc = new DocumentStatisticVisitor();
		ca.accept(doc);
		doc.printStatistics();
		SaveVisitor sv =  new SaveVisitor();
		ca.accept(sv);
		sv.saveXML();	
		// lab 7 
		Builder builder = new ConcreteBuilderA("C:\\Users\\sfetc\\OneDrive\\Documents\\GitHub\\Carte\\src\\book.json");
		builder.buildPart();
		Element book = builder.getResult();
		

		System.out.println("\n\n");
		DocumentStatisticsVisitor dsv = new DocumentStatisticsVisitor();
		ca.accept(dsv); 		//viziteaza si tine evidenta prin numarare a fiecarui element din carte
		dsv.printStatistics(); 	//printeaza statistica rezultata mai sus
		
		//lab7
		System.out.println("\n\n\nPrintarea ");
		Builder build = new ConcreteBuilderA("C:\\Users\\sfetc\\OneDrive\\Documents\\GitHub\\Carte\\src\\book.json");
		build.buildPart();
		//lab9
	/*	System.out.println("\n\n\nPrintarea lab 9 ");
		Command openCommand = new OpenCommand("C:\\Users\\Jess\\Documents\\GitHub\\Carte\\src\\book.json");
		openCommand.execute();
		Command statisticscomm = new StatisticsCommand("C:\\Users\\Jess\\Documents\\GitHub\\Carte\\src\\book.json");
		statisticscomm.execute();
		*/
		//;
		NewCommand nc = new NewCommand();
		nc.execute();
		Element book1 = DocumentManager.getInstance().getBook();
		book1.print();
		/*Command delc = new DeleteCommand();
		delc.execute();
		book1.print();
		Comand undocmnd = new UndoCommand();
		undocmnd.execute();
		book.DocumentManager.getInstance.setBook();
		 */	
		/* lab 12 */
		ChangeMonitor cm = new ChangeMonitor();
		Paragraf paragr = new Paragraf("Changemonitor paragraf");
		p.attach(cm);
		p.changeText("PSD");
		p.nnotify();
		}
}
