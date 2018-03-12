public class EmployeeT {

    private String name;
    private int nbr;
    private String text;

    public EmployeeT(int nbr,String name,String text){
        this.nbr=nbr;
        this.name= name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "EmployeeT{" +
                "name='" + name + '\'' +
                ", nbr=" + nbr +
                ", text='" + text + '\'' +
                '}';
    }
}
