/*
 * Generated code DO NOT EDIT
 * Generated file: OrderCommitNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderCommitNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderCommitNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderObjectData noOpIn;

/**
 *
 * Constructor to create a   OrderCommitNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderCommitNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderObjectData noOpInIn) {
    super(id, context, "OrderCommit");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(noOpIn, new HashMap(), "Order").get("Order"));
    }
  }
/**
 *
 * Sets the  Order
 * @param noOpInIn OrderObjectData to set
 *
 */
  public void setOrder(OrderObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Order passed into the constructor
 * @return Simulated response
 *
 */
  public OrderObjectData getOrder() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderObjectHelper.fromMap(inputMap, "Order");
  }
}
