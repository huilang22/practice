/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a RateCorridorUsageFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateCorridorUsageFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RCUsageObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RateCorridorUsageFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateCorridorUsageFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RCUsageObjectDataList noOpInIn) {
    super(id, context, "RateCorridorUsageFind");
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
        mapArray[i] = RCUsageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateCorridorUsage", noOpIn);
      }
      addInput("RateCorridorUsage", mapList);
    }
  }
/**
 *
 * Sets the  RateCorridorUsage
 * @param noOpInIn RCUsageObjectDataList to set
 *
 */
  public void setRateCorridorUsage(RCUsageObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateCorridorUsage passed into the constructor
 * @return Simulated response
 *
 */
  public RCUsageObjectDataList getRateCorridorUsage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RCUsageObjectHelper.fromMapList(inputMap, "RateCorridorUsageList");
  }
}
