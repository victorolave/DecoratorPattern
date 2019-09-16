public class FileLogger implements Logger {

    public void log(String msg) {
        System.out.println("Mensaje: " + msg + "guardado en archivo" );
    }
}
