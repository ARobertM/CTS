package ChainOfResponsability.ChainWeb;

public abstract class AHandler implements Handler {
    private Handler next;

    @Override
    public void handle(Request request) {
        if(next != null){
            next.handle(request);
        }
    }

    @Override
    public void setNext(Handler handler) {
       this.next = handler;
    }


}
