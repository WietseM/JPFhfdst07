package be.vdab;

public class RandomGenerator {
    public static void main(String[] args) {
        var getallen = new int [100];
        for (var i = 0; i < 10_000; i++){
            var randGetal= (int)((Math.random()*100) + 1);
            getallen[randGetal-1]++;
        }
        for (var j = 0; j < getallen.length; j++){
            System.out.println("Getal " + (j+1) + " : " + getallen[j] + " keer");
        }
    }
}
