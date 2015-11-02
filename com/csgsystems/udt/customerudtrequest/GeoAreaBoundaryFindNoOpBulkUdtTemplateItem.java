/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaBoundaryFindNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a GeoAreaBoundaryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaBoundaryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GeoAreaBoundaryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   GeoAreaBoundaryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaBoundaryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaBoundaryObjectDataList noOpInIn) {
    super(id, context, "GeoAreaBoundaryFind");
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
        mapArray[i] = GeoAreaBoundaryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeoAreaBoundary", noOpIn);
      }
      addInput("GeoAreaBoundary", mapList);
    }
  }
/**
 *
 * Sets the  GeoAreaBoundary
 * @param noOpInIn GeoAreaBoundaryObjectDataList to set
 *
 */
  public void setGeoAreaBoundary(GeoAreaBoundaryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaBoundary passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaBoundaryObjectDataList getGeoAreaBoundary() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GeoAreaBoundaryObjectHelper.fromMapList(inputMap, "GeoAreaBoundaryList");
  }
}
