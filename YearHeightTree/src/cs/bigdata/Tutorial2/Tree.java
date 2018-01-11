package cs.bigdata.Tutorial2;

public class Tree {
    public double height = 0;
    public double year = 2000;
    
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getYear() {
        return year;
    }
    public void setYear(double year) {
        this.year = year;
    }
    
    public Tree(String full_string){
        super();
        
        String[] array = full_string.split(";");
        String year = array[5];
        String height = array[6];
        if(year.length()>0){
            this.year = Double.valueOf(year);
        }
        if(height.length()>0){
            this.height = Double.valueOf(height);        
        }
    }
    
    public void displayTree(){
        System.out.println("Height of the tree :");
        System.out.println(this.height);
        System.out.println("Age of the tree");
        System.out.println(this.year);
    }
    
    
    

}