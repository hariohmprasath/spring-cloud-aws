/*
 * Copyright 2013-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.aws.cloudmap;

import java.util.List;

/**
 * Pojo class to capture all the discovery parameters.
 *
 * @author Hari Ohm Prasath
 * @since 2.3.2
 */
public class CloudMapDiscovery {

	// Default to fail if discovery has failed
	private boolean failFast = true;

	private List<CloudMapDiscoveryProperties> discoveryList;

	public boolean isFailFast() {
		return failFast;
	}

	public void setFailFast(boolean failFast) {
		this.failFast = failFast;
	}

	public List<CloudMapDiscoveryProperties> getDiscoveryList() {
		return discoveryList;
	}

	public void setDiscoveryList(List<CloudMapDiscoveryProperties> discoveryList) {
		this.discoveryList = discoveryList;
	}

	@Override
	public String toString() {
		return "AwsCloudMapDiscovery{" + "failFast=" + failFast + ", discoveryList=" + discoveryList.toString() + '}';
	}

}
