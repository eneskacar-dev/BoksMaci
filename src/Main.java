public class Main {
    public static void main(String[] args) {

     Fighter Avatar_Atakan = new Fighter("Avatar Atakan",20,100,85,20);
     Fighter Adem = new Fighter("Adem Kılıççı",20,80,85,20);
     Match r = new Match(Avatar_Atakan,Adem,70,90);
     r.run();
    

    }
}