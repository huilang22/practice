/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MobileZoneFindNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a MobileZoneFindNoOpRequest Udt Request/Response
 *
 */
public class MobileZoneFindNoOpRequest extends MobileZoneRequest {
/**
 *
 * Constructor to create a   MobileZoneFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MobileZoneFindNoOpRequest(String id, MobileZoneObjectDataList noOpIn) {
    super(id, "MobileZoneFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = MobileZoneObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("MobileZone", noOpIn);
      }
      addInput("MobileZone", mapList);
    }
  }
/**
 *
 * Retrieves the MobileZoneObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public MobileZoneObjectDataList getOutput() {
    return MobileZoneObjectHelper.fromMapList(outputMap, "MobileZoneList");
  }
}
