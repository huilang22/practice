/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimJobFindNoOpRequest.java
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
 * NoOp class used to simulate a InvSimJobFindNoOpRequest Udt Request/Response
 *
 */
public class InvSimJobFindNoOpRequest extends InvSimJobRequest {
/**
 *
 * Constructor to create a   InvSimJobFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvSimJobFindNoOpRequest(String id, InvSimJobObjectDataList noOpIn) {
    super(id, "InvSimJobFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvSimJobObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvSimJob", noOpIn);
      }
      addInput("InvSimJob", mapList);
    }
  }
/**
 *
 * Retrieves the InvSimJobObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvSimJobObjectDataList getOutput() {
    return InvSimJobObjectHelper.fromMapList(outputMap, "InvSimJobList");
  }
}
