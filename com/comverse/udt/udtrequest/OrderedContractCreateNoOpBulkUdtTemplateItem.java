/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedContractCreateNoOpBulkUdtTemplateItem.java
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

/**
 *
 * NoOp class used to simulate a OrderedContractCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedContractCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedContractCreateOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedContractCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedContractCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedContractCreateOutputData noOpInIn) {
    super(id, context, "OrderedContractCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedContractCreateOutputData", OrderedContractCreateOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  OrderedContractCreateOutputData
 * @param noOpInIn OrderedContractCreateOutputData to set
 *
 */
  public void setOrderedContractCreateOutputData(OrderedContractCreateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedContractCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedContractCreateOutputData getOrderedContractCreateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedContractCreateOutputHelper.fromMap(inputMap);
  }
}
