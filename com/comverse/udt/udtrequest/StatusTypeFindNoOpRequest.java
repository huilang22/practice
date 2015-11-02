/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a StatusTypeFindNoOpRequest Udt Request/Response
 *
 */
public class StatusTypeFindNoOpRequest extends StatusTypeRequest {
/**
 *
 * Constructor to create a   StatusTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public StatusTypeFindNoOpRequest(String id, StatusTypeObjectDataList noOpIn) {
    super(id, "StatusTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = StatusTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("StatusType", noOpIn);
      }
      addInput("StatusType", mapList);
    }
  }
/**
 *
 * Retrieves the StatusTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public StatusTypeObjectDataList getOutput() {
    return StatusTypeObjectHelper.fromMapList(outputMap, "StatusTypeList");
  }
}
