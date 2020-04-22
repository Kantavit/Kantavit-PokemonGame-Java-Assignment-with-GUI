public abstract class Berry{
    private String name;
    private String image;
    protected int healPoints;

    public Berry(String name, int heal, String image){
        this.name = name;
        this.healPoints = heal;
        this.image = image;
    }

    public String getName(){
        return name;
    }

    public int getHealPoints(){
        return healPoints;
    }

    public String getIMAGE(){
        return image;
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