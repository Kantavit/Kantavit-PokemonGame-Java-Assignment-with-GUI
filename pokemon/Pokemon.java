public abstract class Pokemon{
    private String name;
    private String type;
    private String gender;
    private String image;
    protected int hp;
    
    public Pokemon(String name){
        this.name = name;
        this.hp = 0;
        this.type = null;
        this.gender = null;
        this.image = null;
    }

    public Pokemon(String name, int maxHp, String type, String image){
        this.name = name;
        this.hp = (int)(Math.random() * maxHp);
        this.type = type;

        String[] randomGender = {"Male", "Female"};
        int index = (int)(Math.random() * 2);
        this.gender = randomGender[index];

        this.image = image;
    }

    public String getName(){
        return name;
    }

    public int getHp(){
        return hp;
    }

    public void setName(String newName){
        this.name =  newName;
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

    public String getIMAGE(){
        return image;
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