/*
 * Generated code DO NOT EDIT
 * Generated file: FranchiseCodeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a FranchiseCodeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class FranchiseCodeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected FranchiseCodeObjectData noOpIn;

/**
 *
 * Constructor to create a   FranchiseCodeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public FranchiseCodeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, FranchiseCodeObjectData noOpInIn) {
    super(id, context, "FranchiseCodeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("FranchiseCode", FranchiseCodeObjectHelper.toMap(noOpIn, new HashMap(), "FranchiseCode").get("FranchiseCode"));
    }
  }
/**
 *
 * Sets the  FranchiseCode
 * @param noOpInIn FranchiseCodeObjectData to set
 *
 */
  public void setFranchiseCode(FranchiseCodeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the FranchiseCode passed into the constructor
 * @return Simulated response
 *
 */
  public FranchiseCodeObjectData getFranchiseCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = FranchiseCodeObjectHelper.fromMap(inputMap, "FranchiseCode");
  }
}
