/*
 * Generated code DO NOT EDIT
 * Generated file: BillInsertGroupUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillInsertGroupUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillInsertGroupUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillInsertGroupObjectData noOpIn;

/**
 *
 * Constructor to create a   BillInsertGroupUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillInsertGroupUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInsertGroupObjectData noOpInIn) {
    super(id, context, "BillInsertGroupUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillInsertGroup", BillInsertGroupObjectHelper.toMap(noOpIn, new HashMap(), "BillInsertGroup").get("BillInsertGroup"));
    }
  }
/**
 *
 * Sets the  BillInsertGroup
 * @param noOpInIn BillInsertGroupObjectData to set
 *
 */
  public void setBillInsertGroup(BillInsertGroupObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillInsertGroup passed into the constructor
 * @return Simulated response
 *
 */
  public BillInsertGroupObjectData getBillInsertGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillInsertGroupObjectHelper.fromMap(inputMap, "BillInsertGroup");
  }
}
