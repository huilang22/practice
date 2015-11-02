/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalThresholdsCreateBulkUdtTemplateItem.java
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
 * Class used to create a HistoricalThresholdsCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class HistoricalThresholdsCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HistoricalThresholdsObjectData HTCreateIn;
/**
 *
 * Constructor to create a  HistoricalThresholdsCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HistoricalThresholdsCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalThresholdsObjectData HTCreateInIn) {
    super(id, context, "HistoricalThresholdsCreate");
    HTCreateIn = HTCreateInIn;
  }

  public void translateToMap() {
    if (HTCreateIn != null) {
      HTCreateIn.resetFlags(true, true);
      addInput("HistoricalThresholds", HistoricalThresholdsObjectHelper.toMap(HTCreateIn, new HashMap(), "HistoricalThresholds").get("HistoricalThresholds"));
    }
  }


/**
 *
 * Sets the HistoricalThresholds
 * @param HTCreateInIn Value of the HTCreateIn
 *
 */

  public void setHistoricalThresholds(HistoricalThresholdsObjectData HTCreateInIn) {
    HTCreateIn = HTCreateInIn;
  }

  public void translateFromMap() {
    HTCreateIn = HistoricalThresholdsObjectHelper.fromMap(inputMap, "HistoricalThresholds");
  }

/**
 *
 * Gets the HistoricalThresholds
 * @return Value of the HistoricalThresholds
 *
 */

  public HistoricalThresholdsObjectData getHistoricalThresholds( ) {
    return HTCreateIn;
  }

}
