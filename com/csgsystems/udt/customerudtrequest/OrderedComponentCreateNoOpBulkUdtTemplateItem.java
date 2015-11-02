/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedComponentCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedComponentCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedComponentCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedComponentCreateOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedComponentCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedComponentCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedComponentCreateOutputData noOpInIn) {
    super(id, context, "OrderedComponentCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedComponentCreateOutputData", OrderedComponentCreateOutputHelper.toMap(noOpIn).get("OrderedComponentCreateOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedComponentCreateOutputData
 * @param noOpInIn OrderedComponentCreateOutputData to set
 *
 */
  public void setOrderedComponentCreateOutputData(OrderedComponentCreateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedComponentCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedComponentCreateOutputData getOrderedComponentCreateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedComponentCreateOutputHelper.fromMap(inputMap);
  }
}
