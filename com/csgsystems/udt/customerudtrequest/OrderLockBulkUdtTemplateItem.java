/*
 * Generated code DO NOT EDIT
 * Generated file: OrderLockBulkUdtTemplateItem.java
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
 * Class used to create a OrderLockBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderLockBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderObjectKeyData OrderLockIn;
/**
 *
 * Constructor to create a  OrderLockBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderLockBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderObjectKeyData OrderLockInIn) {
    super(id, context, "OrderLock");
    OrderLockIn = OrderLockInIn;
  }

  public void translateToMap() {
    if (OrderLockIn != null) {
      OrderLockIn.resetFlags(true, true);
      addInput("Order", OrderObjectKeyHelper.toMap(OrderLockIn, new HashMap(), "OrderObjectKeyData").get("OrderObjectKeyData"));
    }
  }


/**
 *
 * Sets the Order
 * @param OrderLockInIn Value of the OrderLockIn
 *
 */

  public void setOrder(OrderObjectKeyData OrderLockInIn) {
    OrderLockIn = OrderLockInIn;
  }

  public void translateFromMap() {
    OrderLockIn = OrderObjectKeyHelper.fromMap(inputMap, "Order");
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectKeyData getOrder( ) {
    return OrderLockIn;
  }

}
