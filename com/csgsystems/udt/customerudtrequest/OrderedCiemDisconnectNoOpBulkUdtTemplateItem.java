/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedCiemDisconnectNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedCiemDisconnectNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedCiemDisconnectNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedCiemDisconnectOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedCiemDisconnectNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedCiemDisconnectNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedCiemDisconnectOutputData noOpInIn) {
    super(id, context, "OrderedCiemDisconnect");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedCiemDisconnectOutputData", OrderedCiemDisconnectOutputHelper.toMap(noOpIn).get("OrderedCiemDisconnectOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedCiemDisconnectOutputData
 * @param noOpInIn OrderedCiemDisconnectOutputData to set
 *
 */
  public void setOrderedCiemDisconnectOutputData(OrderedCiemDisconnectOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedCiemDisconnectOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedCiemDisconnectOutputData getOrderedCiemDisconnectOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedCiemDisconnectOutputHelper.fromMap(inputMap);
  }
}
