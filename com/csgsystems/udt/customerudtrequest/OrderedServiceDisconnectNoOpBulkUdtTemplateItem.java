/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedServiceDisconnectNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedServiceDisconnectNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedServiceDisconnectNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedServiceDisconnectOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedServiceDisconnectNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedServiceDisconnectNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedServiceDisconnectOutputData noOpInIn) {
    super(id, context, "OrderedServiceDisconnect");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedServiceDisconnectOutputData", OrderedServiceDisconnectOutputHelper.toMap(noOpIn).get("OrderedServiceDisconnectOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedServiceDisconnectOutputData
 * @param noOpInIn OrderedServiceDisconnectOutputData to set
 *
 */
  public void setOrderedServiceDisconnectOutputData(OrderedServiceDisconnectOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedServiceDisconnectOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedServiceDisconnectOutputData getOrderedServiceDisconnectOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedServiceDisconnectOutputHelper.fromMap(inputMap);
  }
}
