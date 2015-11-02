/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeRateOverridesCreateBulkUdtTemplateItem.java
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
 * Class used to create a LateFeeRateOverridesCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class LateFeeRateOverridesCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LateFeeRateOverridesObjectData LFROcIn;
/**
 *
 * Constructor to create a  LateFeeRateOverridesCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LateFeeRateOverridesCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, LateFeeRateOverridesObjectData LFROcInIn) {
    super(id, context, "LateFeeRateOverridesCreate");
    LFROcIn = LFROcInIn;
  }

  public void translateToMap() {
    if (LFROcIn != null) {
      LFROcIn.resetFlags(true, true);
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectHelper.toMap(LFROcIn, new HashMap(), "LateFeeRateOverrides").get("LateFeeRateOverrides"));
    }
  }


/**
 *
 * Sets the LateFeeRateOverrides
 * @param LFROcInIn Value of the LFROcIn
 *
 */

  public void setLateFeeRateOverrides(LateFeeRateOverridesObjectData LFROcInIn) {
    LFROcIn = LFROcInIn;
  }

  public void translateFromMap() {
    LFROcIn = LateFeeRateOverridesObjectHelper.fromMap(inputMap, "LateFeeRateOverrides");
  }

/**
 *
 * Gets the LateFeeRateOverrides
 * @return Value of the LateFeeRateOverrides
 *
 */

  public LateFeeRateOverridesObjectData getLateFeeRateOverrides( ) {
    return LFROcIn;
  }

}
