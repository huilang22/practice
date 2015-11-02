/*
 * Generated code DO NOT EDIT
 * Generated file: BillCycleGetNoOpBulkUdtTemplateItem.java
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

/**
 *
 * NoOp class used to simulate a BillCycleGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillCycleGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillCycleObjectData noOpIn;

/**
 *
 * Constructor to create a   BillCycleGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillCycleGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillCycleObjectData noOpInIn) {
    super(id, context, "BillCycleGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillCycle", BillCycleObjectHelper.toMap(noOpIn, new HashMap(), "BillCycle").get("BillCycle"));
    }
  }
/**
 *
 * Sets the  BillCycle
 * @param noOpInIn BillCycleObjectData to set
 *
 */
  public void setBillCycle(BillCycleObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillCycle passed into the constructor
 * @return Simulated response
 *
 */
  public BillCycleObjectData getBillCycle() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillCycleObjectHelper.fromMap(inputMap, "BillCycle");
  }
}
