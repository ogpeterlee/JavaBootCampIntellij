public class CheckNumName {
    public static void main(String[] args) {
        //for try catch block
        Person prsn1 = null;

        try{
            prsn1 = new Person("Johny5","Bravo",30);
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
}
