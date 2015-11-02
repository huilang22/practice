/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentFindNoOpRequest.java
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
 * NoOp class used to simulate a AccountSegmentFindNoOpRequest Udt Request/Response
 *
 */
public class AccountSegmentFindNoOpRequest extends AccountSegmentRequest {
/**
 *
 * Constructor to create a   AccountSegmentFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountSegmentFindNoOpRequest(String id, AccountSegmentObjectDataList noOpIn) {
    super(id, "AccountSegmentFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AccountSegmentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountSegment", noOpIn);
      }
      addInput("AccountSegment", mapList);
    }
  }
/**
 *
 * Retrieves the AccountSegmentObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AccountSegmentObjectDataList getOutput() {
    return AccountSegmentObjectHelper.fromMapList(outputMap, "AccountSegmentList");
  }
}
