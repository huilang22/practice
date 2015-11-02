/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRestrictionGetNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a UnitCrRestrictionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnitCrRestrictionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnitCrRestrictionObjectData noOpIn;

/**
 *
 * Constructor to create a   UnitCrRestrictionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnitCrRestrictionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRestrictionObjectData noOpInIn) {
    super(id, context, "UnitCrRestrictionGet");
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
