/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemGetNoOpBulkUdtTemplateItem.java
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

/**
 *
 * NoOp class used to simulate a BalanceLineItemGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BalanceLineItemGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BalanceLineItemObjectData noOpIn;

/**
 *
 * Constructor to create a   BalanceLineItemGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BalanceLineItemGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BalanceLineItemObjectData noOpInIn) {
    super(id, context, "BalanceLineItemGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BalanceLineItem", BalanceLineItemObjectHelper.toMap(noOpIn, new HashMap(), "BalanceLineItem").get("BalanceLineItem"));
    }
  }
/**
 *
 * Sets the  BalanceLineItem
 * @param noOpInIn BalanceLineItemObjectData to set
 *
 */
  public void setBalanceLineItem(BalanceLineItemObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BalanceLineItem passed into the constructor
 * @return Simulated response
 *
 */
  public BalanceLineItemObjectData getBalanceLineItem() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BalanceLineItemObjectHelper.fromMap(inputMap, "BalanceLineItem");
  }
}
