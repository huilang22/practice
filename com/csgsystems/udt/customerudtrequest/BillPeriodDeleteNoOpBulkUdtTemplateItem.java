/*
 * Generated code DO NOT EDIT
 * Generated file: BillPeriodDeleteNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a BillPeriodDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillPeriodDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BPObjectData noOpIn;

/**
 *
 * Constructor to create a   BillPeriodDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillPeriodDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BPObjectData noOpInIn) {
    super(id, context, "BillPeriodDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillPeriod", BPObjectHelper.toMap(noOpIn, new HashMap(), "BillPeriod").get("BillPeriod"));
    }
  }
/**
 *
 * Sets the  BillPeriod
 * @param noOpInIn BPObjectData to set
 *
 */
  public void setBillPeriod(BPObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillPeriod passed into the constructor
 * @return Simulated response
 *
 */
  public BPObjectData getBillPeriod() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BPObjectHelper.fromMap(inputMap, "BillPeriod");
  }
}
