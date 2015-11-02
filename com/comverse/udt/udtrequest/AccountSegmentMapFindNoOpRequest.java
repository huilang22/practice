/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentMapFindNoOpRequest.java
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
 * NoOp class used to simulate a AccountSegmentMapFindNoOpRequest Udt Request/Response
 *
 */
public class AccountSegmentMapFindNoOpRequest extends AccountSegmentMapRequest {
/**
 *
 * Constructor to create a   AccountSegmentMapFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountSegmentMapFindNoOpRequest(String id, AccountSegmentMapObjectDataList noOpIn) {
    super(id, "AccountSegmentMapFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AccountSegmentMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountSegmentMap", noOpIn);
      }
      addInput("AccountSegmentMap", mapList);
    }
  }
/**
 *
 * Retrieves the AccountSegmentMapObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AccountSegmentMapObjectDataList getOutput() {
    return AccountSegmentMapObjectHelper.fromMapList(outputMap, "AccountSegmentMapList");
  }
}
