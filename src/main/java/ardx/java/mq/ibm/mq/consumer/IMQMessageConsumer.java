package ardx.java.mq.ibm.mq.consumer;

import javax.jms.JMSException;

public interface IMQMessageConsumer {
    void consume() throws JMSException;
}
