/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedComponentDisconnectNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedComponentDisconnectNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedComponentDisconnectNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedComponentDisconnectOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedComponentDisconnectNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedComponentDisconnectNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedComponentDisconnectOutputData noOpInIn) {
    super(id, context, "OrderedComponentDisconnect");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedComponentDisconnectOutputData", OrderedComponentDisconnectOutputHelper.toMap(noOpIn).get("OrderedComponentDisconnectOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedComponentDisconnectOutputData
 * @param noOpInIn OrderedComponentDisconnectOutputData to set
 *
 */
  public void setOrderedComponentDisconnectOutputData(OrderedComponentDisconnectOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedComponentDisconnectOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedComponentDisconnectOutputData getOrderedComponentDisconnectOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedComponentDisconnectOutputHelper.fromMap(inputMap);
  }
}
