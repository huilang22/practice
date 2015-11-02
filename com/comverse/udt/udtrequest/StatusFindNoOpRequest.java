/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusFindNoOpRequest.java
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
 * NoOp class used to simulate a StatusFindNoOpRequest Udt Request/Response
 *
 */
public class StatusFindNoOpRequest extends StatusRequest {
/**
 *
 * Constructor to create a   StatusFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public StatusFindNoOpRequest(String id, StatusObjectDataList noOpIn) {
    super(id, "StatusFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = StatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Status", noOpIn);
      }
      addInput("Status", mapList);
    }
  }
/**
 *
 * Retrieves the StatusObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public StatusObjectDataList getOutput() {
    return StatusObjectHelper.fromMapList(outputMap, "StatusList");
  }
}
