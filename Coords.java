package carSimulator;

public class Coords {
public int x;
public int y;
public Coords(int x, int y){
x = this.x;
y = this.y;
}
public boolean equals(Object o) {
Coords c = (Coords) o;
return c.x == x && c.y == y;
}
/*public int hashCode() {
return new Integer(x + "0" + y);
}
*/
}