package Elements;

import Useri.Visitor;

public class Paragraf implements Element{

    private String title;
    private String text;

    Paragraf(String title, String text){
        this.title = title;
        this.text = text;
    }

    @Override
    public void acceptVisitor(Visitor v) {
        v.visitParagraph(this);
    }

    @Override
    public void add(Element e) throws Exception{
        throw new Exception("This method cannot be used for this Element");
    }

    @Override
    public void remove(Element e) throws Exception{
        throw new Exception("This method cannot be used for this Element");
    }

    @Override
    public Element getElement(int e) throws Exception{
        throw new Exception("This method cannot be used for this Element");
    }

    @Override
    public void print() {
    	
    	
    	System.out.println(text);
    	
    }
}
