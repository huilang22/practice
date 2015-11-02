/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ZoneFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ZoneFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ZoneObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ZoneFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ZoneFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ZoneObjectDataList noOpInIn) {
    super(id, context, "ZoneFind");
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
        mapArray[i] = ZoneObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Zone", noOpIn);
      }
      addInput("Zone", mapList);
    }
  }
/**
 *
 * Sets the  Zone
 * @param noOpInIn ZoneObjectDataList to set
 *
 */
  public void setZone(ZoneObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Zone passed into the constructor
 * @return Simulated response
 *
 */
  public ZoneObjectDataList getZone() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ZoneObjectHelper.fromMapList(inputMap, "ZoneList");
  }
}
