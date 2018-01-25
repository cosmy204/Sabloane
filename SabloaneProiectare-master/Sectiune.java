package Elements;

import java.util.ArrayList;

import Useri.Visitor;

public class Sectiune implements Element {

    private String title;
    private ArrayList<Element> elements = new ArrayList<>();

    Sectiune(String title){
        this.title = title;
    }

    @Override
    public void acceptVisitor(Visitor v) {
        v.visitSection(this);
    }

    @Override
    public void add(Element e) {
        this.elements.add(e);
    }

    @Override
    public void remove(Element e) {
        elements.remove(e);
    }

    @Override
    public Element getElement(int index) {
        return elements.get(index);
    }

    @Override
    public void print() {
        System.out.println(title);
        System.out.println("------------------Paragrafe----------------------");
        for(Element element : elements){
            element.print();
             
        }
        System.out.println("----------------Fisiere------------------------");
        
    }

    public ArrayList<Element> getElements(){
        return elements;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
