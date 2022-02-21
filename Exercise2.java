class Pemain{
    String name;
    String role;
    double health;
    int level;

    Senjata Senjata;
    Shield shield;
    
    Pemain(String name,String role, double health, int level){
        this.name = name;
        this.role = role;
        this.health = health;
        this.level = level;
    }

    void attack(Pemain opponent){
        double attackpower = this.Senjata.attackpower;
        System.out.println(this.name + " Attacking " + opponent.name + " With Power " + attackpower);
    }

    void defense(double attackpower){
        double damage;
        if (this.shield.damageProtection < attackpower){
            damage = attackpower - this.shield.damageProtection;
        }else{
            damage = 0;
        }
        

        this.health -=attackpower;
        System.out.println(this.name + " Get Damage " + damage);
    }
    void equipSenjata(Senjata Senjata){
        this.Senjata = Senjata;
    }

    void equipShield(Shield shield){
        this.shield = shield;
    }

    void showPemain(){
        System.out.println("Nama Pemain : " + this.name);
        System.out.println("Role Pemain : " + this.role);
        System.out.println("Health Pemain : " + this.health);
        System.out.println("Level Pemain : " + this.level);
        this.Senjata.displayshow();
        this.shield.display();
    }
}


//Senjata
class Senjata{
    String name;
    double attackpower;

    Senjata(String name, double attackpower){
        this.name = name;
        this.attackpower = attackpower;
    }

    void displayshow(){
        System.out.println("Nama Senjata : " + this.name);
        System.out.println("Damage : " + this.attackpower);
    }
}


//Armor
class Shield{
    String name;
    double damageProtection;


    Shield(String name, double damageProtection){
        this.name = name;
        this.damageProtection = damageProtection;
    }

    void display(){
        System.out.println("Nama Shield : " + this.name);
        System.out.println("Defense Shield : " + this.damageProtection);
    }
}


public class Exercise2{
    public static void main(String[] args){

        Pemain Pemain1 = new Pemain("","Hansip", 60, 9);
        Senjata Pentungan = new Senjata("Pentungan",7);
        Shield seragam = new Shield("Seragam",0);
        Pemain1.equipSenjata(Pentungan);
        Pemain1.equipShield(seragam);


        System.out.println("\n");
        Pemain Pemain2 = new Pemain("Mumut","CIA Agent", 169, 65);
        Senjata Scar = new Senjata("Scar-L", 20);
        Shield Armour = new Shield("Bullet Proof Armour", 190);
        Pemain2.equipSenjata(Scar);
        Pemain2.equipShield(Armour);

        
        System.out.println("\nBattlee!!!");
        Pemain1.attack(Pemain2);
        Pemain1.showPemain();
        System.out.println("\n");
        Pemain2.showPemain();
       
    }
}
