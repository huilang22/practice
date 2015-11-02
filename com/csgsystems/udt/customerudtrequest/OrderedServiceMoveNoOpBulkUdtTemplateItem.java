/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedServiceMoveNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedServiceMoveNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedServiceMoveNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedServiceMoveOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedServiceMoveNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedServiceMoveNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedServiceMoveOutputData noOpInIn) {
    super(id, context, "OrderedServiceMove");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedServiceMoveOutputData", OrderedServiceMoveOutputHelper.toMap(noOpIn).get("OrderedServiceMoveOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedServiceMoveOutputData
 * @param noOpInIn OrderedServiceMoveOutputData to set
 *
 */
  public void setOrderedServiceMoveOutputData(OrderedServiceMoveOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedServiceMoveOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedServiceMoveOutputData getOrderedServiceMoveOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedServiceMoveOutputHelper.fromMap(inputMap);
  }
}
