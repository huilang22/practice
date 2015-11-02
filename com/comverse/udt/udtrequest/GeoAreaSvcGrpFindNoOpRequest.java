/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpFindNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaSvcGrpFindNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaSvcGrpFindNoOpRequest extends GeoAreaSvcGrpRequest {
/**
 *
 * Constructor to create a   GeoAreaSvcGrpFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaSvcGrpFindNoOpRequest(String id, GASGObjDataList noOpIn) {
    super(id, "GeoAreaSvcGrpFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GASGObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeoAreaSvcGrp", noOpIn);
      }
      addInput("GeoAreaSvcGrp", mapList);
    }
  }
/**
 *
 * Retrieves the GASGObjDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GASGObjDataList getOutput() {
    return GASGObjHelper.fromMapList(outputMap, "GeoAreaSvcGrpList");
  }
}
