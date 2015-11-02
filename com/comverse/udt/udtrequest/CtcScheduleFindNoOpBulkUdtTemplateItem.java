/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcScheduleFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcScheduleFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcScheduleFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcScheduleObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcScheduleFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcScheduleFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcScheduleObjectDataList noOpInIn) {
    super(id, context, "CtcScheduleFind");
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
        mapArray[i] = CtcScheduleObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcSchedule", noOpIn);
      }
      addInput("CtcSchedule", mapList);
    }
  }
/**
 *
 * Sets the  CtcSchedule
 * @param noOpInIn CtcScheduleObjectDataList to set
 *
 */
  public void setCtcSchedule(CtcScheduleObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcSchedule passed into the constructor
 * @return Simulated response
 *
 */
  public CtcScheduleObjectDataList getCtcSchedule() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcScheduleObjectHelper.fromMapList(inputMap, "CtcScheduleList");
  }
}
