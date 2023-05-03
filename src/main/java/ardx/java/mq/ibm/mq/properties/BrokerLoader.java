package ardx.java.mq.ibm.mq.properties;


import ardx.java.mq.ibm.mq.bean.IQueueIBMMQ;

import java.util.HashMap;
import java.util.Map;

public class BrokerLoader {

    private  Map<String, IQueueIBMMQ> queues;

    public BrokerLoader(Map<String, IQueueIBMMQ> queues) {
        this.queues = queues;
    }

    public BrokerLoader()   {
        this.queues = new HashMap<String, IQueueIBMMQ>();;
    }

    public Map<String, IQueueIBMMQ> getQueues() {
        return queues;
    }

    public void setQueues(Map<String, IQueueIBMMQ> queues) {
        this.queues = queues;
    }
}
