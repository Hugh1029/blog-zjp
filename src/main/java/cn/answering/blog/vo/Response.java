package cn.answering.blog.vo;

/**
 * Created by zjp on 2017/9/4.
 *
 * 该类为返回值类型
 */
public class Response {

    private boolean success;

    private Object body;

    private String message;

    protected Response(){}

    public Response(boolean success,String message,Object body){
        this.success = success;
        this.message = message;
        this.body = body;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("the Response: message is:%s",message);
    }
}
