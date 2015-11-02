/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneClassFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ZoneClassFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ZoneClassFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ZoneClassObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ZoneClassFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ZoneClassFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ZoneClassObjectDataList noOpInIn) {
    super(id, context, "ZoneClassFind");
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
        mapArray[i] = ZoneClassObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ZoneClass", noOpIn);
      }
      addInput("ZoneClass", mapList);
    }
  }
/**
 *
 * Sets the  ZoneClass
 * @param noOpInIn ZoneClassObjectDataList to set
 *
 */
  public void setZoneClass(ZoneClassObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ZoneClass passed into the constructor
 * @return Simulated response
 *
 */
  public ZoneClassObjectDataList getZoneClass() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ZoneClassObjectHelper.fromMapList(inputMap, "ZoneClassList");
  }
}
