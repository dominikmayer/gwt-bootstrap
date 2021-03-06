/*
 *  Copyright 2012 GWT Bootstrap
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.github.gwtbootstrap.client.ui;

import com.github.gwtbootstrap.client.ui.base.AlertBase;
import com.github.gwtbootstrap.client.ui.resources.Bootstrap.AlertStyle;

/**
 * Alert block widget with more padding than {@link Alert}. It has a dedicated
 * heading in an extra row.
 * 
 * <p>
 * <h3>UiBinder Usage:</h3>
 * <code>{@code <b:AlertBlock heading="Warning." type="error">Something went wrong...</AlertBlock>}</code>
 * </p>
 * <p>
 * All parameters are optional and map to the class's setters.
 * </p>
 * 
 * @since 2.0.2.0
 * 
 * @author Dominik Mayer
 * 
 * @see {@link Alert}
 * @see <a href="http://twitter.github.com/bootstrap/components.html#alerts">Bootstrap documentation</a>
 */
public class AlertBlock extends AlertBase {

	private Heading heading = new Heading(4);
	
	/**
	 * Creates an empty widget with a close icon.
	 */
	public AlertBlock() {
		setUp();
	}
	
	private void setUp() {
		super.addStyle(AlertStyle.BLOCK);
		heading.setStyle(AlertStyle.HEADING);
		add(heading);
	}
	
	/**
	 * Initializes the widget with an optional close icon.
	 * 
	 * @param hasClose whether the Alert should have a close icon.
	 */
	public AlertBlock(boolean hasClose) {
		super(hasClose);
		setUp();
	}
	
	/**
	 * Creates an Alert with a close icon and the given style. 
	 * 
	 * @param style of the Alert
	 */
	public AlertBlock(AlertStyle style) {
		super(style);
		setUp();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	@Deprecated
	public void setType(String typeName) {
		super.setType(typeName);
		addStyle(AlertStyle.BLOCK);
	}
	
	/**
	 * Sets the text of an optional heading. It is wrapped in {@code <h4>}
	 * tags and placed above the text.
	 */
	@Override
	public void setHeading(String text) {
		heading.setText(text);
		super.setHeading(heading.toString());
	}
}
