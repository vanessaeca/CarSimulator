package carSimulator;

import java.util.*;

public class Car {
private Speedometer speedometer;
private Steer steer;
private int x, y;
private boolean isVisible;
private int whenLeftTurn, whenRightTurn;
private CameraCensor censor;
private HashMap<Coords, Character> obstacles;
private char direction;

public Car (int x, int y, int roadNumber, char direction){
    setCoords(x, y);
    censor = new CameraCensor(roadNumber, direction);
}

public void setCoords(int x, int y){
    this.x = x;
    this.y = y;
}

public int getX(){
    return x;
}

public int getY(){
    return y;
}

public void action(){
    Coords carCoords = new Coords(x,y);
    obstacles = null;
    obstacles = censor.findObstacles(x, y);
    if(obstacles != null){
        for(int i = 0; i<obstacles.size(); i++)
        {

            

        }
        
        /*

        misal punya 2 list, lisst obstacle dan arraylist(x,y)
            
        

        if liat S
            call method print nanya mau berhenti atau tidak
            if yes, stop
            else, keep going
        if liat P
            call method print nanya mau berhenti atau tidak
            park (ke pinggir)
        if liat orang
            slowdown
        if ada lampu merah
            berhenti
        if lampu kuning
            decelerate
        if lampu hijau 
            keep going
        if depan ada mobil
            cek distance difference(?)
         */

    }
    
}

public int getRightTurn(){
    return whenRightTurn;
}

public void setRightTurn(int r){
    whenRightTurn = r;
}

public int getLeftTurn(){
    return whenLeftTurn;
}

public void setLeftTurn(int l){
    whenLeftTurn = l;
}

public void findTurns(){
    ;
}






public void accelerate(int n){
    for(int i = 1; i < n; i++){
        if(speedometer.getSpeed() < Speedometer.MAX_SPEED){
            speedometer.setSpeed(speedometer.getSpeed() + 1);
        } else { 
            speedometer.setSpeed(200);
            break;
        }
    }
}

public void accelerateToN(int n){
    while(speedometer.getSpeed() < n){
        speedometer.setSpeed(speedometer.getSpeed() + 1);
        if(speedometer.getSpeed() > n){
            speedometer.setSpeed(n);
        }
    }
}

public void decelerate(int n){
    for(int i  = 1; i < n; i++){
        if(speedometer.getSpeed() > 0){
            speedometer.setSpeed(speedometer.getSpeed() - 1);
        } else {
            speedometer.setSpeed(0);
            break;
        }
    }
}
public void decelerateToN(int n){
    while(speedometer.getSpeed() > n){
        speedometer.setSpeed(speedometer.getSpeed() - 1);
        if(speedometer.getSpeed() < n){
            speedometer.setSpeed(n);
        }
    }
}
}