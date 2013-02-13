package com.lonepulse.droidballet.listener;

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

import android.hardware.Sensor;
import android.hardware.SensorEvent;

import com.lonepulse.droidballet.filter.SmoothingFilter;

/**
 * <p>Specifies the contract offered by an <i>event</i> generated due 
 * to a <i>motion</i>.
 * 
 * @version 1.1.0
 * <br><br>
 * @author <a href="mailto:lahiru@lonepulse.com">Lahiru Sahan Jayasinghe</a>
 */
public interface MotionEvent {

	/**
	 * <p>Accessor for the original {@link SensorEvent} generated by the 
	 * {@link Sensor} from which this {@link MotionEvent} is generated.
	 * 
	 * @return the {@link SensorEvent} from which this {@link MotionEvent} 
	 * 			is generated
	 * 
	 * @since 1.1.0
	 */
	public abstract SensorEvent getSensorEvent();
	
	/**
	 * <p>Accessor the sensor output values which have been processed 
	 * by a {@link SmoothingFilter}.
	 * 
	 * @return the {@link SensorEvent} from which this {@link MotionEvent} 
	 * 			is generated
	 * 
	 * @since 1.1.0
	 */
	public float[] getFilteredOutput();
}