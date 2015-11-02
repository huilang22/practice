/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedProductCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedProductCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedProductCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedProductCreateOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedProductCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedProductCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedProductCreateOutputData noOpInIn) {
    super(id, context, "OrderedProductCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedProductCreateOutputData", OrderedProductCreateOutputHelper.toMap(noOpIn).get("OrderedProductCreateOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedProductCreateOutputData
 * @param noOpInIn OrderedProductCreateOutputData to set
 *
 */
  public void setOrderedProductCreateOutputData(OrderedProductCreateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedProductCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedProductCreateOutputData getOrderedProductCreateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedProductCreateOutputHelper.fromMap(inputMap);
  }
}
