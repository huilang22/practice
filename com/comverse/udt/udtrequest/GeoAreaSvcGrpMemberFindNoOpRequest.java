/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpMemberFindNoOpRequest.java
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

import com.csgsystems.svbl.data.*;

/**
 *
 * NoOp class used to simulate a GeoAreaSvcGrpMemberFindNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaSvcGrpMemberFindNoOpRequest extends GeoAreaSvcGrpMemberRequest {
/**
 *
 * Constructor to create a   GeoAreaSvcGrpMemberFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaSvcGrpMemberFindNoOpRequest(String id, GASGMObjDataList noOpIn) {
    super(id, "GeoAreaSvcGrpMemberFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GASGMObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeoAreaSvcGrpMember", noOpIn);
      }
      addInput("GeoAreaSvcGrpMember", mapList);
    }
  }
/**
 *
 * Retrieves the GASGMObjDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GASGMObjDataList getOutput() {
    return GASGMObjHelper.fromMapList(outputMap, "GeoAreaSvcGrpMemberList");
  }
}
