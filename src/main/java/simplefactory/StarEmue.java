package simplefactory;

/**
 * @author 黄豪强
 * @create 2019/7/25 9:50
 */
public enum StarEmue {

    James("simplefactory.James"), Jodren("simplefactory.Jodren");
    private String s;

    private StarEmue(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
