/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeRateOverridesUpdateBulkUdtTemplateItem.java
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
 * Class used to create a LateFeeRateOverridesUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class LateFeeRateOverridesUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LateFeeRateOverridesObjectData LFROuIn;
/**
 *
 * Constructor to create a  LateFeeRateOverridesUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LateFeeRateOverridesUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, LateFeeRateOverridesObjectData LFROuInIn) {
    super(id, context, "LateFeeRateOverridesUpdate");
    LFROuIn = LFROuInIn;
  }

  public void translateToMap() {
    if (LFROuIn != null) {
      LFROuIn.resetFlags(true, true);
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectHelper.toMap(LFROuIn, new HashMap(), "LateFeeRateOverrides").get("LateFeeRateOverrides"));
    }
  }


/**
 *
 * Sets the LateFeeRateOverrides
 * @param LFROuInIn Value of the LFROuIn
 *
 */

  public void setLateFeeRateOverrides(LateFeeRateOverridesObjectData LFROuInIn) {
    LFROuIn = LFROuInIn;
  }

  public void translateFromMap() {
    LFROuIn = LateFeeRateOverridesObjectHelper.fromMap(inputMap, "LateFeeRateOverrides");
  }

/**
 *
 * Gets the LateFeeRateOverrides
 * @return Value of the LateFeeRateOverrides
 *
 */

  public LateFeeRateOverridesObjectData getLateFeeRateOverrides( ) {
    return LFROuIn;
  }

}
