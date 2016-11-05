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

import org.apache.commons.io.IOUtils;

/**
 * @author Sami Dakhani Created on Nov 5, 2016
 *
 */
public class ResourceLoader {

	/**
	 * Reads a resource file in src/main/resources as a string
	 * 
	 * @param fileName
	 * @return
	 */
	public String loadResource(final String fileName) {

		String result = "";
		ClassLoader classLoader = this.getClass().getClassLoader();

		try {
			InputStream inputStream = classLoader.getResourceAsStream(fileName);
			result = IOUtils.toString(inputStream, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
}
