/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvModJobFindNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvModJobFindNoOpRequest Udt Request/Response
 *
 */
public class InvModJobFindNoOpRequest extends InvModJobRequest {
/**
 *
 * Constructor to create a   InvModJobFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvModJobFindNoOpRequest(String id, InvModJobObjectDataList noOpIn) {
    super(id, "InvModJobFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvModJobObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvModJob", noOpIn);
      }
      addInput("InvModJob", mapList);
    }
  }
/**
 *
 * Retrieves the InvModJobObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvModJobObjectDataList getOutput() {
    return InvModJobObjectHelper.fromMapList(outputMap, "InvModJobList");
  }
}
