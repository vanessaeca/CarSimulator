package carSimulator;
public abstract class Obstacle{ 
    private String type; 
    private boolean isVisible; 
    private boolean existance; 
    private int x; 
    private int y; 
  
    public String getType(){
        return type;
    }


    public void setType(String type){
        this.type = type;
    }


    public boolean getVisibility(){
        return isVisible;
    }


    public void setVisibility(boolean isVisible){
        this.isVisible = isVisible;
    }


    public boolean getExistance(){
        return existance;
    }


    public void setExistance(boolean existance){
        this.existance = existance;
    }


    public int getX(){
        return x;
    }


    public int getY(){
        return y;
    }


    public void setCoords(int x, int y){
        this.x = x;
        this.y = y;
    }


    public void show(Obstacle o){ 
        if(o.existance){ 
            o.isVisible = true;     
        } 
    } 
  
    public void remove(Obstacle o){ 
        if(o.isVisible){ 
            o.isVisible = false; 
            o.existance = false; 
        }     
    } 


    public Obstacle(String type){
        setType(type);
        setExistance(true);
        setVisibility(true);
    }


    public void update(int x, int y){
        setCoords(x, y);
    }
}

