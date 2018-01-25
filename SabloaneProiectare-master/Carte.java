package Elements;

import Useri.Visitor;

import java.util.ArrayList;

import Alinieri.AliniereCentru;
import Alinieri.AliniereDreapta;
import Alinieri.AliniereStanga;

public class Carte implements Element{

    private String title;
    // private ArrayList<Author> authors = new ArrayList<Author>();
    
    private ArrayList<Element> elements = new ArrayList<>();
    private AliniereStanga alignLeft;
    private AliniereCentru alignCenter;
    private AliniereDreapta alignRight;

    Carte(String titlu){
    	
        this.title = titlu;
    }

    public void acceptVisitor(Visitor v){
        for(Element e : elements){
            e.acceptVisitor(v);
        }
    }

    public void addElement(Element e){
        elements.add(e);
    }

    public void print(){
        System.out.println("Titlul Cartii: " + title);
        for(Element element : elements){
        	
            element.print();
          
        }
    }

    @Override
    public void add(Element e) throws Exception {

    }

    @Override
    public void remove(Element e) throws Exception {

    }

    @Override
    public Element getElement(int index) throws Exception {
        return null;
    }
}
