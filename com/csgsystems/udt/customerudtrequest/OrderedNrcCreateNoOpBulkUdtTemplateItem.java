/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedNrcCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedNrcCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedNrcCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedNrcCreateOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedNrcCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedNrcCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedNrcCreateOutputData noOpInIn) {
    super(id, context, "OrderedNrcCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedNrcCreateOutputData", OrderedNrcCreateOutputHelper.toMap(noOpIn).get("OrderedNrcCreateOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedNrcCreateOutputData
 * @param noOpInIn OrderedNrcCreateOutputData to set
 *
 */
  public void setOrderedNrcCreateOutputData(OrderedNrcCreateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedNrcCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedNrcCreateOutputData getOrderedNrcCreateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedNrcCreateOutputHelper.fromMap(inputMap);
  }
}
