/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderUnlockBulkUdtTemplateItem.java
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
 * Class used to create a OrderUnlockBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderUnlockBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderObjectKeyData OrderUnlockIn;
/**
 *
 * Constructor to create a  OrderUnlockBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderUnlockBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderObjectKeyData OrderUnlockInIn) {
    super(id, context, "OrderUnlock");
    OrderUnlockIn = OrderUnlockInIn;
  }

  public void translateToMap() {
    if (OrderUnlockIn != null) {
      OrderUnlockIn.resetFlags(true, true);
      addInput("Order", OrderObjectKeyHelper.toMap(OrderUnlockIn, new HashMap(), "OrderObjectKeyData").get("OrderObjectKeyData"));
    }
  }


/**
 *
 * Sets the Order
 * @param OrderUnlockInIn Value of the OrderUnlockIn
 *
 */

  public void setOrder(OrderObjectKeyData OrderUnlockInIn) {
    OrderUnlockIn = OrderUnlockInIn;
  }

  public void translateFromMap() {
    OrderUnlockIn = OrderObjectKeyHelper.fromMap(inputMap, "Order");
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectKeyData getOrder( ) {
    return OrderUnlockIn;
  }

}
