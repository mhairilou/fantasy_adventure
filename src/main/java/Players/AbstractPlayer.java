package Players;

public abstract class AbstractPlayer {

    private String name;
    private int hp;

    public AbstractPlayer(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName(){ return this.name; }
    public int getHp(){ return this.hp; }
    public void setHp(int newHp){ this.hp = newHp; }
}
