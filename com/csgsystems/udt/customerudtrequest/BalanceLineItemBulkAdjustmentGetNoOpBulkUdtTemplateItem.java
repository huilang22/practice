/*
 * Generated code DO NOT EDIT
 * Generated file: BalanceLineItemBulkAdjustmentGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a BalanceLineItemBulkAdjustmentGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BalanceLineItemBulkAdjustmentGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BalanceLineItemBulkAdjustmentGetOutputData noOpIn;

/**
 *
 * Constructor to create a   BalanceLineItemBulkAdjustmentGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BalanceLineItemBulkAdjustmentGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BalanceLineItemBulkAdjustmentGetOutputData noOpInIn) {
    super(id, context, "BalanceLineItemBulkAdjustmentGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BalanceLineItemBulkAdjustmentGetOutputData", BalanceLineItemBulkAdjustmentGetOutputHelper.toMap(noOpIn).get("BalanceLineItemBulkAdjustmentGetOutputData"));
    }
  }
/**
 *
 * Sets the  BalanceLineItemBulkAdjustmentGetOutputData
 * @param noOpInIn BalanceLineItemBulkAdjustmentGetOutputData to set
 *
 */
  public void setBalanceLineItemBulkAdjustmentGetOutputData(BalanceLineItemBulkAdjustmentGetOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BalanceLineItemBulkAdjustmentGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public BalanceLineItemBulkAdjustmentGetOutputData getBalanceLineItemBulkAdjustmentGetOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BalanceLineItemBulkAdjustmentGetOutputHelper.fromMap(inputMap);
  }
}
