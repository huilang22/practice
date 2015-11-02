/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedNrcUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedNrcUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedNrcUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedNrcUpdateOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedNrcUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedNrcUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedNrcUpdateOutputData noOpInIn) {
    super(id, context, "OrderedNrcUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedNrcUpdateOutputData", OrderedNrcUpdateOutputHelper.toMap(noOpIn).get("OrderedNrcUpdateOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedNrcUpdateOutputData
 * @param noOpInIn OrderedNrcUpdateOutputData to set
 *
 */
  public void setOrderedNrcUpdateOutputData(OrderedNrcUpdateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedNrcUpdateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedNrcUpdateOutputData getOrderedNrcUpdateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedNrcUpdateOutputHelper.fromMap(inputMap);
  }
}
