/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpMemberFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaSvcGrpMemberFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaSvcGrpMemberFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GASGMObjDataList noOpIn;

/**
 *
 * Constructor to create a   GeoAreaSvcGrpMemberFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaSvcGrpMemberFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GASGMObjDataList noOpInIn) {
    super(id, context, "GeoAreaSvcGrpMemberFind");
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
        mapArray[i] = GASGMObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeoAreaSvcGrpMember", noOpIn);
      }
      addInput("GeoAreaSvcGrpMember", mapList);
    }
  }
/**
 *
 * Sets the  GeoAreaSvcGrpMember
 * @param noOpInIn GASGMObjDataList to set
 *
 */
  public void setGeoAreaSvcGrpMember(GASGMObjDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaSvcGrpMember passed into the constructor
 * @return Simulated response
 *
 */
  public GASGMObjDataList getGeoAreaSvcGrpMember() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GASGMObjHelper.fromMapList(inputMap, "GeoAreaSvcGrpMemberList");
  }
}
