/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceZoneFindNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ServiceZoneFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceZoneFindNoOpRequest extends ServiceZoneRequest {
/**
 *
 * Constructor to create a   ServiceZoneFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceZoneFindNoOpRequest(String id, ServiceZoneObjectDataList noOpIn) {
    super(id, "ServiceZoneFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServiceZoneObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceZone", noOpIn);
      }
      addInput("ServiceZone", mapList);
    }
  }
/**
 *
 * Retrieves the ServiceZoneObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceZoneObjectDataList getOutput() {
    return ServiceZoneObjectHelper.fromMapList(outputMap, "ServiceZoneList");
  }
}
