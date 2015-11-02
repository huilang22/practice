/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimePeriodFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrTimePeriodFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrTimePeriodFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrTimePeriodObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RbrTimePeriodFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrTimePeriodFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrTimePeriodObjectDataList noOpInIn) {
    super(id, context, "RbrTimePeriodFind");
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
        mapArray[i] = RbrTimePeriodObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrTimePeriod", noOpIn);
      }
      addInput("RbrTimePeriod", mapList);
    }
  }
/**
 *
 * Sets the  RbrTimePeriod
 * @param noOpInIn RbrTimePeriodObjectDataList to set
 *
 */
  public void setRbrTimePeriod(RbrTimePeriodObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrTimePeriod passed into the constructor
 * @return Simulated response
 *
 */
  public RbrTimePeriodObjectDataList getRbrTimePeriod() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrTimePeriodObjectHelper.fromMapList(inputMap, "RbrTimePeriodList");
  }
}
