package com.example.task05;

import javax.xml.ws.Service;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MailService<T> implements Consumer<IMail<T>> {

    private final Map<String, List<T>> mailBox = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, Collections.emptyList());
        }
    };

    @Override
    public void accept(IMail<T> mail) {
        mailBox.computeIfAbsent(mail.getTo(), k -> new ArrayList<>()).add(mail.getContent());
    }

    public Map<String, List<T>> getMailBox(){
        return mailBox;
    }
}