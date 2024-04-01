package Classes;
import java.util.ArrayList;
import java.util.List;

public class SessionStorage {
    private static SessionStorage instance;
    private List<Session> sessions;

    private SessionStorage() {
        sessions = new ArrayList<>();
    }

    public static synchronized SessionStorage getInstance() {
        if (instance == null) {
            instance = new SessionStorage();
        }
        return instance;
    }

    public void addSession(Session session) {
        sessions.add(session);
    }

    public List<Session> getSessions() {
        return sessions;
    }
   
}

