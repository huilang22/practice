/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneClassFindNoOpRequest.java
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
 * NoOp class used to simulate a ZoneClassFindNoOpRequest Udt Request/Response
 *
 */
public class ZoneClassFindNoOpRequest extends ZoneClassRequest {
/**
 *
 * Constructor to create a   ZoneClassFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ZoneClassFindNoOpRequest(String id, ZoneClassObjectDataList noOpIn) {
    super(id, "ZoneClassFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ZoneClassObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ZoneClass", noOpIn);
      }
      addInput("ZoneClass", mapList);
    }
  }
/**
 *
 * Retrieves the ZoneClassObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ZoneClassObjectDataList getOutput() {
    return ZoneClassObjectHelper.fromMapList(outputMap, "ZoneClassList");
  }
}
