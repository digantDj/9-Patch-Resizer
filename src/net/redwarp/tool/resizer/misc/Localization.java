/*
 * Copryright (C) 2012 Redwarp
 * 
 * This file is part of 9Patch Resizer.
 * 9Patch Resizer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * 9Patch Resizer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with 9Patch Resizer.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.redwarp.tool.resizer.misc;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Localization {
	private static ResourceBundle bundle = ResourceBundle.getBundle(
			"locale.Strings", Locale.FRANCE);

	public static String get(String key) {
		try {
			return bundle.getString(key);
		} catch (MissingResourceException e) {
			return new String(key);
		}
	}
}
