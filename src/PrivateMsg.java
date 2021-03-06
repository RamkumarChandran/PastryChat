
import rice.p2p.commonapi.Id;
import rice.p2p.commonapi.Message;

/**
 *      Private message
 * 
 * Message container used for transferring a message from one app to another.
 * 
 * @author Dejvino
 */
public class PrivateMsg implements Message
{
    private static final long serialVersionUID = 1L;

    /**
     * Where the Message came from.
     */
    private Id from;
    
    private String fromName;
    
    /**
     * Where the Message is going.
     */
    private Id to;
    
    private String toName;
    
    /**
     * Message content
     */
    private String text;

    /**
     * Constructor.
     */
    public PrivateMsg(Id from, String fromName, Id to, String toName, String text)
    {
        this.from = from;
        this.fromName = fromName;
        this.to = to;
        this.toName = toName;
        this.text = text;
    }

    // =====================================================================

    public Id getFrom()
    {
        return from;
    }

    public String getFromName()
    {
        return fromName;
    }

    public String getText()
    {
        return text;
    }

    public Id getTo()
    {
        return to;
    }

    public String getToName()
    {
        return toName;
    }

    // =====================================================================

    @Override
    public String toString()
    {
        return "PrivateMsg from " + fromName + " ("+from+") to " + toName + " ("+to+"): " + text;
    }

    // =====================================================================

    /**
     * Using low priority to prevent interference with overlay maintenance traffic.
     */
    @Override
    public int getPriority()
    {
        return Message.LOW_PRIORITY;
    }
}
