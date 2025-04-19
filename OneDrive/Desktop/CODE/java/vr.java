public class vr {
    public static void main(String[] args) {
        customer c=new seller();
        c.purchase();
    }
}
interface customer{
    int amt=5; //public,stati,final hai
    void purchase();

}
class seller implements customer {
    @Override
    public void purchase(){
        System.out.println("Raj needs " +amt+" Kg rice");
    }
}
