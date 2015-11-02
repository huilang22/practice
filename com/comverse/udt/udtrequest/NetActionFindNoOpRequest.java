/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NetActionFindNoOpRequest.java
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
 * NoOp class used to simulate a NetActionFindNoOpRequest Udt Request/Response
 *
 */
public class NetActionFindNoOpRequest extends NetActionRequest {
/**
 *
 * Constructor to create a   NetActionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NetActionFindNoOpRequest(String id, NetActionObjectDataList noOpIn) {
    super(id, "NetActionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = NetActionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NetAction", noOpIn);
      }
      addInput("NetAction", mapList);
    }
  }
/**
 *
 * Retrieves the NetActionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public NetActionObjectDataList getOutput() {
    return NetActionObjectHelper.fromMapList(outputMap, "NetActionList");
  }
}
