package backtracking;

public class printPath {

    static void print(int sr, int sc, int er, int ec,String s)
    {
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        //go down way
       print(sr+1, sc, er, ec, s+"D");
        //go right way
       print(sr, sc+1, er, ec, s+"R");
       
    }
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        print(1, 1, rows, cols, "");
    }
}
