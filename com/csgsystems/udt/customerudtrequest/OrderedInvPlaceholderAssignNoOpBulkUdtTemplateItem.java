/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedInvPlaceholderAssignNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a OrderedInvPlaceholderAssignNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedInvPlaceholderAssignNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedInvPlaceholderAssignOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedInvPlaceholderAssignNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedInvPlaceholderAssignNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedInvPlaceholderAssignOutputData noOpInIn) {
    super(id, context, "OrderedInvPlaceholderAssign");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedInvPlaceholderAssignOutputData", OrderedInvPlaceholderAssignOutputHelper.toMap(noOpIn).get("OrderedInvPlaceholderAssignOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedInvPlaceholderAssignOutputData
 * @param noOpInIn OrderedInvPlaceholderAssignOutputData to set
 *
 */
  public void setOrderedInvPlaceholderAssignOutputData(OrderedInvPlaceholderAssignOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedInvPlaceholderAssignOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedInvPlaceholderAssignOutputData getOrderedInvPlaceholderAssignOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedInvPlaceholderAssignOutputHelper.fromMap(inputMap);
  }
}
