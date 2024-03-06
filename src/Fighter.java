public class Fighter {
    String name;
    int damage;
    int healt;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int healt, int weight, double dodge){
        this.name = name;
        this.damage = damage;
        this.healt = healt ;
        this.weight = weight;
        this.dodge = dodge;

    }
    public int hit (Fighter foe){
        System.out.println("--------------");
        System.out.println(this.name + "=>" + foe.name + " " + this.damage + " hasar vurdu.");

        if (foe.dodge()){
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.healt;
        }
        if (foe.healt - this.damage < 0 ){
            return 0;
        }
        return foe.healt - this.damage ;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100 ;
        return randomValue <= this.dodge;

    }

}
