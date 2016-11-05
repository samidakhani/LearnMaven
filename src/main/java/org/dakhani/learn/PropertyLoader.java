/**
 * Copyright (c) GCOM Software Inc, NY. All Rights Reserved.
 * 
 * THIS INFORMATION IS COMPANY CONFIDENTIAL.
 * 
 * NOTICE: This material is a confidential trade secret and proprietary
 * information of GCOM Software Inc, NY which may not be reproduced, used, sold, or
 * transferred to any third party without the prior written consent of GCOM Software Inc, NY.
 */
package org.dakhani.learn;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author Sami Dakhani Created on Nov 5, 2016
 *
 */
public class PropertyLoader {

	/**
	 * Loads a property file in src/main/resources
	 * 
	 * @param fileName
	 * @return
	 */
	public Properties loadProperties(final String fileName) {

		Properties properties = null;
		ClassLoader classLoader = this.getClass().getClassLoader();

		try {
			InputStream inputStream = classLoader.getResourceAsStream(fileName);
			if (inputStream != null) {
				properties = new Properties();
				properties.load(inputStream);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return properties;
	}
}
