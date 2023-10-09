package be.vdab;
import java.util.Arrays;

public class RandomGenerator2 {
    public static void main(String[] args) {
        var getallen = new int[100];
        for (var i = 0; i < getallen.length; i++){
            getallen [i] = (int)((Math.random()*1000) + 1);
        }

        for (var i = 0; i < getallen.length; i++){
            for (var j = i+1; j < getallen.length; j++){
                if (getallen[j] < getallen[i]){
                    var huidigGetal = getallen[i];
                    getallen[i] = getallen[j];
                    getallen[j] = huidigGetal;
                }
            }
        }

        // Arrays.sort(getallen);

        for (var getal : getallen){
            System.out.println(getal);
        }
    }
}
