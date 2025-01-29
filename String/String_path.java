package String;
public class String_path {
    public static double get_shortest_path(String path){
     int x = 0, y =0;
     for(int i = 0; i<path.length(); i++){
        char direction = path.charAt(i);
        // north
        if(direction=='N'){
           y++;
        }
        // south
        else if(direction=='S'){
           y--;
        }
        // west
        else if(direction=='W'){
           x--;
        }
        // east
        else{
           x++;
        }
     }
     double X2 = x*x;
     double Y2 = y*y;
     return Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
       System.out.println( "The Shortest path is = "+get_shortest_path(path));
    }
}
