/*
 *
 * Paros and its related class files.
 * 
 * Paros is an HTTP/HTTPS proxy for assessing web application security.
 * Copyright (C) 2003-2004 Chinotec Technologies Company
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the Clarified Artistic License
 * as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Clarified Artistic License for more details.
 * 
 * You should have received a copy of the Clarified Artistic License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.parosproxy.paros.extension;

import java.awt.Component;

import javax.swing.JMenuItem;

/**
 *
 * To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
public class ExtensionPopupMenu extends JMenuItem {

    public ExtensionPopupMenu() {
        super();
    }
    
    public ExtensionPopupMenu(String label) {
        super(label);
    }
    
    public boolean isEnableForComponent(Component invoker) {
        return true;
    }
    
    // ZAP: Support submenus
    public boolean isSubMenu() {
    	return false;
    }
    
    public String getParentMenuName() {
    	return null;
    }
    
    public int getParentMenuIndex() {
    	return -1;
    }
}
