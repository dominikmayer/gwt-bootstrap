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

import com.github.gwtbootstrap.client.ui.base.DropdownBase;
import com.github.gwtbootstrap.client.ui.base.IconAnchor;

/**
 * 
 * @author Carlos A Becker
 * @author Dominik Mayer
 */
public class Dropdown extends DropdownBase {

	public Dropdown() {
		super("li");
		addStyleName("dropdown");
	}

	public Dropdown(String text) {
		this();
		setText(text);
	}
	
	@Override
	protected IconAnchor createTrigger() {
		IconAnchor trigger = new IconAnchor();
		trigger.setCaret(true);
		return trigger;
	}
}
