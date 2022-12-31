//bir isin gerçekleştirilmesi için birden fazla işin bir arada gereçkelenmesi gerekiyorsa
//tüm bu isleri istemciye göstermeden başka-yerde toplamamı saglar


public class FacadeMain {
    public static void main(String[] args) {
        //Film _------- start

 FilmStart filmStart=new FilmStart(15,true,"Matrix",65);
 FilmFinish filmFinish=new FilmFinish(75,false,0);

        //Film_-------Finally


    }
}