/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GAObjectDataList noOpIn;

/**
 *
 * Constructor to create a   GeoAreaFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GAObjectDataList noOpInIn) {
    super(id, context, "GeoAreaFind");
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
        mapArray[i] = GAObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeoArea", noOpIn);
      }
      addInput("GeoArea", mapList);
    }
  }
/**
 *
 * Sets the  GeoArea
 * @param noOpInIn GAObjectDataList to set
 *
 */
  public void setGeoArea(GAObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoArea passed into the constructor
 * @return Simulated response
 *
 */
  public GAObjectDataList getGeoArea() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GAObjectHelper.fromMapList(inputMap, "GeoAreaList");
  }
}
