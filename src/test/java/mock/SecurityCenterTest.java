package mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */

    SecurityCenter securityCenter;

    @BeforeEach
    public void setUp() {
        securityCenter = new SecurityCenter(new DoorPanelMock());
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
    }
}
