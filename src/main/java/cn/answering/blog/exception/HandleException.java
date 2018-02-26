package cn.answering.blog.exception;

/**
 * Created by HP on 2017/9/4.
 */
public class HandleException {

    private String message;

    public HandleException(Exception e){
        message = e.getMessage();
    }
}
