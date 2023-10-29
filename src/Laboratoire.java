public class Laboratoire {
    public String nom;
    public String specialite;
    Bureau[] bureaux=new Bureau[50];
    adress adress=new adress();
    public void Afficher(){
        System.out.println("nom:"+nom+"specialite"+specialite);
    }

}