import java.lang.annotation.ElementType;

public class DocumentStatisticsVisitor implements Visitor{
	int countParagraf=0;
	int countTabel=0;
	int countImagine=0;
	int countSubcapitol=0;
	int countCapitol=0;
	int countSectiune=0;
	
	public void visitImageProxy(ImageProxy e)
	{
		countImagine++;
	}
	
	public void visitImage(Imagine e)
	{
		countImagine++;
	}
	
	public void visitParagraf(Paragraf e)
	{
		countParagraf++;
	}
	
	public void visitTabel(Tabel e)
	{
		countTabel++;
	}
	
	public void visitSubcapitol(Subcapitol e)
	{
		countSubcapitol++;
		for(Element el : e.elemente)
		{
			if(el instanceof Subcapitol)//NOPE
				countSubcapitol++;//NOPE
			
			el.accept(this);
		}
	}
	
	public void visitCapitol(Capitol e)
	{
		countCapitol++;
		for(Element el : e.elemente)
		{
			if(el instanceof Capitol)//NOPE
				countCapitol++;//NOPE
			
			el.accept(this);
		}
	}
	
	public void visitSectiune(Sectiune e)
	{
		countSectiune++;		for(Element el : e.secContinut)
		{
			if(el instanceof Subcapitol)//NOPE
				countSectiune++;//NOPE
			
			el.accept(this);
		}
	}
	
	public void printStatistics()
	{
		System.out.println("STATISTICA ELEMENTE:\n NrImagini: "+countImagine+"\n NrTabele: "+countTabel+"\n NrParagrafe: "+countParagraf+"\n NrSectiune: "+countSectiune);
	}

	@Override
	public void visitParagrapf(Paragraf pa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTextSpecial(TextSpecial textSpecial) {
		// TODO Auto-generated method stub
		
	}
}
