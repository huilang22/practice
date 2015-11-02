/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorRateOverrideGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CorridorRateOverrideGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CorridorRateOverrideGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CROObjectData noOpIn;

/**
 *
 * Constructor to create a   CorridorRateOverrideGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CorridorRateOverrideGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CROObjectData noOpInIn) {
    super(id, context, "CorridorRateOverrideGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CorridorRateOverride", CROObjectHelper.toMap(noOpIn, new HashMap(), "CorridorRateOverride").get("CorridorRateOverride"));
    }
  }
/**
 *
 * Sets the  CorridorRateOverride
 * @param noOpInIn CROObjectData to set
 *
 */
  public void setCorridorRateOverride(CROObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CorridorRateOverride passed into the constructor
 * @return Simulated response
 *
 */
  public CROObjectData getCorridorRateOverride() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CROObjectHelper.fromMap(inputMap, "CorridorRateOverride");
  }
}
