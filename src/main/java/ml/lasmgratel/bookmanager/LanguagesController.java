/*
 * Copyright (C) 2015 Lasm Gratel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ml.lasmgratel.bookmanager;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author lasm_
 */
public class LanguagesController {

    /**
     *
     */
    public static Locale locale1 = new Locale("zh", "CN");
    public static ResourceBundle resb1 = ResourceBundle.getBundle("language", locale1); 
    public static String getLocale(String id)
    {
        return resb1.getString(id);
    }
}
