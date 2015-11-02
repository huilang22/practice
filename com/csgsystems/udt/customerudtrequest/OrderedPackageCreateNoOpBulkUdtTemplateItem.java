/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedPackageCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedPackageCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedPackageCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedPackageCreateOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedPackageCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedPackageCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedPackageCreateOutputData noOpInIn) {
    super(id, context, "OrderedPackageCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedPackageCreateOutputData", OrderedPackageCreateOutputHelper.toMap(noOpIn).get("OrderedPackageCreateOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedPackageCreateOutputData
 * @param noOpInIn OrderedPackageCreateOutputData to set
 *
 */
  public void setOrderedPackageCreateOutputData(OrderedPackageCreateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedPackageCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedPackageCreateOutputData getOrderedPackageCreateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedPackageCreateOutputHelper.fromMap(inputMap);
  }
}
