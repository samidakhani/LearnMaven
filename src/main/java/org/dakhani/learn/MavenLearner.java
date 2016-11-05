package org.dakhani.learn;

import java.util.Properties;

import org.dakhani.learn.adapter.DateAdapter;

/**
 * Copyright (c) GCOM Software Inc, NY. All Rights Reserved.
 * 
 * THIS INFORMATION IS COMPANY CONFIDENTIAL.
 * 
 * NOTICE: This material is a confidential trade secret and proprietary
 * information of GCOM Software Inc, NY which may not be reproduced, used, sold, or
 * transferred to any third party without the prior written consent of GCOM Software Inc, NY.
 */

/**
 * @author Sami Dakhani Created on Nov 5, 2016
 *
 */
public class MavenLearner {

	public static final String PROPERTY_VERSION = "projectVersion";
	public static final String USER_FULLNAME = "userFullName";

	public static void main(final String[] args) {

		DateAdapter dateAdapter = new DateAdapter();
		System.out.println(dateAdapter.adaptDate());

		System.out.println(new ResourceLoader().loadResource("learn.txt"));

		Properties properties = new PropertyLoader()
				.loadProperties("learn.properties");
		if (properties.containsKey(PROPERTY_VERSION))
			System.out.println(properties.get(PROPERTY_VERSION));

		properties = new PropertyLoader().loadProperties("maven.properties");
		if (properties.containsKey(PROPERTY_VERSION))
			System.out.println(properties.getProperty(PROPERTY_VERSION));
		if (properties.containsKey(USER_FULLNAME))
			System.out.println(properties.getProperty(USER_FULLNAME));
	}

}
