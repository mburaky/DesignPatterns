package tr.mby.com.creational.builder;

import java.util.Date;
import java.util.Random;

public class TaskBuilder {

    private final long id;
    private String summary = "";
    private String description = "";
    private boolean done = false;
    private Date dueDate;

    public TaskBuilder() {
        this.id = new Random().nextLong();
    }

    public Task build() {
        return new Task(id,summary, description,done, dueDate);
    }

    public TaskBuilder setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public TaskBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public TaskBuilder setDone(boolean done) {
        this.done = done;
        return this;
    }

    public TaskBuilder setDueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }
}
