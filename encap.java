class EncapsulationDemo{
    
    private String Name;
    private int Age;

    //Getter and Setter methods
   

    public String getName(){
        return Name;
    }

    public int getAge(){
        return Age;
    }

    public void setAge(int newAge){
        Age = newAge;
    }

    public void setName(String newName){
        Name = newName;
    }

   
}
public class encap{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setName("Aakash");
         obj.setAge(25);
        
         System.out.println(" Name: " + obj.getName());
        
         System.out.println(" Age: " + obj.getAge());
    } 
}