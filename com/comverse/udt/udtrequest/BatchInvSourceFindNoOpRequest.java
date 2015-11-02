/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchInvSourceFindNoOpRequest.java
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

import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchInvSourceFindNoOpRequest Udt Request/Response
 *
 */
public class BatchInvSourceFindNoOpRequest extends BatchInvSourceRequest {
/**
 *
 * Constructor to create a   BatchInvSourceFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchInvSourceFindNoOpRequest(String id, BISObjectDataList noOpIn) {
    super(id, "BatchInvSourceFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BISObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchInvSource", noOpIn);
      }
      addInput("BatchInvSource", mapList);
    }
  }
/**
 *
 * Retrieves the BISObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BISObjectDataList getOutput() {
    return BISObjectHelper.fromMapList(outputMap, "BatchInvSourceList");
  }
}
