/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedServiceSuspendNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedServiceSuspendNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedServiceSuspendNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedServiceSuspendOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedServiceSuspendNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedServiceSuspendNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedServiceSuspendOutputData noOpInIn) {
    super(id, context, "OrderedServiceSuspend");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedServiceSuspendOutputData", OrderedServiceSuspendOutputHelper.toMap(noOpIn).get("OrderedServiceSuspendOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedServiceSuspendOutputData
 * @param noOpInIn OrderedServiceSuspendOutputData to set
 *
 */
  public void setOrderedServiceSuspendOutputData(OrderedServiceSuspendOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedServiceSuspendOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedServiceSuspendOutputData getOrderedServiceSuspendOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedServiceSuspendOutputHelper.fromMap(inputMap);
  }
}
