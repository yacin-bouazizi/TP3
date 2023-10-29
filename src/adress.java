public class adress {

    public String gouvernorat;
    public String ville;
    public int codepostale;

    public adress(String gouvernorat, String ville, int codepostale) {
        this.gouvernorat = gouvernorat;
        this.ville = ville;
        this.codepostale = codepostale;
    }

    public adress() {
    }
    public void Afficher(){
        System.out.println("gouvernorat:"+gouvernorat+"ville"+ ville+"codepostale"+codepostale);
    }

}
