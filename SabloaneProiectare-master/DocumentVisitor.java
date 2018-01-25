package Useri;

import Elements.*;

public class DocumentVisitor implements Visitor{
    private static int imagineCount = 0;
    private static int paragrafCount = 0;
    private static int tabelCount = 0;
    private static int sectiuneCount = 0;
    private static int txtSpecialCount=0;

    public void printStatistics(){
    	
        System.out.println("Exista:");
        System.out.println(sectiuneCount + " Sectiuni");
        System.out.println(imagineCount + " Imagini");
        System.out.println(paragrafCount + " Paragrafe");
        System.out.println(tabelCount + " Tabele");
        System.out.println(txtSpecialCount + " Texte Speciale");
        
        System.out.println("--------------Titlu/Sectiune--------------------------");
    }


    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        imagineCount++;
    }

    @Override
    public void visitImage(Imagine imagine) {
        imagineCount++;
    }

    @Override
    public void visitParagraph(Paragraf paragraf) {
        paragrafCount++;
    }

    @Override
    public void visitTable(Tabel table) {
        tabelCount++;
    }

    @Override
    public void visitSection(Sectiune sectiune) {
        sectiuneCount++;

        for(Element e : sectiune.getElements()){
            e.acceptVisitor(this);
        }
    }
    
    
	@Override
	public void visitSpecialArt(SpecialArt text) {
		txtSpecialCount++;
	}
}
