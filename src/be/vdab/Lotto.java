package be.vdab;

public class Lotto {
    public static void main(String[] args) {
        var lotto = new int[7];

        while (lotto[lotto.length - 1] == 0) {
            var getal = (int) (Math.random() * 42 + 1);
            var index = 0;
            while (lotto[index] != getal && lotto[index] != 0) {
                index++;
            }
            if (lotto[index] == 0) {
                lotto[index] = getal;
            }
        }

        for (var i = 0; i < lotto.length-2; i++){
            for (var j = i+1; j < lotto.length-1; j++){
                if (lotto[j] < lotto[i]){
                    var huidigGetal = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = huidigGetal;
                }
            }
        }

        System.out.println("De winnende getallen zijn: ");
        for (var i = 0; i < lotto.length-1; i++){
            System.out.print(lotto[i] + "\t");
        }
        System.out.println("\nHet reserve getal is: " + lotto[lotto.length-1]);
    }
}
