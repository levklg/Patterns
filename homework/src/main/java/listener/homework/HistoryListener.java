package listener.homework;

import listener.Listener;
import model.Message;
import org.apache.commons.lang3.SerializationUtils;

import java.util.*;

public class HistoryListener implements Listener, HistoryReader {

    // private final Deque<HistoryMemento> stack = new ArrayDeque<>();
    private final Deque<List<Message>> stack = new ArrayDeque<>();
  private   List<Message> arrayList = new ArrayList<Message>();
   HistoryMemento historyMemento = new HistoryMemento();

    @Override
    public void onUpdated(Message msg) {

        arrayList.add(msg);

        historyMemento.saveStage(arrayList);

        stack.push(arrayList);
       // throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Message> findMessageById(long id) {
        var memento = stack.pop();

        Optional<Message> optionalMessage = null;



     for (Message msg : historyMemento.getState()){
         if(id == msg.getId()){

             optionalMessage = Optional.ofNullable(msg);
         }
     }
          return optionalMessage;
      //  throw new UnsupportedOperationException();
    }
}