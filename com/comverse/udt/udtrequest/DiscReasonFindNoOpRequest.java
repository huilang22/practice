/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscReasonFindNoOpRequest.java
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
 * NoOp class used to simulate a DiscReasonFindNoOpRequest Udt Request/Response
 *
 */
public class DiscReasonFindNoOpRequest extends DiscReasonRequest {
/**
 *
 * Constructor to create a   DiscReasonFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DiscReasonFindNoOpRequest(String id, DiscReasonObjectDataList noOpIn) {
    super(id, "DiscReasonFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = DiscReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DiscReason", noOpIn);
      }
      addInput("DiscReason", mapList);
    }
  }
/**
 *
 * Retrieves the DiscReasonObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public DiscReasonObjectDataList getOutput() {
    return DiscReasonObjectHelper.fromMapList(outputMap, "DiscReasonList");
  }
}
