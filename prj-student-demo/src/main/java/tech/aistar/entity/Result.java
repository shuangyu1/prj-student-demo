package tech.aistar.entity;

public class Result {

    private String code;

    private String msg;

    private Object obj;

    public Result(){

    }

    public Result(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public Result(String code,String msg,Object obj){
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Result{");
        sb.append("code='").append(code).append('\'');
        sb.append(", msg='").append(msg).append('\'');
        sb.append(", obj=").append(obj);
        sb.append('}');
        return sb.toString();
    }
}
