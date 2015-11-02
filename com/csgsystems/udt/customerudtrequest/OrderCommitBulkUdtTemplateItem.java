/*
 * Generated code DO NOT EDIT
 * Generated file: OrderCommitBulkUdtTemplateItem.java
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
 * Class used to create a OrderCommitBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderCommitBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderObjectKeyData OrderCommitIn;
  protected Integer Force;
/**
 *
 * Constructor to create a  OrderCommitBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderCommitBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderObjectKeyData OrderCommitInIn, Integer ForceIn) {
    super(id, context, "OrderCommit");
    OrderCommitIn = OrderCommitInIn;
    Force = ForceIn;
  }

  public void translateToMap() {
    if (OrderCommitIn != null) {
      OrderCommitIn.resetFlags(true, true);
      addInput("Order", OrderObjectKeyHelper.toMap(OrderCommitIn, new HashMap(), "OrderObjectKeyData").get("OrderObjectKeyData"));
    }
    if (Force != null) {
      addInput("Force", Force);
    }
  }


/**
 *
 * Sets the Order
 * @param OrderCommitInIn Value of the OrderCommitIn
 *
 */

  public void setOrder(OrderObjectKeyData OrderCommitInIn) {
    OrderCommitIn = OrderCommitInIn;
  }

/**
 *
 * Sets the Force
 * @param ForceIn Value of the Force
 *
 */

  public void setForce(Integer ForceIn) {
    Force = ForceIn;
  }

  public void translateFromMap() {
    OrderCommitIn = OrderObjectKeyHelper.fromMap(inputMap, "Order");
    Force = (Integer)inputMap.get("Force");
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectKeyData getOrder( ) {
    return OrderCommitIn;
  }

/**
 *
 * Gets the Force
 * @return Value of the Force
 *
 */

  public Integer getForce( ) {
    return Force;
  }

}
