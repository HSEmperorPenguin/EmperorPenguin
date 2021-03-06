package org.ros.android.android_tutorial_image_transport;

import android.util.Log;

import org.ros.concurrent.CancellableLoop;
import org.ros.namespace.GraphName;
import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;
import org.ros.node.topic.Publisher;

import std_msgs.Int32;

public class Find extends AbstractNodeMain {
    private String topic_name;
    private String message;

    public Find() {
        topic_name = "chatter";
    }

    public Find(String topic)
    {
        topic_name = topic;
    }

    public void setMessage(String message){
        this.message=message;
    }

    @Override
    public GraphName getDefaultNodeName() {
        return GraphName.of("android/bell");
    }

    @Override
    public void onStart(final ConnectedNode connectedNode) {
        final Publisher<std_msgs.String> publisher =
                connectedNode.newPublisher(topic_name, std_msgs.String._TYPE);
        // This CancellableLoop will be canceled automatically when the node shuts
        // down.
        connectedNode.executeCancellableLoop(new CancellableLoop() {
            private int sequenceNumber;

            @Override
            protected void setup() {
                sequenceNumber = 0;
            }

            @Override
            protected void loop() throws InterruptedException {

                int flag = ((MainActivity)MainActivity.context_main).flag_find;
                if(flag==1) {
                    std_msgs.String str = publisher.newMessage();
                    str.setData(message);
                    Log.i("find","find");
                    publisher.publish(str);
                    ((MainActivity)MainActivity.context_main).changeFlagFind(0);
                }
                //Thread.sleep(1000);
                Log.i("find","out");
            }
        });
    }
}
