/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderUpdateBulkUdtTemplateItem.java
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
 * Class used to create a OrderUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderObjectData OrderUpdateIn;
/**
 *
 * Constructor to create a  OrderUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderObjectData OrderUpdateInIn) {
    super(id, context, "OrderUpdate");
    OrderUpdateIn = OrderUpdateInIn;
  }

  public void translateToMap() {
    if (OrderUpdateIn != null) {
      OrderUpdateIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(OrderUpdateIn, new HashMap(), "Order").get("Order"));
    }
  }


/**
 *
 * Sets the Order
 * @param OrderUpdateInIn Value of the OrderUpdateIn
 *
 */

  public void setOrder(OrderObjectData OrderUpdateInIn) {
    OrderUpdateIn = OrderUpdateInIn;
  }

  public void translateFromMap() {
    OrderUpdateIn = OrderObjectHelper.fromMap(inputMap, "Order");
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return OrderUpdateIn;
  }

}
