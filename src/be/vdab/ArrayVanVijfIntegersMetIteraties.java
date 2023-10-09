package be.vdab;

public class ArrayVanVijfIntegersMetIteraties {
    public static void main(String[] args) {
        var getallen = new int [5];
        var som = 0;
        for (var i = 0; i< getallen.length; i++){
            getallen[i]= (int)((Math.random()*100) + 1);
            som += getallen[i];
        }
        for (var getal : getallen){
            System.out.println(getal);
        }
        var gemiddelde = (float)som/getallen.length;
        System.out.println("Som = " + som);
        System.out.println("Gemiddelde = " + gemiddelde);



    }
}
