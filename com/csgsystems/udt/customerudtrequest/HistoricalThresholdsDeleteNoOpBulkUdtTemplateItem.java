/*
 * Generated code DO NOT EDIT
 * Generated file: HistoricalThresholdsDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HistoricalThresholdsDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HistoricalThresholdsDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HistoricalThresholdsObjectData noOpIn;

/**
 *
 * Constructor to create a   HistoricalThresholdsDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HistoricalThresholdsDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalThresholdsObjectData noOpInIn) {
    super(id, context, "HistoricalThresholdsDelete");
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
