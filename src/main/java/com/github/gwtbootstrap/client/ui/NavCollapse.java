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

import com.github.gwtbootstrap.client.ui.base.DivWidget;
import com.github.gwtbootstrap.client.ui.resources.Bootstrap;

/**
 * A container for things hidden when the window width is too small. Has to be
 * placed inside a {@link ResponsiveNavbar}.
 * (Works only in combination with bootstrap-responsive.css.)
 * 
 * @author Dominik Mayer
 * @since 2012-03-25
 *
 */
public class NavCollapse extends DivWidget {

	public NavCollapse() {
		super(Bootstrap.nav_collapse);
	}
	
}
