package tdd;

public class Baby {
    private int age;
    private int weight;
    private String name;
    
    
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public Baby (int weight){
        this.weight= weight;
    }
    public int getWeightInKg(){
        return weight;
    }
}