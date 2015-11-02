/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaTypeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.svbl.data.*;

/**
 *
 * NoOp class used to simulate a GeoAreaTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GeoAreaTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   GeoAreaTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaTypeObjectDataList noOpInIn) {
    super(id, context, "GeoAreaTypeFind");
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
        mapArray[i] = GeoAreaTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeoAreaType", noOpIn);
      }
      addInput("GeoAreaType", mapList);
    }
  }
/**
 *
 * Sets the  GeoAreaType
 * @param noOpInIn GeoAreaTypeObjectDataList to set
 *
 */
  public void setGeoAreaType(GeoAreaTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaType passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaTypeObjectDataList getGeoAreaType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GeoAreaTypeObjectHelper.fromMapList(inputMap, "GeoAreaTypeList");
  }
}
