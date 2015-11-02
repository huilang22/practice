/*
 * Generated code DO NOT EDIT
 * Generated file: OrderGetDetailNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderGetDetailNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderGetDetailNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderGetDetailOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderGetDetailNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderGetDetailNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderGetDetailOutputData noOpInIn) {
    super(id, context, "OrderGetDetail");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderGetDetailOutputData", OrderGetDetailOutputHelper.toMap(noOpIn).get("OrderGetDetailOutputData"));
    }
  }
/**
 *
 * Sets the  OrderGetDetailOutputData
 * @param noOpInIn OrderGetDetailOutputData to set
 *
 */
  public void setOrderGetDetailOutputData(OrderGetDetailOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderGetDetailOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderGetDetailOutputData getOrderGetDetailOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderGetDetailOutputHelper.fromMap(inputMap);
  }
}
