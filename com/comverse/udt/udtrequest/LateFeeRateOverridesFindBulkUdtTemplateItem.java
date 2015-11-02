/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeRateOverridesFindBulkUdtTemplateItem.java
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
 * Class used to create a LateFeeRateOverridesFindBulkUdtTemplateItem Bulk Template
 *
 */

public class LateFeeRateOverridesFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LateFeeRateOverridesObjectFilter LFROfIn;
/**
 *
 * Constructor to create a  LateFeeRateOverridesFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LateFeeRateOverridesFindBulkUdtTemplateItem(String id, BSDMSessionContext context, LateFeeRateOverridesObjectFilter LFROfInIn) {
    super(id, context, "LateFeeRateOverridesFind");
    LFROfIn = LFROfInIn;
  }

  public void translateToMap() {
    if (LFROfIn != null) {
      Integer index =  LFROfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectHelper.toMap(LFROfIn, new HashMap(), "LateFeeRateOverrides").get("LateFeeRateOverrides"));
    }
  }


/**
 *
 * Sets the LateFeeRateOverrides
 * @param LFROfInIn Value of the LFROfIn
 *
 */

  public void setLateFeeRateOverrides(LateFeeRateOverridesObjectFilter LFROfInIn) {
    LFROfIn = LFROfInIn;
  }

  public void translateFromMap() {
    LFROfIn = LateFeeRateOverridesObjectHelper.fromMapFilter(inputMap, "LateFeeRateOverrides");
  }

/**
 *
 * Gets the LateFeeRateOverrides
 * @return Value of the LateFeeRateOverrides
 *
 */

  public LateFeeRateOverridesObjectFilter getLateFeeRateOverrides( ) {
    return LFROfIn;
  }

}
