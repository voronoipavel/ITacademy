package dataBase.lessons_7;

import java.sql.Timestamp;

public class News {
    String newHeadline;
    Timestamp timestamp;

    public News(String newHeadline, Timestamp timestamp) {
        this.newHeadline = newHeadline;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "News{" +
                "newHeadline='" + newHeadline + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
