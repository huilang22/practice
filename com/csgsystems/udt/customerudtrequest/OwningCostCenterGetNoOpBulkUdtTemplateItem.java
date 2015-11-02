/*
 * Generated code DO NOT EDIT
 * Generated file: OwningCostCenterGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OwningCostCenterGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OwningCostCenterGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OwningCostCenterObjectData noOpIn;

/**
 *
 * Constructor to create a   OwningCostCenterGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OwningCostCenterGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OwningCostCenterObjectData noOpInIn) {
    super(id, context, "OwningCostCenterGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OwningCostCenter", OwningCostCenterObjectHelper.toMap(noOpIn, new HashMap(), "OwningCostCenter").get("OwningCostCenter"));
    }
  }
/**
 *
 * Sets the  OwningCostCenter
 * @param noOpInIn OwningCostCenterObjectData to set
 *
 */
  public void setOwningCostCenter(OwningCostCenterObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OwningCostCenter passed into the constructor
 * @return Simulated response
 *
 */
  public OwningCostCenterObjectData getOwningCostCenter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OwningCostCenterObjectHelper.fromMap(inputMap, "OwningCostCenter");
  }
}
