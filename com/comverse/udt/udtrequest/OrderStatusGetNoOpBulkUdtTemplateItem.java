/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderStatusGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderStatusGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderStatusGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderStatusObjectData noOpIn;

/**
 *
 * Constructor to create a   OrderStatusGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderStatusGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderStatusObjectData noOpInIn) {
    super(id, context, "OrderStatusGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderStatus", OrderStatusObjectHelper.toMap(noOpIn, new HashMap(), "OrderStatus").get("OrderStatus"));
    }
  }
/**
 *
 * Sets the  OrderStatus
 * @param noOpInIn OrderStatusObjectData to set
 *
 */
  public void setOrderStatus(OrderStatusObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderStatus passed into the constructor
 * @return Simulated response
 *
 */
  public OrderStatusObjectData getOrderStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderStatusObjectHelper.fromMap(inputMap, "OrderStatus");
  }
}
