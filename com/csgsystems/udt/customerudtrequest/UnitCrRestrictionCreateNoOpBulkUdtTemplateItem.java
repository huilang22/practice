/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrRestrictionCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UnitCrRestrictionCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnitCrRestrictionCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnitCrRestrictionObjectData noOpIn;

/**
 *
 * Constructor to create a   UnitCrRestrictionCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnitCrRestrictionCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRestrictionObjectData noOpInIn) {
    super(id, context, "UnitCrRestrictionCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UnitCrRestriction", UnitCrRestrictionObjectHelper.toMap(noOpIn, new HashMap(), "UnitCrRestriction").get("UnitCrRestriction"));
    }
  }
/**
 *
 * Sets the  UnitCrRestriction
 * @param noOpInIn UnitCrRestrictionObjectData to set
 *
 */
  public void setUnitCrRestriction(UnitCrRestrictionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnitCrRestriction passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrRestrictionObjectData getUnitCrRestriction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnitCrRestrictionObjectHelper.fromMap(inputMap, "UnitCrRestriction");
  }
}
