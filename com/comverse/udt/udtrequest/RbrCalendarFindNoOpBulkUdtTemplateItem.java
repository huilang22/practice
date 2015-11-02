/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrCalendarFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrCalendarFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrCalendarFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrCalendarObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RbrCalendarFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrCalendarFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrCalendarObjectDataList noOpInIn) {
    super(id, context, "RbrCalendarFind");
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
        mapArray[i] = RbrCalendarObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrCalendar", noOpIn);
      }
      addInput("RbrCalendar", mapList);
    }
  }
/**
 *
 * Sets the  RbrCalendar
 * @param noOpInIn RbrCalendarObjectDataList to set
 *
 */
  public void setRbrCalendar(RbrCalendarObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrCalendar passed into the constructor
 * @return Simulated response
 *
 */
  public RbrCalendarObjectDataList getRbrCalendar() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrCalendarObjectHelper.fromMapList(inputMap, "RbrCalendarList");
  }
}
