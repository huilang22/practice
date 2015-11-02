/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedAccountDisconnectNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedAccountDisconnectNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedAccountDisconnectNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedAccountDisconnectOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedAccountDisconnectNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedAccountDisconnectNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedAccountDisconnectOutputData noOpInIn) {
    super(id, context, "OrderedAccountDisconnect");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedAccountDisconnectOutputData", OrderedAccountDisconnectOutputHelper.toMap(noOpIn).get("OrderedAccountDisconnectOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedAccountDisconnectOutputData
 * @param noOpInIn OrderedAccountDisconnectOutputData to set
 *
 */
  public void setOrderedAccountDisconnectOutputData(OrderedAccountDisconnectOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedAccountDisconnectOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedAccountDisconnectOutputData getOrderedAccountDisconnectOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedAccountDisconnectOutputHelper.fromMap(inputMap);
  }
}
