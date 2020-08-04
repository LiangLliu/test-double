package mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */

    /*

     - 我们不想真的去关门，因此我们可以吧关门的行为mock掉
     - 在 switchUp(0 方法执行完成后，doorPanel的Mock对象有了交互信息，我们能够去验证 door是否真的被调用
        我们也不用关注门是否被关闭，因为门关闭是由doorPanel这个类来决定的

     */

    DoorPanel doorPanelMock;

    @BeforeEach
    public void setUp() {
        doorPanelMock = mock(DoorPanel.class);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        SecurityCenter securityCenter = new SecurityCenter(doorPanelMock);
        securityCenter.switchOn();
        verify(doorPanelMock).close();
    }
}
