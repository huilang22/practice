/*
 * Generated code DO NOT EDIT
 * Generated file: OrderCreateBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a OrderCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderObjectData OrderCreateIn;
/**
 *
 * Constructor to create a  OrderCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderObjectData OrderCreateInIn) {
    super(id, context, "OrderCreate");
    OrderCreateIn = OrderCreateInIn;
  }

  public void translateToMap() {
    if (OrderCreateIn != null) {
      OrderCreateIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(OrderCreateIn, new HashMap(), "Order").get("Order"));
    }
  }


/**
 *
 * Sets the Order
 * @param OrderCreateInIn Value of the OrderCreateIn
 *
 */

  public void setOrder(OrderObjectData OrderCreateInIn) {
    OrderCreateIn = OrderCreateInIn;
  }

  public void translateFromMap() {
    OrderCreateIn = OrderObjectHelper.fromMap(inputMap, "Order");
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return OrderCreateIn;
  }

}
