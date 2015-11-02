/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGeoAreaScheduleFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcGeoAreaScheduleFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcGeoAreaScheduleFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcGeoAreaScheduleObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcGeoAreaScheduleFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcGeoAreaScheduleFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcGeoAreaScheduleObjectDataList noOpInIn) {
    super(id, context, "CtcGeoAreaScheduleFind");
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
        mapArray[i] = CtcGeoAreaScheduleObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcGeoAreaSchedule", noOpIn);
      }
      addInput("CtcGeoAreaSchedule", mapList);
    }
  }
/**
 *
 * Sets the  CtcGeoAreaSchedule
 * @param noOpInIn CtcGeoAreaScheduleObjectDataList to set
 *
 */
  public void setCtcGeoAreaSchedule(CtcGeoAreaScheduleObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcGeoAreaSchedule passed into the constructor
 * @return Simulated response
 *
 */
  public CtcGeoAreaScheduleObjectDataList getCtcGeoAreaSchedule() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcGeoAreaScheduleObjectHelper.fromMapList(inputMap, "CtcGeoAreaScheduleList");
  }
}
