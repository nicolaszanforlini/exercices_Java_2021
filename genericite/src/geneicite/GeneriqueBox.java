package geneicite;



public class GeneriqueBox<ELEMENT> {

    private ELEMENT element;

    public GeneriqueBox(ELEMENT e){
        this.setElement( e );
    }

    public void setElement(ELEMENT element) {
        if (element == null) throw new NullPointerException("null not permit");
        this.element = element;
    }
    public ELEMENT getElement() {
        return element;
    }
}
