/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalThresholdsGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HistoricalThresholdsGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HistoricalThresholdsGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HistoricalThresholdsObjectData noOpIn;

/**
 *
 * Constructor to create a   HistoricalThresholdsGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HistoricalThresholdsGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalThresholdsObjectData noOpInIn) {
    super(id, context, "HistoricalThresholdsGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("HistoricalThresholds", HistoricalThresholdsObjectHelper.toMap(noOpIn, new HashMap(), "HistoricalThresholds").get("HistoricalThresholds"));
    }
  }
/**
 *
 * Sets the  HistoricalThresholds
 * @param noOpInIn HistoricalThresholdsObjectData to set
 *
 */
  public void setHistoricalThresholds(HistoricalThresholdsObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HistoricalThresholds passed into the constructor
 * @return Simulated response
 *
 */
  public HistoricalThresholdsObjectData getHistoricalThresholds() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HistoricalThresholdsObjectHelper.fromMap(inputMap, "HistoricalThresholds");
  }
}
