/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneFindNoOpRequest.java
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
 * NoOp class used to simulate a ZoneFindNoOpRequest Udt Request/Response
 *
 */
public class ZoneFindNoOpRequest extends ZoneRequest {
/**
 *
 * Constructor to create a   ZoneFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ZoneFindNoOpRequest(String id, ZoneObjectDataList noOpIn) {
    super(id, "ZoneFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ZoneObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Zone", noOpIn);
      }
      addInput("Zone", mapList);
    }
  }
/**
 *
 * Retrieves the ZoneObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ZoneObjectDataList getOutput() {
    return ZoneObjectHelper.fromMapList(outputMap, "ZoneList");
  }
}
