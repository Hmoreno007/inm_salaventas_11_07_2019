package com.digitrust.esb.inmobiliario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;

public class ListenerBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(ListenerBean.class);

    public void onBind(Object service, Map properties){
        LOGGER.info("Binding to "+ properties.get("datasource.type"));


    }
    public void onUnbind(Object service, Map properties){
        LOGGER.info("Unbinding from "+ properties.get("datasource.type"));
    }
}
