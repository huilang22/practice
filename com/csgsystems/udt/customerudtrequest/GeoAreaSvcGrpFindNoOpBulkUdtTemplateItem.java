/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaSvcGrpFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaSvcGrpFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaSvcGrpFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GASGObjDataList noOpIn;

/**
 *
 * Constructor to create a   GeoAreaSvcGrpFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaSvcGrpFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GASGObjDataList noOpInIn) {
    super(id, context, "GeoAreaSvcGrpFind");
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
        mapArray[i] = GASGObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeoAreaSvcGrp", noOpIn);
      }
      addInput("GeoAreaSvcGrp", mapList);
    }
  }
/**
 *
 * Sets the  GeoAreaSvcGrp
 * @param noOpInIn GASGObjDataList to set
 *
 */
  public void setGeoAreaSvcGrp(GASGObjDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaSvcGrp passed into the constructor
 * @return Simulated response
 *
 */
  public GASGObjDataList getGeoAreaSvcGrp() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GASGObjHelper.fromMapList(inputMap, "GeoAreaSvcGrpList");
  }
}
