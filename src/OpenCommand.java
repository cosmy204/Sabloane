
public class OpenCommand implements Command{
	private Builder build;
	private String filePath;
	OpenCommand(String filePath){
		this.filePath = filePath;
	}
	@Override
	public void execute() {
		Builder build = new ConcreteBuilderA(filePath);
		build.buildPart();
		Element book = build.getResult(); 
		DocumentManager.getInstance().setBook(book);
	}
/* in main 
 * Command openCommand = new OpenCommand(fileName);
 * openCommand.execute();
 * Command statisticscomm = new StatisticsCommand();
 * statisticscomm.execute();
 */
}
