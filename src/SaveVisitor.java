
public class SaveVisitor implements Visitor{
	
	String tagip;
	String tagim;
	String tagpa;
	String tagta;
	String tagse;
	String tagtestsp;
	int counttextsp=0;
	int countip=0;
	int countimg=0;
	int countpa=0;
	int counttab=0;
	int countsec=0;
	String containttestsp;
	String containt;
	String containtse;
	String containttab;
	String containtpar;
	String containtimg;
	int con;
	@Override
	public void visitImageProxy(ImageProxy ip) {
		tagip="ImageProxy";
		containt=ip.toString();
		countip++;
		con++;
	}

	@Override
	public void visitImage(Imagine img) {
		tagim="Imagine";
		containtimg=img.toString();
		countimg++;
		con++;
	}

	@Override
	public void visitParagrapf(Paragraf pa) {
		tagpa="Paragraf";
		containtpar = pa.toString();
		countpa++;
		con++;
	}

	@Override
	public void visitTabel(Tabel tab) {
		tagta="Tabel";
		containttab=tab.toString();
		counttab++;
		con++;
	}

	@Override
	public void visitSectiune(Sectiune sec) {
		tagse="Sectiune";
		containtse=sec.toString();
		countsec++;
		con++;
	}
	public void saveXML()
	{
		for(int i=0;i<con;i++) {
		if(countsec>=1)
			{
			String continutXml = "<" + tagse + "> " + containtse + "</"+ tagse + ">" ;
			System.out.println(continutXml);
			}
		if(counttab>=1)
			{
				String continutXml = "<" + tagta + "> " + containttab + "</"+ tagta + ">" ;
				System.out.println(continutXml);
			}
		if(countpa>=1)
			{
				String continutXml = "<" + tagpa + "> " + containtpar + "</"+ tagpa + ">" ;
				System.out.println(continutXml);
			}
		if(countimg>=1)
			{
				String continutXml = "<" + tagim + "> " + containtimg + "</"+ tagim + ">" ;
				System.out.println(continutXml);
			}
		}
	}

	@Override
	public void visitTextSpecial(TextSpecial textSpecial) {
		tagta="textSpecial";
		containttestsp=textSpecial.toString();
		counttextsp++;
		con++;
		
	}
	
}
