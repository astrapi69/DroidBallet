package com.lonepulse.droidballet.app;

/*
 * #%L
 * DroidBallet
 * %%
 * Copyright (C) 2013 Lonepulse
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import android.app.Application;

import com.lonepulse.droidballet.core.HiggsField;
import com.lonepulse.droidballet.core.HiggsFieldConfiguration;

/**
 * <p>An extension of {@link Application} which initializes the <i>motion</i> 
 * capabilities of the views.</p> 
 * 
 * <p><b>NOTE:</b> To enable <i>motion views</i> refer to this class by its 
 * fully-qualified name in the <b>AndroidManifest.xml</b> {@code <application>} 
 * tag via the {@code android:name} attribute.</p>
 * 
 * @version 1.0.0
 * 
 * @author <a href="mailto:lahiru@lonepulse.com">Lahiru Sahan Jayasinghe</a>
 */
public class MotionApplication extends Application {

	
	/**
	 * {@inheritDoc}
	 * 
	 * <p>Activates the {@link HiggsField} using a {@link HiggsFieldConfiguration} 
	 * which takes this {@link Application} context.</p>
	 */
	@Override
	public void onCreate() {
		
		super.onCreate();
		
		HiggsField.INSTANCE.initialize(new HiggsFieldConfiguration.Builder(this).build());
	}
}
