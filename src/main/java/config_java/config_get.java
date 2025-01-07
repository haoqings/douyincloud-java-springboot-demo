package config_java;

import com.bytedance.douyincloud.configcenter.DycConfigCenter;
import com.bytedance.douyincloud.configcenter.internal.DefaultConfig;
import com.bytedance.douyincloud.configcenter.internal.DycConfig;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.convert.DefaultListDelimiterHandler;
import org.apache.commons.configuration2.ex.ConfigurationException;

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