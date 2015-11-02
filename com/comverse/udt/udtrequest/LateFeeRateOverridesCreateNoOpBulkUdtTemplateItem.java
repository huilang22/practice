/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeRateOverridesCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a LateFeeRateOverridesCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LateFeeRateOverridesCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LateFeeRateOverridesObjectData noOpIn;

/**
 *
 * Constructor to create a   LateFeeRateOverridesCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LateFeeRateOverridesCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LateFeeRateOverridesObjectData noOpInIn) {
    super(id, context, "LateFeeRateOverridesCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectHelper.toMap(noOpIn, new HashMap(), "LateFeeRateOverrides").get("LateFeeRateOverrides"));
    }
  }
/**
 *
 * Sets the  LateFeeRateOverrides
 * @param noOpInIn LateFeeRateOverridesObjectData to set
 *
 */
  public void setLateFeeRateOverrides(LateFeeRateOverridesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LateFeeRateOverrides passed into the constructor
 * @return Simulated response
 *
 */
  public LateFeeRateOverridesObjectData getLateFeeRateOverrides() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LateFeeRateOverridesObjectHelper.fromMap(inputMap, "LateFeeRateOverrides");
  }
}
