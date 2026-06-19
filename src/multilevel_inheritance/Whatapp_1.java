package multilevel_inheritance;

public class Whatapp_1 {
    public void Status() {
        System.out.println("My whatapp have status");
    }
}
    class ChatGPT extends Whatapp_1 {
        void sendmessage() {
            System.out.println("chatgpt is sending messages quikly");
        }
    }
        class youtube extends ChatGPT{
            void vedios() {
                System.out.println("youtube have more usefll vedioes");
            }
        }
    class mulilevel_inheritance{
        public static void main(String[] args) {
         Whatapp_1 whatapp1=new Whatapp_1();
         whatapp1.Status();
         ChatGPT chatGPT=new ChatGPT();
         chatGPT.Status();
         chatGPT.sendmessage();
         youtube youtube=new youtube();
         youtube.Status();
         youtube.vedios();
         youtube.sendmessage();
        }
    }
