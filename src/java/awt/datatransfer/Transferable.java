/*
 * Copyright (c) 1999, 2007, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package java.awt.datatransfer;

import java.io.IOException;

/**
 * Defines the interface for classes that can be used to provide data for a
 * transfer operation.
 * <p>
 * For information on using data transfer with Swing, see
 * <a href="http://java.sun.com/docs/books/tutorial/uiswing/misc/dnd.html"> How
 * to Use Drag and Drop and Data Transfer</a>, a section in <em>The Java
 * Tutorial</em>, for more information.
 *
 * @author Amy Fowler
 */

public interface Transferable {
	public DataFlavor[] getTransferDataFlavors();

	public boolean isDataFlavorSupported(DataFlavor flavor);

	public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException;

}
