package da.mostitckiy;

import da.core.LogAbstract;
import da.core.LogInterface;
import java.util.ArrayList;

public class MostitckiyLog extends LogAbstract implements LogInterface{
    private static MostitckiyLog instance = null;
    private static final ArrayList<String> logs = new ArrayList<>();

    private MostitckiyLog() {
    }

    public static MostitckiyLog getInstance(){
        if (instance == null)
            instance = new MostitckiyLog();
        return instance;
    }

    @Override
    public LogInterface log(String str) {
        logs.add(str);
        return this;
    }

    @Override
    public LogInterface write() {
        writeConsole(logs.toArray(new String[0]));
        return this;
    }
}
