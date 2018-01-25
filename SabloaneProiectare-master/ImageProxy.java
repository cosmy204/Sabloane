package Elements;

import Useri.Visitor;

public class ImageProxy extends AbstractElement {
    private String fileName;
    private Imagine realImage = null;

    ImageProxy(String fileName){
        this.fileName = fileName;
    }

    public void acceptVisitor(Visitor v){
        v.visitImageProxy(this);
    }

    public void print(){
        if(realImage == null){
            realImage = new Imagine(fileName);
            realImage.print();
        }
    }
}
