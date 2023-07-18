import java.util.Scanner;
public class BurcBul {
    public static void main(String[] args) {

        int day, month;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();
        System.out.print("Doğduğunuz ay: ");
        month = input.nextInt();

        if(month==3){
            if(day>=21 && day<=31){
                System.out.println("Koç");
            } else if(day>=1 && day<=20){
                System.out.println("Balık");
            } else{
                System.out.println("Gün değeri [1-31] aralığında olmalıdır");
            }
        }

        if(month==4){
            if(day>=1 && day<=20){
                System.out.println("Koç");
            } else if(day>=21 && day<=30){
                System.out.println("Boğa");
            } else{
                System.out.println("Gün değeri [1-30] aralığında olmalıdır");
            }
        }

        if(month==5){
            if(day>=1 && day<=21){
                System.out.println("Boğa");
            } else if(day>=22 && day<=31){
                System.out.println("İkizler");
            } else{
                System.out.println("Gün değeri [1-31] aralığında olmalıdır");
            }
        }

        if(month==6){
            if(day>=1 && day<=22){
                System.out.println("İkizler");
            } else if(day>=23 && day<=30){
                System.out.println("Yengeç");
            } else{
                System.out.println("Gün değeri [1-30] aralığında olmalıdır");
            }
        }

        if(month==7){
            if(day>=1 && day<=22){
                System.out.println("Yengeç");
            } else if(day>=23 && day<=31){
                System.out.println("Aslan");
            } else{
                System.out.println("Gün değeri [1-31] aralığında olmalıdır");
            }
        }

        if(month==8){
            if(day>=1 && day<=22){
                System.out.println("Aslan");
            } else if(day>=23 && day<=31){
                System.out.println("Başak");
            } else{
                System.out.println("Gün değeri [1-31] aralığında olmalıdır");
            }
        }

        if(month==9){
            if(day>=1 && day<=22){
                System.out.println("Başak");
            } else if(day>=23 && day<=30){
                System.out.println("Terazi");
            } else{
                System.out.println("Gün değeri [1-30] aralığında olmalıdır");
            }
        }

        if(month==10){
            if(day>=1 && day<=22){
                System.out.println("Terazi");
            } else if(day>=23 && day<=31){
                System.out.println("Akrep");
            } else{
                System.out.println("Gün değeri [1-31] aralığında olmalıdır");
            }
        }

        if(month==11){
            if(day>=1 && day<=21){
                System.out.println("Akrep");
            } else if(day>=22 && day<=30){
                System.out.println("Yay");
            } else{
                System.out.println("Gün değeri [1-30] aralığında olmalıdır");
            }
        }

        if(month==12){
            if(day>=1 && day<=21){
                System.out.println("Yay");
            } else if(day>=22 && day<=31){
                System.out.println("Oğlak");
            } else{
                System.out.println("Gün değeri [1-31] aralığında olmalıdır");
            }
        }

        if(month==1){
            if(day>=1 && day<=21){
                System.out.println("Oğlak");
            } else if(day>=22 && day<=31){
                System.out.println("Kova");
            } else{
                System.out.println("Gün değeri [1-31] aralığında olmalıdır");
            }
        }

        if(month==2){
            if(day>=1 && day<=19){
                System.out.println("Kova");
            } else if(day>=20 && day<=29){
                System.out.println("Balık");
            } else{
                System.out.println("Gün değeri [1-29] aralığında olmalıdır");
            }
        }

    }

}
