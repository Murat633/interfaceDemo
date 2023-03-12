public class OutSourceWorker implements IWorkable,IPayable
{
    @Override
    public void work() {
        System.out.println("out sorce worker");
    }

    @Override
    public void pay() {
        System.out.println("5000 Maaş Ödendi");
    }
}
