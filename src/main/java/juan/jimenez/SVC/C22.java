package juan.jimenez.SVC;

public class C22 {

    public String mA() {
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }

}
