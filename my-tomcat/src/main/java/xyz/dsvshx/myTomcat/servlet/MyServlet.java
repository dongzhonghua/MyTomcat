package xyz.dsvshx.myTomcat.servlet;

import xyz.dsvshx.myTomcat.MyRequest;
import xyz.dsvshx.myTomcat.MyResponse;

/**
 * @author dongzhonghua <dongzhonghua03@kuaishou.com>
 * Created on 2020-05-13
 */
// 模板方法？
public abstract class MyServlet {
    public abstract void doGet(MyRequest myRequest, MyResponse myResponse);

    public abstract void doPost(MyRequest myRequest, MyResponse myResponse);

    public void service(MyRequest myRequest, MyResponse myResponse) {
        if (myRequest.getMethod().equalsIgnoreCase("POST")) {
            doPost(myRequest, myResponse);
        } else if (myRequest.getMethod().equalsIgnoreCase("GET")) {
            doGet(myRequest, myResponse);
        }
    }
}