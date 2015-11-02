/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedNrcDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedNrcDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedNrcDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedNrcDeleteOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedNrcDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedNrcDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedNrcDeleteOutputData noOpInIn) {
    super(id, context, "OrderedNrcDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedNrcDeleteOutputData", OrderedNrcDeleteOutputHelper.toMap(noOpIn).get("OrderedNrcDeleteOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedNrcDeleteOutputData
 * @param noOpInIn OrderedNrcDeleteOutputData to set
 *
 */
  public void setOrderedNrcDeleteOutputData(OrderedNrcDeleteOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedNrcDeleteOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedNrcDeleteOutputData getOrderedNrcDeleteOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedNrcDeleteOutputHelper.fromMap(inputMap);
  }
}
