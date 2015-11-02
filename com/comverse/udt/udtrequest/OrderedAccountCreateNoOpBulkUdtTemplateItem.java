/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedAccountCreateNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a OrderedAccountCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedAccountCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedAccountCreateOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedAccountCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedAccountCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedAccountCreateOutputData noOpInIn) {
    super(id, context, "OrderedAccountCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedAccountCreateOutputData", OrderedAccountCreateOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  OrderedAccountCreateOutputData
 * @param noOpInIn OrderedAccountCreateOutputData to set
 *
 */
  public void setOrderedAccountCreateOutputData(OrderedAccountCreateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedAccountCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedAccountCreateOutputData getOrderedAccountCreateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedAccountCreateOutputHelper.fromMap(inputMap);
  }
}
