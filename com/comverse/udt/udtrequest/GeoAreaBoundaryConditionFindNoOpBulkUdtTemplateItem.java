/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryConditionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaBoundaryConditionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaBoundaryConditionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GeoAreaBoundaryConditionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   GeoAreaBoundaryConditionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaBoundaryConditionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaBoundaryConditionObjectDataList noOpInIn) {
    super(id, context, "GeoAreaBoundaryConditionFind");
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
        mapArray[i] = GeoAreaBoundaryConditionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeoAreaBoundaryCondition", noOpIn);
      }
      addInput("GeoAreaBoundaryCondition", mapList);
    }
  }
/**
 *
 * Sets the  GeoAreaBoundaryCondition
 * @param noOpInIn GeoAreaBoundaryConditionObjectDataList to set
 *
 */
  public void setGeoAreaBoundaryCondition(GeoAreaBoundaryConditionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaBoundaryCondition passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaBoundaryConditionObjectDataList getGeoAreaBoundaryCondition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GeoAreaBoundaryConditionObjectHelper.fromMapList(inputMap, "GeoAreaBoundaryConditionList");
  }
}
