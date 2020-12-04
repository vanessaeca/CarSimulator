package carSimulator;

import java.util.*;

public class CameraCensor{

// private float x;
// private float y;
// private float x2;
//private float y2;
private float maxRange;
public boolean isVertical;
public RoadMap map;
public char direction;

public CameraCensor(char direction){
map = new RoadMap();
this.direction = direction ;
}

/*public void readMap(RoadMap road[][]) {
}
*/

public HashMap<Coords, Character> findObstacles(int x, int y){
	char[][] road = map.getRoad();
	HashMap<Coords, Character> obstacles = new HashMap<Coords, Character>();
	if(direction == 'e') {
		if(x == 1) {
			for(int i = x; i<x+5; i++) {
				for(int j = y; j < y+5; j++) {
					if(road[i][j] != ' ' && road[i][j] != '.') {
						obstacles.put(new Coords(i,j), road[i][j]);
					}
				}
			}
		}
		else if(x == 2) {
			for (int i = x-1; i<x+5; i++) {
				for(int j = y; j < y+5; j++) {
					if(road[i][j] != ' ' && road[i][j] != '.') {
						obstacles.put(new Coords(i,j), road[i][j]);
					}
				}
			}
		}
		else if(x == 3) {
			for (int i = x-2; i <x+5; i++) {
				for(int j = y; j < y+5; j++) {
					if(road[i][j] != ' ' && road[i][j] != '.') {
						obstacles.put(new Coords(i,j), road[i][j]);
					}
				}
			}
		}
		else if(x == 4) {
			for(int i = x - 3; i < x+5; i++) {
				for(int j = y; j < y+5; j++) {
					if(road[i][j] != ' ' && road[i][j] != '.') {
						obstacles.put(new Coords(i,j), road[i][j]);
					}
				}
			}
		}
		else if(x >= 5) {
			for(int i = x-4; i<x+5; i++) {
				for(int j = y; j < y+5; j++) {
					if(road[i][j] != ' ' && road[i][j] != '.') {
						obstacles.put(new Coords(i,j), road[i][j]);
					}
				}
			}
		}
	}
	else if( direction == 's') {
		if(x <16) {
			for(int i = x+1; i < x+5; i++) {
				for(int j = y-5; y< y+5; y++) {
					if(road[i][j] != ' ' && road[i][j] != '.') {
						obstacles.put(new Coords(i,j), road[i][j]);
					}
				}
			}
		}
		else if(x == 16) {
			for(int i = x+1; i < x+4; i++) {
				for(int j = y-5; y< y+5; y++) {
					if(road[i][j] != ' ' && road[i][j] != '.') {
						obstacles.put(new Coords(i,j), road[i][j]);
					}
				}
			}
		}
		else if(x == 17) {
			for(int i = x+1; i < x+3; i++) {
				for(int j = y-5; y< y+5; y++) {
					if(road[i][j] != ' ' && road[i][j] != '.') {
						obstacles.put(new Coords(i,j), road[i][j]);
					}
				}
			}
		}
		else if(x == 18) {
			for(int i = x+1; i < x+2; i++) {
				for(int j = y-5; y< y+4; y++) {
					if(road[i][j] != ' ' && road[i][j] != '.') {
						obstacles.put(new Coords(i,j), road[i][j]);
					}
				}
			}
		}
		else if(x == 19) {
			for(int i = x+1; i < x+1; i++) {
				for(int j = y-5; y< y+4; y++) {
					if(road[i][j] != ' ' && road[i][j] != '.') {
						obstacles.put(new Coords(i,j), road[i][j]);
					}
				}
			}
		}
		else if(x == 20) {
			
				for(int j = y-5; y< y+4; y++) {
					if(road[x][j] != ' ' && road[x][j] != '.') {
						obstacles.put(new Coords(x,j), road[x][j]);
					}
				}
			
		}
	}
	return obstacles;
}

/*public HashMap<Coords, Character> findObstacles(int x, int y){
char[][] road = map.getRoad();
HashMap<Coords, Character> obstacle = new HashMap<Coords,Character>();
if(direction == 'e') {
for(int i = y - 2; i <= y + 2; i++){
for(int j = x + 1; i <= x + 4; j++){
// if(road[i][j] != ' ' && road[i][j] = '.')
if(road[i][j] == 'S'){
obstacle.put(new Coords(i,j), road[i][j]);
}
else if(road[i][j] == 'P') {
obstacle.put(new Coords(i,j), road[i][j]);
}

        }
    }}
    else if( direction == 'w') {
     for(int i = y - 2; i <= y + 2; i++){
            for(int j = x - 1; i <= x - 4; j++){
             if(road[i][j] == 'S'){
                    obstacle.put(new Coords(i,j), road[i][j]);
                }
                else if(road[i][j] == 'P') {
                 obstacle.put(new Coords(i,j), road[i][j]);
                }
            }
        }
    }
    else if(direction == 'n') {
     for(int i = x - 2; i <= x + 2; i++){
            for(int j = y + 1; i <= y + 4; j++){
             if(road[i][j] == 'S'){
                    obstacle.put(new Coords(i,j), road[i][j]);
                }
                else if(road[i][j] == 'P') {
                 obstacle.put(new Coords(i,j), road[i][j]);
                }
            }
        }
    }
    else {
     for(int i = x - 2; i <= x + 2; i++){
            for(int j = y - 1; i <= y - 4; j++){
             if(road[i][j] == 'S'){
                    obstacle.put(new Coords(i,j), road[i][j]);
                }
                else if(road[i][j] == 'P') {
                 obstacle.put(new Coords(i,j), road[i][j]);
                }
            }
        }
    }
    return obstacle;
}*/
/*public CameraCensor(float maxRange, float x, float y, float x2, float y2){
setMaxRange(maxRange);
setX(x);
setY(y);
}
*/

/* public float calculateDistanceXAxis() {
return x2 - x;
}

public float calculateDistanceYAxis() {
return y2-y;
}

*/
// public float read(boolean isVertical) {
//// float maxDist;
// if(isVertical) {
// return this.y + this.maxRange;
// }
// else {
// return this.x + this.maxRange;
// }
// }

public void setMaxRange(float maxRange) {
this.maxRange = maxRange;
}

public float getMaxRange() {
return maxRange;
}
/*
public void setX(float x) {
this.x = x;
}

public float getX(){
return x;
}

public void setY(float y) {
this.y = y;
}

public float getY(){
return y;
}
/
/
public String sendWarnings(){
if(isVertical) {
if(this.calculateDistanceYAxis() < this.maxRange && this.calculateDistanceYAxis() >0) {
return "You are way to close to the car in front of you";
}
else if(this.calculateDistanceYAxis() < 0 && this.calculateDistanceYAxis() > -this.maxRange) {
return "You are way to close to the car behind you";
}
else
return "You are in a safe postion";
}
else {
if(this.calculateDistanceXAxis() < this.maxRange && this.calculateDistanceYAxis() >0) {
return "You are way to close to the car on your right";
}
else if(this.calculateDistanceXAxis() < 0 && this.calculateDistanceYAxis() > -this.maxRange) {
return "You are way to close to the car on your left";
}
else
return "You are in a safe postion";
}
}
*/
	
}


 
