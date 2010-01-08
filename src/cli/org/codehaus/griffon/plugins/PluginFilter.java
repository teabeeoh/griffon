/*
 * Copyright 2008-2010 the original author or authors.
 *
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
 */

package org.codehaus.griffon.plugins;

import java.util.List;

/**
 * Defines interface for obtaining a sublist of <code>GriffonPlugin</code> instances
 * based on an original supplied list of <code>GriffonPlugin</code> instances
 * @author Phil Zoio
 */
public interface PluginFilter {

	/**
	 * Returns a filtered list of plugins
	 * @param original the original supplied set of <code>GriffonPlugin</code> instances
	 * @return a sublist of these items
	 */
	List filterPluginList(List original);
}
