package academy.devdojo.maratonajava.Basico.aula04_EstruturasCondicionais;

public class IfElse {
    public static void main(String[] args) {
        int age = 20;
        boolean isAuthorizedBuyAlcoholicBeverages = age >= 18;

        //if

        if(isAuthorizedBuyAlcoholicBeverages){
            System.out.println("Pode comprar bebida alcoólica");
        }

        if(!isAuthorizedBuyAlcoholicBeverages){
            System.out.println("Não pode comprar bebida alcoólica");
        }

        //if - else

        if(isAuthorizedBuyAlcoholicBeverages){
            System.out.println("Pode comprar bebida alcoólica");
        }else{
            System.out.println("Não pode comprar bebida alcoólica");
        }
    }
}
