/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonMapFindNoOpRequest.java
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
 * NoOp class used to simulate a StatusReasonMapFindNoOpRequest Udt Request/Response
 *
 */
public class StatusReasonMapFindNoOpRequest extends StatusReasonMapRequest {
/**
 *
 * Constructor to create a   StatusReasonMapFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public StatusReasonMapFindNoOpRequest(String id, SRMObjectDataList noOpIn) {
    super(id, "StatusReasonMapFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = SRMObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("StatusReasonMap", noOpIn);
      }
      addInput("StatusReasonMap", mapList);
    }
  }
/**
 *
 * Retrieves the SRMObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public SRMObjectDataList getOutput() {
    return SRMObjectHelper.fromMapList(outputMap, "StatusReasonMapList");
  }
}
