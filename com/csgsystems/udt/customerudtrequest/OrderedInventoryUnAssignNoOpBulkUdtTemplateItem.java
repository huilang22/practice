/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedInventoryUnAssignNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedInventoryUnAssignNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedInventoryUnAssignNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedInventoryUnAssignOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedInventoryUnAssignNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedInventoryUnAssignNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedInventoryUnAssignOutputData noOpInIn) {
    super(id, context, "OrderedInventoryUnAssign");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedInventoryUnAssignOutputData", OrderedInventoryUnAssignOutputHelper.toMap(noOpIn).get("OrderedInventoryUnAssignOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedInventoryUnAssignOutputData
 * @param noOpInIn OrderedInventoryUnAssignOutputData to set
 *
 */
  public void setOrderedInventoryUnAssignOutputData(OrderedInventoryUnAssignOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedInventoryUnAssignOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedInventoryUnAssignOutputData getOrderedInventoryUnAssignOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedInventoryUnAssignOutputHelper.fromMap(inputMap);
  }
}
