package cascade_exp;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	private static final String PERSISTENCE_UNIT_NAME = "JPADemo11";
    private static EntityManagerFactory factory;
    public static EntityManagerFactory getEntityManagerFactory() {
        if (factory == null) {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return factory;
    }
    public static void shutdown() {
        if (factory != null) {
            factory.close();
        }
    }
}

