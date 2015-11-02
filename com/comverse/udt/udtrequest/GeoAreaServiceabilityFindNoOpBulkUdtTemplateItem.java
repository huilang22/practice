/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaServiceabilityFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaServiceabilityFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaServiceabilityFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GASObjDataList noOpIn;

/**
 *
 * Constructor to create a   GeoAreaServiceabilityFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaServiceabilityFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GASObjDataList noOpInIn) {
    super(id, context, "GeoAreaServiceabilityFind");
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
        mapArray[i] = GASObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeoAreaServiceability", noOpIn);
      }
      addInput("GeoAreaServiceability", mapList);
    }
  }
/**
 *
 * Sets the  GeoAreaServiceability
 * @param noOpInIn GASObjDataList to set
 *
 */
  public void setGeoAreaServiceability(GASObjDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaServiceability passed into the constructor
 * @return Simulated response
 *
 */
  public GASObjDataList getGeoAreaServiceability() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GASObjHelper.fromMapList(inputMap, "GeoAreaServiceabilityList");
  }
}
