/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitReasonFindNoOpRequest.java
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

import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitReasonFindNoOpRequest Udt Request/Response
 *
 */
public class CitReasonFindNoOpRequest extends CitReasonRequest {
/**
 *
 * Constructor to create a   CitReasonFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitReasonFindNoOpRequest(String id, CitReasonObjectDataList noOpIn) {
    super(id, "CitReasonFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CitReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CitReason", noOpIn);
      }
      addInput("CitReason", mapList);
    }
  }
/**
 *
 * Retrieves the CitReasonObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CitReasonObjectDataList getOutput() {
    return CitReasonObjectHelper.fromMapList(outputMap, "CitReasonList");
  }
}
