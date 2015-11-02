/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SuspendedReasonFindNoOpRequest.java
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

import com.csgsystems.ar.data.*;

/**
 *
 * NoOp class used to simulate a SuspendedReasonFindNoOpRequest Udt Request/Response
 *
 */
public class SuspendedReasonFindNoOpRequest extends SuspendedReasonRequest {
/**
 *
 * Constructor to create a   SuspendedReasonFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SuspendedReasonFindNoOpRequest(String id, SuspendedReasonObjectDataList noOpIn) {
    super(id, "SuspendedReasonFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = SuspendedReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SuspendedReason", noOpIn);
      }
      addInput("SuspendedReason", mapList);
    }
  }
/**
 *
 * Retrieves the SuspendedReasonObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public SuspendedReasonObjectDataList getOutput() {
    return SuspendedReasonObjectHelper.fromMapList(outputMap, "SuspendedReasonList");
  }
}
