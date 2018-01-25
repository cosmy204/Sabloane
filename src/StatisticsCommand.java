
public class StatisticsCommand implements Command{

	private String filePath;
	
	StatisticsCommand (String filePath) {
		this.filePath = filePath;
	}
	@Override
	public void execute() {
		
		
		System.out.println("\n\n statistics execute...");
		Element book = DocumentManager.getInstance().getBook();
		
		DocumentStatisticVisitor visitor = new DocumentStatisticVisitor();

		book.accept(visitor);
		visitor.printStatistics();
		/*DocumentStatisticVisitor dsv = new DocumentStatisticVisitor();
		c1.accept(dsv); 		//viziteaza si tine evidenta prin numarare a fiecarui element din carte
		dsv.printStatistics(); 	//printeaza statistica rezultata mai sus
		
		
		
		System.out.println("\n\n");
		CostVisitor cvs = new CostVisitor();
		c1.accept(cvs); 		
		cvs.printStatistics(); 	*/
		
	}

}
