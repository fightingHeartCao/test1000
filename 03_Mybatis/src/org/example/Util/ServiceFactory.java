package org.example.Util;

public class ServiceFactory {
    //获取代理类对象
    public static Object getService(Object service){
        return new TransactionInvocationHandler(service).getProxy();
    }
}
