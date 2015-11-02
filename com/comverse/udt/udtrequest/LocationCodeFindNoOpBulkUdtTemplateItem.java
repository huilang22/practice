/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LocationCodeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LocationCodeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LocationCodeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LOCObjectDataList noOpIn;

/**
 *
 * Constructor to create a   LocationCodeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LocationCodeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LOCObjectDataList noOpInIn) {
    super(id, context, "LocationCodeFind");
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
        mapArray[i] = LOCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("LocationCode", noOpIn);
      }
      addInput("LocationCode", mapList);
    }
  }
/**
 *
 * Sets the  LocationCode
 * @param noOpInIn LOCObjectDataList to set
 *
 */
  public void setLocationCode(LOCObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LocationCode passed into the constructor
 * @return Simulated response
 *
 */
  public LOCObjectDataList getLocationCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LOCObjectHelper.fromMapList(inputMap, "LocationCodeList");
  }
}
