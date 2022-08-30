package listener.homework;

import model.Message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class HistoryMemento implements Serializable {
    private List<Message> listMessege = new ArrayList<>();
    HistoryMemento(){


    }

    public List<Message> getState(){
        List<Message> returnList = new ArrayList<>();
        for (Message msg : this.listMessege){
            returnList.add(msg) ;

        }
        return returnList;
    }


    public void saveStage(List<Message> listMessege){
        for (Message msg : listMessege){
          this.listMessege.add(msg) ;

        }

    }
}
