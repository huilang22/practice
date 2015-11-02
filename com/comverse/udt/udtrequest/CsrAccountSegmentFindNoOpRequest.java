/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrAccountSegmentFindNoOpRequest.java
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
 * NoOp class used to simulate a CsrAccountSegmentFindNoOpRequest Udt Request/Response
 *
 */
public class CsrAccountSegmentFindNoOpRequest extends CsrAccountSegmentRequest {
/**
 *
 * Constructor to create a   CsrAccountSegmentFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CsrAccountSegmentFindNoOpRequest(String id, CsrAccountSegmentObjectDataList noOpIn) {
    super(id, "CsrAccountSegmentFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CsrAccountSegmentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CsrAccountSegment", noOpIn);
      }
      addInput("CsrAccountSegment", mapList);
    }
  }
/**
 *
 * Retrieves the CsrAccountSegmentObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CsrAccountSegmentObjectDataList getOutput() {
    return CsrAccountSegmentObjectHelper.fromMapList(outputMap, "CsrAccountSegmentList");
  }
}
