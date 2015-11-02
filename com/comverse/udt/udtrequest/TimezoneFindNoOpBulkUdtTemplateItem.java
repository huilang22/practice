/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TimezoneFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a TimezoneFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TimezoneFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TimezoneObjectDataList noOpIn;

/**
 *
 * Constructor to create a   TimezoneFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TimezoneFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TimezoneObjectDataList noOpInIn) {
    super(id, context, "TimezoneFind");
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
        mapArray[i] = TimezoneObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Timezone", noOpIn);
      }
      addInput("Timezone", mapList);
    }
  }
/**
 *
 * Sets the  Timezone
 * @param noOpInIn TimezoneObjectDataList to set
 *
 */
  public void setTimezone(TimezoneObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Timezone passed into the constructor
 * @return Simulated response
 *
 */
  public TimezoneObjectDataList getTimezone() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TimezoneObjectHelper.fromMapList(inputMap, "TimezoneList");
  }
}
