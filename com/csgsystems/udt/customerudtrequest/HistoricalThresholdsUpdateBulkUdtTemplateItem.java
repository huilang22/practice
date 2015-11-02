/*
 * Generated code DO NOT EDIT
 * Generated file: HistoricalThresholdsUpdateBulkUdtTemplateItem.java
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
 * Class used to create a HistoricalThresholdsUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class HistoricalThresholdsUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HistoricalThresholdsObjectData HTUpdateIn;
/**
 *
 * Constructor to create a  HistoricalThresholdsUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HistoricalThresholdsUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalThresholdsObjectData HTUpdateInIn) {
    super(id, context, "HistoricalThresholdsUpdate");
    HTUpdateIn = HTUpdateInIn;
  }

  public void translateToMap() {
    if (HTUpdateIn != null) {
      HTUpdateIn.resetFlags(true, true);
      addInput("HistoricalThresholds", HistoricalThresholdsObjectHelper.toMap(HTUpdateIn, new HashMap(), "HistoricalThresholds").get("HistoricalThresholds"));
    }
  }


/**
 *
 * Sets the HistoricalThresholds
 * @param HTUpdateInIn Value of the HTUpdateIn
 *
 */

  public void setHistoricalThresholds(HistoricalThresholdsObjectData HTUpdateInIn) {
    HTUpdateIn = HTUpdateInIn;
  }

  public void translateFromMap() {
    HTUpdateIn = HistoricalThresholdsObjectHelper.fromMap(inputMap, "HistoricalThresholds");
  }

/**
 *
 * Gets the HistoricalThresholds
 * @return Value of the HistoricalThresholds
 *
 */

  public HistoricalThresholdsObjectData getHistoricalThresholds( ) {
    return HTUpdateIn;
  }

}
