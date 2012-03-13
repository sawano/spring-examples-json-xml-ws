/**
 * Copyright 2012 Daniel Sawano
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package se.sawano.spring.examples.jsonxmlws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RESTController {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping("/users/{id}")
	@ResponseBody
	public User getUser(@PathVariable Long id, @RequestHeader("Accept") String acceptHeader) {
		logger.trace("Serving resource for Accept header: {}", acceptHeader);
		return new User(id, "John Doe");
	}
}
