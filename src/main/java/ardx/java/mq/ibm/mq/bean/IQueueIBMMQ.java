package ardx.java.mq.ibm.mq.bean;

import ardx.java.mq.ibm.mq.consumer.IMQMessageConsumer;
import ardx.java.mq.ibm.mq.producer.IMQMessageProducer;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Session;

public interface IQueueIBMMQ {

    String getQueueName();

    void sendMessage(String message) throws JMSException;

    void consume() throws JMSException;

    void setSession(Session session);

    Session getSession();

    IMQMessageProducer getMessageProducer();

    void setMessageProducer(IMQMessageProducer messageProducer);

    IMQMessageConsumer getMessageConsumer();

    void setMessageConsumer(IMQMessageConsumer messageConsumer);

    Connection getConnection();

    void setConnection(Connection connection);

}
