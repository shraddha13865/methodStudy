package interface1;

public interface ChatGpt {
    void chatAi();

    void information();

    default void reply() {
        System.out.println("chatgpt give reply");
    }


}
