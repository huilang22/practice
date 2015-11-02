/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderStatusUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a OrderStatusUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderStatusUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderStatusObjectData OrderStatusUpdateIn;
/**
 *
 * Constructor to create a  OrderStatusUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderStatusUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderStatusObjectData OrderStatusUpdateInIn) {
    super(id, context, "OrderStatusUpdate");
    OrderStatusUpdateIn = OrderStatusUpdateInIn;
  }

  public void translateToMap() {
    if (OrderStatusUpdateIn != null) {
      OrderStatusUpdateIn.resetFlags(true, true);
      addInput("OrderStatus", OrderStatusObjectHelper.toMap(OrderStatusUpdateIn, new HashMap(), "OrderStatus").get("OrderStatus"));
    }
  }


/**
 *
 * Sets the OrderStatus
 * @param OrderStatusUpdateInIn Value of the OrderStatusUpdateIn
 *
 */

  public void setOrderStatus(OrderStatusObjectData OrderStatusUpdateInIn) {
    OrderStatusUpdateIn = OrderStatusUpdateInIn;
  }

  public void translateFromMap() {
    OrderStatusUpdateIn = OrderStatusObjectHelper.fromMap(inputMap, "OrderStatus");
  }

/**
 *
 * Gets the OrderStatus
 * @return Value of the OrderStatus
 *
 */

  public OrderStatusObjectData getOrderStatus( ) {
    return OrderStatusUpdateIn;
  }

}
