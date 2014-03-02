import com.tiemei.demo.least.spring.scripting.Messenger;

class GroovyMessenger implements Messenger {

    String name

    @Override
    String getMessage() {
        return name
    }

    public static void main(String[] args) {
        println("hello groovy!")
    }
}