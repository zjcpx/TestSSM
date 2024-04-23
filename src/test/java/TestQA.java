import com.zjcpx.cms.controller.TQainfoController;
import com.zjcpx.cms.pojo.TaotaoResult;
import org.junit.Test;

/**
 * PackageName:PACKAGE_NAME
 * PROJECT_NAME:TestSSM
 * ClassName: TestQA
 * Package: PACKAGE_NAME
 *
 * @Author zjcxp.com
 * @Create 2024/4/23 17:04
 * @Version 1.0
 * Description:
 */
public class TestQA {

    @Test
    public void testGetTQainfo(){
        TaotaoResult tradecoscc = new TQainfoController().getTQainfoByFileName("tradecoscc");
        System.out.println(tradecoscc);
    }
}
