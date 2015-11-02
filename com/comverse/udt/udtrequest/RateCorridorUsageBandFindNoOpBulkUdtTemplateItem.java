/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageBandFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateCorridorUsageBandFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateCorridorUsageBandFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RUBOverrideObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RateCorridorUsageBandFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateCorridorUsageBandFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RUBOverrideObjectDataList noOpInIn) {
    super(id, context, "RateCorridorUsageBandFind");
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
        mapArray[i] = RUBOverrideObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateCorridorUsageBand", noOpIn);
      }
      addInput("RateCorridorUsageBand", mapList);
    }
  }
/**
 *
 * Sets the  RateCorridorUsageBand
 * @param noOpInIn RUBOverrideObjectDataList to set
 *
 */
  public void setRateCorridorUsageBand(RUBOverrideObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateCorridorUsageBand passed into the constructor
 * @return Simulated response
 *
 */
  public RUBOverrideObjectDataList getRateCorridorUsageBand() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RUBOverrideObjectHelper.fromMapList(inputMap, "RateCorridorUsageBandList");
  }
}
