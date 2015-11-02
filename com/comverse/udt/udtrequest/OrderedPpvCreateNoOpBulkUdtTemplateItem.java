/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedPpvCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;

/**
 *
 * NoOp class used to simulate a OrderedPpvCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedPpvCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedPpvCreateOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedPpvCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedPpvCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedPpvCreateOutputData noOpInIn) {
    super(id, context, "OrderedPpvCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedPpvCreateOutputData", OrderedPpvCreateOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  OrderedPpvCreateOutputData
 * @param noOpInIn OrderedPpvCreateOutputData to set
 *
 */
  public void setOrderedPpvCreateOutputData(OrderedPpvCreateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedPpvCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedPpvCreateOutputData getOrderedPpvCreateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedPpvCreateOutputHelper.fromMap(inputMap);
  }
}
