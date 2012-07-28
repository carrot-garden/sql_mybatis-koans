package net.thornydev.mybatis.test.koan03;

import java.io.InputStream;
import java.util.Properties;

import org.apache.ibatis.io.Resources;

class Util {

	static final String PROP_FLAVOR = "koans.flavor";

	static final String FLAVOR_H2 = "h2";
	static final String FLAVOR_MYSQL = "mysql";
	static final String FLAVOR_PG = "pg";

	static Properties properties(String flavor) throws Exception {

		if (flavor == null) {
			flavor = System.getProperty(PROP_FLAVOR, FLAVOR_H2);
		}

		final String fileName = "config-" + flavor + ".properties";

		final String filePath = "net/thornydev/mybatis/test/" + fileName;

		final InputStream input = Resources.getResourceAsStream(filePath);

		final Properties properties = new Properties();

		properties.load(input);

		input.close();

		return properties;

	}

}
