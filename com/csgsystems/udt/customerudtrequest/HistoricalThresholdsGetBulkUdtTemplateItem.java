/*
 * Generated code DO NOT EDIT
 * Generated file: HistoricalThresholdsGetBulkUdtTemplateItem.java
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
 * Class used to create a HistoricalThresholdsGetBulkUdtTemplateItem Bulk Template
 *
 */

public class HistoricalThresholdsGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HistoricalThresholdsObjectKeyData HTGetIn;
/**
 *
 * Constructor to create a  HistoricalThresholdsGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HistoricalThresholdsGetBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalThresholdsObjectKeyData HTGetInIn) {
    super(id, context, "HistoricalThresholdsGet");
    HTGetIn = HTGetInIn;
  }

  public void translateToMap() {
    if (HTGetIn != null) {
      HTGetIn.resetFlags(true, true);
      addInput("HistoricalThresholds", HistoricalThresholdsObjectKeyHelper.toMap(HTGetIn, new HashMap(), "HistoricalThresholdsObjectKeyData").get("HistoricalThresholdsObjectKeyData"));
    }
  }


/**
 *
 * Sets the HistoricalThresholds
 * @param HTGetInIn Value of the HTGetIn
 *
 */

  public void setHistoricalThresholds(HistoricalThresholdsObjectKeyData HTGetInIn) {
    HTGetIn = HTGetInIn;
  }

  public void translateFromMap() {
    HTGetIn = HistoricalThresholdsObjectKeyHelper.fromMap(inputMap, "HistoricalThresholds");
  }

/**
 *
 * Gets the HistoricalThresholds
 * @return Value of the HistoricalThresholds
 *
 */

  public HistoricalThresholdsObjectKeyData getHistoricalThresholds( ) {
    return HTGetIn;
  }

}
