/*
	Milyn - Copyright (C) 2006 - 2010

	This library is free software; you can redistribute it and/or
	modify it under the terms of the GNU Lesser General Public
	License (version 2.1) as published by the Free Software
	Foundation.

	This library is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

	See the GNU Lesser General Public License for more details:
	http://www.gnu.org/licenses/lgpl.txt
*/
package example.model;

import java.util.List;

/**
 *
 * @author maurice_zeijen
 *
 */
public class Order {
    private Header header;
    private List<OrderItem> orderItems;
    private String comment;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String toString() {
        StringBuffer desc = new StringBuffer();

        desc.append("Order [\n\theader = ");
        desc.append(header);
        desc.append(",\n\torderItems = ");
        for(int i = 0; i < orderItems.size(); i++) {
            desc.append("\n\t\t(" + i + ") = " + orderItems.get(i));
        }
        desc.append(",\n\tcomment = ");
        desc.append(comment);
        desc.append("\n]");

        return desc.toString();
    }
}
