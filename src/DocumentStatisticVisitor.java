
public class DocumentStatisticVisitor implements Visitor{

	int countip=0;
	int countimg=0;
	int countpa=0;
	int counttab=0;
	int countsec=0;
	int counttextspec=0;
	public void printStatistics() {
		System.out.println("Imageproxy:" + countip + ", imagine: " + countimg + ", paragraf: " + countpa + ", tabel: " + counttab + ", sectiune: " + countsec + ",text special:" + counttextspec);

	}
	
	@Override
	public void visitImageProxy(ImageProxy ip) {
		//ip.print();
		countip++;

	
	}

	@Override
	public void visitImage(Imagine img) {
		//img.print();
		countimg++;
		
	}

	@Override
	public void visitParagrapf(Paragraf pa) {
		//pa.print();
		countpa++;
	
	}

	@Override
	public void visitTabel(Tabel tab) {
		//tab.print();
		counttab++;

	}

	@Override
	public void visitSectiune(Sectiune sec) {
		//sec.print();
		
		countsec++;
		for(Element elem:sec.getChilds()) {
			elem.accept(this);
		}
	}

	@Override
	public void visitTextSpecial(TextSpecial textSpecial) {
		counttextspec++;
		
	}


	
	

}
