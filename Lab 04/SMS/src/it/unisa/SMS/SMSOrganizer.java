package it.unisa.SMS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SMSOrganizer {

    private List <SMS> messages;

    public SMSOrganizer()   {
        messages = new ArrayList<>();
    }

    public List<SMS> getSms() {
        return messages;
    }

    public void addSMSToOrganizer(SMS sms1) {
        messages.add(sms1);
    }

    public List<SMS> getListBySender() {
        this.messages.sort(new Comparator<>() {
            @Override
            public int compare(SMS o1, SMS o2) {
                return o1.getSender().compareTo(o2.getSender());
            }
        });
        return this.messages;
    }

    public List<SMS> getListByDate() {
        this.messages.sort(new Comparator<>() {
            @Override
            public int compare(SMS o1, SMS o2) {
                return o1.getData().compareTo(o2.getData());
            }
        });
        return this.messages;
    }
}
