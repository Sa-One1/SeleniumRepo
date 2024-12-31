/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package GFG_Maven.GFG_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleService {

		public static void main(String[] args) {
			System.out.println("Welcome");
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWorkspace\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[contains(@title,\"Search\")]")).sendKeys("Hello World");
			driver.findElement(By.xpath("//*[contains(@title,\"Search\")]")).sendKeys(Keys.ENTER);
			System.out.println("Test Completed");
		}

}