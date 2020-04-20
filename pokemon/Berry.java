public abstract class Berry{
    private String name;
    protected int healPoints;

    public Berry(String name, int heal){
        this.name = name;
        this.healPoints = heal;
    }

    public String getName(){
        return name;
    }

    public int getHealPoints(){
        return healPoints;
    }

    public void healing(Pokemon pokemon, int value){
        int currentHP = pokemon.getHp() + value;
        pokemon.setHp(currentHP);
    }

    public abstract void heal(Pokemon pokemon);

    public String toString(){
        return name;
    }
}