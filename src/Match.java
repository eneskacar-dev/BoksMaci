import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    double startChange = 50;

    public Match(Fighter f1, Fighter f2, int minWeight , int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run (){

        if (checkWeight()){

            Random rand = new Random();            
            var change = rand.nextInt(100)>50;
            
            while (f1.healt != 0 && f2.healt != 0){
                System.out.println("======YENİ ROUND======");               

                if(change){                   
                    f2.healt = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    f1.healt = f2.hit(f1);
                    if (isWin()){
                        break;
                    } 
                }
                else{
                    f1.healt = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    f2.healt = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                }

                printScore();
            }
        }
            else {
                System.out.println("Sporcuların ağırlıkları uyuşmuyor !");
            }
        }

        public boolean checkWeight(){
            return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);

        }
        public boolean isWin(){
            if (f1.healt == 0){
                System.out.println("Maçı Kazanan: " + f2.name);
                return true;
            } else if (f2.healt == 0) {
                System.out.println("Maçı Kazanan: " + f1.name);
                return true;
            }
            return false ;
        }

        public void printScore(){
            System.out.println("------------");
            System.out.println(f1.name + " Kalan Can \t:" + f1.healt);
            System.out.println(f2.name + " Kalan Can \t:" + f2.healt);
        }

}


