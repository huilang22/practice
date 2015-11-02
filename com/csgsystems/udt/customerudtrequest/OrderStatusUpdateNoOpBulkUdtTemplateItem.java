/*
 * Generated code DO NOT EDIT
 * Generated file: OrderStatusUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderStatusUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderStatusUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderStatusObjectData noOpIn;

/**
 *
 * Constructor to create a   OrderStatusUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderStatusUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderStatusObjectData noOpInIn) {
    super(id, context, "OrderStatusUpdate");
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
