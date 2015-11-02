/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedInventoryAssignNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedInventoryAssignNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedInventoryAssignNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedInventoryAssignOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedInventoryAssignNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedInventoryAssignNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedInventoryAssignOutputData noOpInIn) {
    super(id, context, "OrderedInventoryAssign");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedInventoryAssignOutputData", OrderedInventoryAssignOutputHelper.toMap(noOpIn).get("OrderedInventoryAssignOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedInventoryAssignOutputData
 * @param noOpInIn OrderedInventoryAssignOutputData to set
 *
 */
  public void setOrderedInventoryAssignOutputData(OrderedInventoryAssignOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedInventoryAssignOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedInventoryAssignOutputData getOrderedInventoryAssignOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedInventoryAssignOutputHelper.fromMap(inputMap);
  }
}
