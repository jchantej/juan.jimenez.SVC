package juan.jimenez.SVC;

public class C32 {

    public String mA() {
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }

}
