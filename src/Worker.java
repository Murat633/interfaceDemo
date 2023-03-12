// Bizim Çalışanlarımız.
public class Worker implements IWorkable,IEatable,IPayable
{
    @Override
    public void work() {
        System.out.println("Çalış");
    }

    @Override
    public void eat() {
        System.out.println("Yemek");
    }

    @Override
    public void pay() {
        System.out.println(" 10000 Maaş Ödendi");
    }
}
