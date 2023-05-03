package ardx.java.mq.ibm.mq.configuration;

import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.MessageListener;

@Component(value="responseListener")
public class ResponseListener implements MessageListener {

    public void onMessage(Message message) {
        //TODO
    }
}