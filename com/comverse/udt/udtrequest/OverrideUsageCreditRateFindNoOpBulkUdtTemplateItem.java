/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideUsageCreditRateFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OverrideUsageCreditRateFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OverrideUsageCreditRateFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RUCOverrideObjectDataList noOpIn;

/**
 *
 * Constructor to create a   OverrideUsageCreditRateFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OverrideUsageCreditRateFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RUCOverrideObjectDataList noOpInIn) {
    super(id, context, "OverrideUsageCreditRateFind");
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
        mapArray[i] = RUCOverrideObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OverrideUsageCreditRate", noOpIn);
      }
      addInput("OverrideUsageCreditRate", mapList);
    }
  }
/**
 *
 * Sets the  OverrideUsageCreditRate
 * @param noOpInIn RUCOverrideObjectDataList to set
 *
 */
  public void setOverrideUsageCreditRate(RUCOverrideObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OverrideUsageCreditRate passed into the constructor
 * @return Simulated response
 *
 */
  public RUCOverrideObjectDataList getOverrideUsageCreditRate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RUCOverrideObjectHelper.fromMapList(inputMap, "OverrideUsageCreditRateList");
  }
}
