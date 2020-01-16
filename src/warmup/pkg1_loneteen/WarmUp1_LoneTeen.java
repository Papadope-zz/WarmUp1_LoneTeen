package warmup.pkg1_loneteen;

public class WarmUp1_LoneTeen {

    public static void main(String[] args) {

    }
    //checking when the a is true makes the b false and when b true then a false
    public boolean loneTeen(int a, int b) {

        return ((a >= 13 && a <= 19) ^ (b >= 13 && b <= 19));
    }

}
