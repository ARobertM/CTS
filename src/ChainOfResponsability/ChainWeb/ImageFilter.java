package ChainOfResponsability.ChainWeb;

public class ImageFilter extends AHandler {

    @Override
    public void handle(Request request) {
        if(request.isSlowConn){
            //
        }
        super.handle(request);
    }
    
}   
