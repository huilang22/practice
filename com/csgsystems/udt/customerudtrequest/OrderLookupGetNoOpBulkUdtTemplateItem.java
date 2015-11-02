/*
 * Generated code DO NOT EDIT
 * Generated file: OrderLookupGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderLookupGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderLookupGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderLookupObjectData noOpIn;

/**
 *
 * Constructor to create a   OrderLookupGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderLookupGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderLookupObjectData noOpInIn) {
    super(id, context, "OrderLookupGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderLookup", OrderLookupObjectHelper.toMap(noOpIn, new HashMap(), "OrderLookup").get("OrderLookup"));
    }
  }
/**
 *
 * Sets the  OrderLookup
 * @param noOpInIn OrderLookupObjectData to set
 *
 */
  public void setOrderLookup(OrderLookupObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderLookup passed into the constructor
 * @return Simulated response
 *
 */
  public OrderLookupObjectData getOrderLookup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderLookupObjectHelper.fromMap(inputMap, "OrderLookup");
  }
}
