package Elements;

import java.util.ArrayList;

import Useri.Visitor;

public class SpecialArt implements Element{
	
	private String text;

    SpecialArt(String text){
        this.text = text;
    }

    @Override
    public void acceptVisitor(Visitor v) {
    	
        v.visitSpecialArt(this);
    
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
    	System.out.println("------------------TextSpecial----------------------");
        System.out.println("Text Special:"+text);
        System.out.println("----------------------------------------");
        
    }

    public void setTitle(String text){
        this.text = text;
    }
}
