package az.rock.jobber.ws.messaging;

public class MessageProvider {
    public static String success(){
        return "The operation completed successfully";
    }

    public static String fail(){
        return "The operation could not be completed";
    }

    public static String get(String code_scheme){
        return code_scheme;
    }



}
