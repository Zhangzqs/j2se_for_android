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
package java.awt.event;

import java.awt.Component;
import java.awt.Container;

/**
 * A low-level event which indicates that a container's contents changed because
 * a component was added or removed.
 * <P>
 * Container events are provided for notification purposes ONLY; The AWT will
 * automatically handle changes to the containers contents internally so that
 * the program works properly regardless of whether the program is receiving
 * these events or not.
 * <P>
 * This low-level event is generated by a container object (such as a Panel)
 * when a component is added to it or removed from it. The event is passed to
 * every <code>ContainerListener</code> or <code>ContainerAdapter</code> object
 * which registered to receive such events using the component's
 * <code>addContainerListener</code> method. (<code>ContainerAdapter</code>
 * objects implement the <code>ContainerListener</code> interface.) Each such
 * listener object gets this <code>ContainerEvent</code> when the event occurs.
 * <p>
 * An unspecified behavior will be caused if the {@code id} parameter of any
 * particular {@code ContainerEvent} instance is not in the range from
 * {@code CONTAINER_FIRST} to {@code CONTAINER_LAST}.
 *
 * @see ContainerAdapter
 * @see ContainerListener
 * @see <a href=
 *      "http://java.sun.com/docs/books/tutorial/post1.0/ui/containerlistener.html">Tutorial:
 *      Writing a Container Listener</a>
 *
 * @author Tim Prinzing
 * @author Amy Fowler
 * @since 1.1
 */
public class ContainerEvent extends ComponentEvent {
	public static final int CONTAINER_FIRST = 300;
	public static final int CONTAINER_LAST = 301;
	public static final int COMPONENT_ADDED = CONTAINER_FIRST;
	public static final int COMPONENT_REMOVED = 1 + CONTAINER_FIRST;
	Component child;

	public ContainerEvent(Component source, int id, Component child) {
		super(source, id);
		this.child = child;
	}

	public Container getContainer() {
		return (source instanceof Container) ? (Container) source : null;
	}

	public Component getChild() {
		return child;
	}

	public String paramString() {
		return "unknown type" + ",child=" + child.getName();
	}
}
