//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio 1");
System.out.println("");
        System.out.println("prima richiesta");
        System.out.println(stringaPariDispari("ciao"));
        System.out.println("");
        System.out.println("seconda richiesta");
        System.out.println(annoBisestile(2023));
        System.out.println("");

        System.out.println("Esercizio 2");
        stampaInLettere(9);

        System.out.println("Esercizio 3");


        System.out.println("Esercizio 4");
    }


    //ESERCIZIO 1

    //PRIMA PARTE ES1
    public static boolean stringaPariDispari(String a){

        if(a.length() % 2 == 0 ){
            return true;
        } else{
            return false;
        }
    }
//SECONDA PARTE ES1
    public static boolean annoBisestile(int b){
        if( b%4==0 || b%100==0 && b% 400==0){
            return true;
        }
        else{
            return false;
        }
    }

    //ESERCIZIO 2

    public static void stampaInLettere (int n){

        switch (n){
            case 0:
             System.out.println("Zero");
            break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:System.out.println("Errore: numero non compreso tra 0 e 3");
        }
    }

}