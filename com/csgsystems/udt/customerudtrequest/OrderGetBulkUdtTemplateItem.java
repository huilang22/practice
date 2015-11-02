/*
 * Generated code DO NOT EDIT
 * Generated file: OrderGetBulkUdtTemplateItem.java
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
 * Class used to create a OrderGetBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderObjectKeyData OrderGetIn;
/**
 *
 * Constructor to create a  OrderGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderGetBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderObjectKeyData OrderGetInIn) {
    super(id, context, "OrderGet");
    OrderGetIn = OrderGetInIn;
  }

  public void translateToMap() {
    if (OrderGetIn != null) {
      OrderGetIn.resetFlags(true, true);
      addInput("Order", OrderObjectKeyHelper.toMap(OrderGetIn, new HashMap(), "OrderObjectKeyData").get("OrderObjectKeyData"));
    }
  }


/**
 *
 * Sets the Order
 * @param OrderGetInIn Value of the OrderGetIn
 *
 */

  public void setOrder(OrderObjectKeyData OrderGetInIn) {
    OrderGetIn = OrderGetInIn;
  }

  public void translateFromMap() {
    OrderGetIn = OrderObjectKeyHelper.fromMap(inputMap, "Order");
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectKeyData getOrder( ) {
    return OrderGetIn;
  }

}
