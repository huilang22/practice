/*
 * Generated code DO NOT EDIT
 * Generated file: TaxAssignmentGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a TaxAssignmentGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TaxAssignmentGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TaxAssignmentObjectData noOpIn;

/**
 *
 * Constructor to create a   TaxAssignmentGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TaxAssignmentGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxAssignmentObjectData noOpInIn) {
    super(id, context, "TaxAssignmentGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("TaxAssignment", TaxAssignmentObjectHelper.toMap(noOpIn, new HashMap(), "TaxAssignment").get("TaxAssignment"));
    }
  }
/**
 *
 * Sets the  TaxAssignment
 * @param noOpInIn TaxAssignmentObjectData to set
 *
 */
  public void setTaxAssignment(TaxAssignmentObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TaxAssignment passed into the constructor
 * @return Simulated response
 *
 */
  public TaxAssignmentObjectData getTaxAssignment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TaxAssignmentObjectHelper.fromMap(inputMap, "TaxAssignment");
  }
}
