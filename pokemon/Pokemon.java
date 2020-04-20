public abstract class Pokemon{
    private String name;
    private String type;
    private String gender;
    protected int hp;
    
    public Pokemon(String name){
        this.name = name;
        this.hp = 0;
        this.type = null;
    }

    public Pokemon(String name, int maxHp, String type){
        this.name = name;
        this.hp = (int)(Math.random() * maxHp);
        this.type = type;

        String[] randomGender = {"Male", "Female"};
        int index = (int)(Math.random() * 2);
        this.gender = randomGender[index];
    }

    public String getName(){
        return name;
    }

    public int getHp(){
        return hp;
    }

    public void setHp(int newHp){
        this.hp = newHp;
    }

    public String getType(){
        return type;
    }

    public String getGender(){
        return gender;
    }

    public boolean damage(int value){
        if(hp == 0){
            return false;
        }

        int currentHP = hp - value;
        if(currentHP >= 0 ){
            this.hp = currentHP;
        }else{
            this.hp = 0;
        }   
        
        return true;
    }
    
    public abstract void attack(Pokemon enemy);

    public String toString(){ // Override ตัว String
        return name;
    }
}