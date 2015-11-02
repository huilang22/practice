/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedInvPlaceholderCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedInvPlaceholderCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedInvPlaceholderCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedInvPlaceholderCreateOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedInvPlaceholderCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedInvPlaceholderCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedInvPlaceholderCreateOutputData noOpInIn) {
    super(id, context, "OrderedInvPlaceholderCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedInvPlaceholderCreateOutputData", OrderedInvPlaceholderCreateOutputHelper.toMap(noOpIn).get("OrderedInvPlaceholderCreateOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedInvPlaceholderCreateOutputData
 * @param noOpInIn OrderedInvPlaceholderCreateOutputData to set
 *
 */
  public void setOrderedInvPlaceholderCreateOutputData(OrderedInvPlaceholderCreateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedInvPlaceholderCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedInvPlaceholderCreateOutputData getOrderedInvPlaceholderCreateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedInvPlaceholderCreateOutputHelper.fromMap(inputMap);
  }
}
