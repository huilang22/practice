/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedCiemCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedCiemCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedCiemCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedCiemCreateOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedCiemCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedCiemCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedCiemCreateOutputData noOpInIn) {
    super(id, context, "OrderedCiemCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedCiemCreateOutputData", OrderedCiemCreateOutputHelper.toMap(noOpIn).get("OrderedCiemCreateOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedCiemCreateOutputData
 * @param noOpInIn OrderedCiemCreateOutputData to set
 *
 */
  public void setOrderedCiemCreateOutputData(OrderedCiemCreateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedCiemCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedCiemCreateOutputData getOrderedCiemCreateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedCiemCreateOutputHelper.fromMap(inputMap);
  }
}
