import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by Think on 2018/8/23.
 */
@RunWith(Arquillian.class)
public class AsyncThreadPoolTaskTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(com.alvinlkk.task.AsyncThreadPoolTask.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
