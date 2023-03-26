package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {

    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final String upvotes;

    public Post(
            @JsonProperty("идентификатор") String id,
            @JsonProperty("текст") String text,
            @JsonProperty("тип животного") String type,
            @JsonProperty("имя пользователя") String user,
            @JsonProperty("голоса") String upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public String getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return
                "=======================" + "\n" +
                        "идентификатор " + id + "\n" +
                        "сообщение " + text + "\n" +
                        "тип животного " + type + "\n" +
                        "имя пользователя " + user + "\n" +
                        "голоса " + upvotes;
    }
}
