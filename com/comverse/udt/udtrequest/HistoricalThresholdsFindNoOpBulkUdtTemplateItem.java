/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalThresholdsFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HistoricalThresholdsFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HistoricalThresholdsFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HistoricalThresholdsObjectDataList noOpIn;

/**
 *
 * Constructor to create a   HistoricalThresholdsFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HistoricalThresholdsFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalThresholdsObjectDataList noOpInIn) {
    super(id, context, "HistoricalThresholdsFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = HistoricalThresholdsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HistoricalThresholds", noOpIn);
      }
      addInput("HistoricalThresholds", mapList);
    }
  }
/**
 *
 * Sets the  HistoricalThresholds
 * @param noOpInIn HistoricalThresholdsObjectDataList to set
 *
 */
  public void setHistoricalThresholds(HistoricalThresholdsObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HistoricalThresholds passed into the constructor
 * @return Simulated response
 *
 */
  public HistoricalThresholdsObjectDataList getHistoricalThresholds() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HistoricalThresholdsObjectHelper.fromMapList(inputMap, "HistoricalThresholdsList");
  }
}
