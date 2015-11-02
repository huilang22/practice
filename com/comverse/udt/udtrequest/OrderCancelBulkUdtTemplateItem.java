/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderCancelBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a OrderCancelBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderCancelBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderObjectKeyData OrderCancelIn;
/**
 *
 * Constructor to create a  OrderCancelBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderCancelBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderObjectKeyData OrderCancelInIn) {
    super(id, context, "OrderCancel");
    OrderCancelIn = OrderCancelInIn;
  }

  public void translateToMap() {
    if (OrderCancelIn != null) {
      OrderCancelIn.resetFlags(true, true);
      addInput("Order", OrderObjectKeyHelper.toMap(OrderCancelIn, new HashMap(), "OrderObjectKeyData").get("OrderObjectKeyData"));
    }
  }


/**
 *
 * Sets the Order
 * @param OrderCancelInIn Value of the OrderCancelIn
 *
 */

  public void setOrder(OrderObjectKeyData OrderCancelInIn) {
    OrderCancelIn = OrderCancelInIn;
  }

  public void translateFromMap() {
    OrderCancelIn = OrderObjectKeyHelper.fromMap(inputMap, "Order");
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectKeyData getOrder( ) {
    return OrderCancelIn;
  }

}
