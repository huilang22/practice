/*
 * Generated code DO NOT EDIT
 * Generated file: OrderStatusCreateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a OrderStatusCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderStatusCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderStatusObjectData OrderStatusCreateIn;
/**
 *
 * Constructor to create a  OrderStatusCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderStatusCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderStatusObjectData OrderStatusCreateInIn) {
    super(id, context, "OrderStatusCreate");
    OrderStatusCreateIn = OrderStatusCreateInIn;
  }

  public void translateToMap() {
    if (OrderStatusCreateIn != null) {
      OrderStatusCreateIn.resetFlags(true, true);
      addInput("OrderStatus", OrderStatusObjectHelper.toMap(OrderStatusCreateIn, new HashMap(), "OrderStatus").get("OrderStatus"));
    }
  }


/**
 *
 * Sets the OrderStatus
 * @param OrderStatusCreateInIn Value of the OrderStatusCreateIn
 *
 */

  public void setOrderStatus(OrderStatusObjectData OrderStatusCreateInIn) {
    OrderStatusCreateIn = OrderStatusCreateInIn;
  }

  public void translateFromMap() {
    OrderStatusCreateIn = OrderStatusObjectHelper.fromMap(inputMap, "OrderStatus");
  }

/**
 *
 * Gets the OrderStatus
 * @return Value of the OrderStatus
 *
 */

  public OrderStatusObjectData getOrderStatus( ) {
    return OrderStatusCreateIn;
  }

}
