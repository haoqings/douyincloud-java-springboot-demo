package config_java;

import com.bytedance.douyincloud.configcenter.DycConfigCenter;
import com.bytedance.douyincloud.configcenter.internal.DycConfig;

public class config_get {

    public static String configure() {


        // 获取配置对象
        DycConfig config = DycConfigCenter.getDycConfig();
        String res = config.getStringValue("test-key", "default_value");

        // 获取指定key的值
        String value = config.getStringValue("test-key", "default_value");
        System.out.println("value: " + value);
        return res;
    }

}