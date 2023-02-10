package interview.patern;

interface Messenger {
    void sendMessage();
}

class SmsMessenger implements Messenger {
    @Override
    public void sendMessage() {
        System.out.println("ОТправка сообщениея по смс");
    }
}

class EmailMessenger implements Messenger {
    @Override
    public void sendMessage() {
        System.out.println("Отправка по электронной почте");
    }
}

public class FactoryMethod {

    public static void main(String[] args) {
        Messenger messenger = factoryMethod("sms");
        System.out.println(messenger instanceof SmsMessenger);
    }
    public static Messenger factoryMethod(String key) {
        Messenger messenger = null;
        switch (key) {
            case "sms":
                messenger = new SmsMessenger();
                break;
            case "email":
                messenger = new EmailMessenger();
                break;
        }
        return messenger;
    }
}
