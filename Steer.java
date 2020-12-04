package carSimulator;
public class Steer{
private char direction;

public Steer(){
    setDirection('e');
}

public void setDirection(char d){
    direction = d;
}

public char getDirection(){
    return direction;
}

public void move(char d, Car car, Speedometer s){
    int x = car.getX();
    int y = car.getY();
    
    while(s.getSpeed() != 0){
        if(d == 'w'){
            x = x - (s.getSpeed()/10);
        } else if(d == 'e'){
            x = x + (s.getSpeed()/10);
        } else if(d == 'n'){
            y = y - (s.getSpeed()/10);
        } else if(d == 's'){
            y = y + (s.getSpeed()/10);
        }
    }
}
}



