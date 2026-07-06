
public class Hero {
    private String name;
    private int hp;
    private int damage;

    public Hero(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String showInfo() {
        return "Name: " + name + ", HP: " + hp;
    }

    public void attack(Hero opponent) {
        System.out.println(this.name + " attacks " + opponent.getName() + " for " + this.damage + " damage.");
        opponent.takeDamage(this.damage);
    }

    public void takeDamage(int damage) {
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0;
        }
        System.out.println(this.name + " takes " + damage + " damage. Remaining HP: " + this.hp);
    }

}
