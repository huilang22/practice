/*
 * Generated code DO NOT EDIT
 * Generated file: BillMessageGroupGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillMessageGroupGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillMessageGroupGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillMessageGroupObjectData noOpIn;

/**
 *
 * Constructor to create a   BillMessageGroupGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillMessageGroupGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillMessageGroupObjectData noOpInIn) {
    super(id, context, "BillMessageGroupGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillMessageGroup", BillMessageGroupObjectHelper.toMap(noOpIn, new HashMap(), "BillMessageGroup").get("BillMessageGroup"));
    }
  }
/**
 *
 * Sets the  BillMessageGroup
 * @param noOpInIn BillMessageGroupObjectData to set
 *
 */
  public void setBillMessageGroup(BillMessageGroupObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillMessageGroup passed into the constructor
 * @return Simulated response
 *
 */
  public BillMessageGroupObjectData getBillMessageGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillMessageGroupObjectHelper.fromMap(inputMap, "BillMessageGroup");
  }
}
