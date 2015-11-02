/*
 * Generated code DO NOT EDIT
 * Generated file: RevRcvCostCenterGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RevRcvCostCenterGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RevRcvCostCenterGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RevRcvCostCenterObjectData noOpIn;

/**
 *
 * Constructor to create a   RevRcvCostCenterGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RevRcvCostCenterGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RevRcvCostCenterObjectData noOpInIn) {
    super(id, context, "RevRcvCostCenterGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectHelper.toMap(noOpIn, new HashMap(), "RevRcvCostCenter").get("RevRcvCostCenter"));
    }
  }
/**
 *
 * Sets the  RevRcvCostCenter
 * @param noOpInIn RevRcvCostCenterObjectData to set
 *
 */
  public void setRevRcvCostCenter(RevRcvCostCenterObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RevRcvCostCenter passed into the constructor
 * @return Simulated response
 *
 */
  public RevRcvCostCenterObjectData getRevRcvCostCenter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RevRcvCostCenterObjectHelper.fromMap(inputMap, "RevRcvCostCenter");
  }
}
