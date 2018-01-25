package Elements;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import Useri.Visitor;

public class Imagine extends AbstractElement{

    private String fileName;
    private BufferedImage image;

    Imagine(String fileName){
        this.fileName = fileName;
        //try{
         //  image = ImageIO.read(new File(fileName));
       //} catch (Exception e){
        //    System.out.println(e.getMessage());
       //}
    }

    public void acceptVisitor(Visitor v){
        v.visitImage(this);
    }

    @Override
    public void print() {
    	
        System.out.println("Fisiere(Imagini): " + fileName);
    }
}
