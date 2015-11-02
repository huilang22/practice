/*
 * Generated code DO NOT EDIT
 * Generated file: OrderStatusGetBulkUdtTemplateItem.java
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
 * Class used to create a OrderStatusGetBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderStatusGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderStatusObjectKeyData OrderStatusGetIn;
/**
 *
 * Constructor to create a  OrderStatusGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderStatusGetBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderStatusObjectKeyData OrderStatusGetInIn) {
    super(id, context, "OrderStatusGet");
    OrderStatusGetIn = OrderStatusGetInIn;
  }

  public void translateToMap() {
    if (OrderStatusGetIn != null) {
      OrderStatusGetIn.resetFlags(true, true);
      addInput("OrderStatus", OrderStatusObjectKeyHelper.toMap(OrderStatusGetIn, new HashMap(), "OrderStatusObjectKeyData").get("OrderStatusObjectKeyData"));
    }
  }


/**
 *
 * Sets the OrderStatus
 * @param OrderStatusGetInIn Value of the OrderStatusGetIn
 *
 */

  public void setOrderStatus(OrderStatusObjectKeyData OrderStatusGetInIn) {
    OrderStatusGetIn = OrderStatusGetInIn;
  }

  public void translateFromMap() {
    OrderStatusGetIn = OrderStatusObjectKeyHelper.fromMap(inputMap, "OrderStatus");
  }

/**
 *
 * Gets the OrderStatus
 * @return Value of the OrderStatus
 *
 */

  public OrderStatusObjectKeyData getOrderStatus( ) {
    return OrderStatusGetIn;
  }

}
