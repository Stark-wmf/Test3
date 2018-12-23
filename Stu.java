package been;

public class Stu implements java.io.Serializable {

    private Integer jf;
    private String name;

    public Integer getJf() {
        return jf;
    }

    public void setJf(Integer jf) {
        this.jf = jf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }
public Stu() {


}


    public String toString() {
        return "姓名："+getName()+" 积分："+getJf();
    }
}


