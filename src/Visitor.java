
public interface Visitor {
	void visitImageProxy(ImageProxy ip);
	void visitImage(Imagine img);
	void visitParagrapf(Paragraf pa);
	void visitTabel(Tabel tab);
	void visitSectiune(Sectiune sec);
	void visitTextSpecial(TextSpecial textSpecial);

}
