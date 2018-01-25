package Useri;

import Elements.*;

public interface Visitor {

    public void visitImageProxy(ImageProxy imageProxy);
    public void visitImage(Imagine imagine);
    public void visitParagraph(Paragraf paragraf);
    public void visitTable(Tabel table);
    public void visitSection(Sectiune sectiune);
    public void visitSpecialArt(SpecialArt text);

}
