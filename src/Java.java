/**
 * Created by tomas on 5.11.15.
 */
public class Java {
    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Java(String s) {
        this.s = s;
    }
    public Java(Integer i) {
        this(i.toString());
    }
}
