/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalThresholdsFindBulkUdtTemplateItem.java
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
 * Class used to create a HistoricalThresholdsFindBulkUdtTemplateItem Bulk Template
 *
 */

public class HistoricalThresholdsFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HistoricalThresholdsObjectFilter HTFindIn;
/**
 *
 * Constructor to create a  HistoricalThresholdsFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HistoricalThresholdsFindBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalThresholdsObjectFilter HTFindInIn) {
    super(id, context, "HistoricalThresholdsFind");
    HTFindIn = HTFindInIn;
  }

  public void translateToMap() {
    if (HTFindIn != null) {
      Integer index =  HTFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HistoricalThresholds", HistoricalThresholdsObjectHelper.toMap(HTFindIn, new HashMap(), "HistoricalThresholds").get("HistoricalThresholds"));
    }
  }


/**
 *
 * Sets the HistoricalThresholds
 * @param HTFindInIn Value of the HTFindIn
 *
 */

  public void setHistoricalThresholds(HistoricalThresholdsObjectFilter HTFindInIn) {
    HTFindIn = HTFindInIn;
  }

  public void translateFromMap() {
    HTFindIn = HistoricalThresholdsObjectHelper.fromMapFilter(inputMap, "HistoricalThresholds");
  }

/**
 *
 * Gets the HistoricalThresholds
 * @return Value of the HistoricalThresholds
 *
 */

  public HistoricalThresholdsObjectFilter getHistoricalThresholds( ) {
    return HTFindIn;
  }

}
