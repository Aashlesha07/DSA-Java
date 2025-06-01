package RecursionAdv;

public class TowerOfHonoi {
    
    public static void towerHonoi(int n , String s, String h, String d){
        if(n == 1) {
            System.out.println("transfer disk " + n + " from " + s + " to " + d);
            return;
            }
        towerHonoi(n-1, s, d, h);
        System.out.println("transfer "+h+"from "+h+"to "+d);
        towerHonoi(n-1, h, s, d);
    }
    public static void main(String[] args) {
        int n = 3;
        towerHonoi(n,"s", "h", "d");
    }
}
