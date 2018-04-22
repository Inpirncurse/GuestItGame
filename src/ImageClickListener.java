import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ImageClickListener extends MouseAdapter{
    private ImageClickDelegate delegate;

    public ImageClickListener(ImageClickDelegate delegate) {
        super();
        this.delegate = delegate;
        System.out.println("delegate ImageClickListener constructor: " + delegate);
    }

}
