/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobSubstateCompleteNoOpRequest.java
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
 * NoOp class used to simulate a InvJobSubstateCompleteNoOpRequest Udt Request/Response
 *
 */
public class InvJobSubstateCompleteNoOpRequest extends InvJobRequest {
/**
 *
 * Constructor to create a   InvJobSubstateCompleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvJobSubstateCompleteNoOpRequest(String id, InvJobObjectDataList noOpIn) {
    super(id, "InvJobSubstateCompleteNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvJobObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvJob", noOpIn);
      }
      addInput("InvJob", mapList);
    }
  }
/**
 *
 * Retrieves the InvJobObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvJobObjectDataList getOutput() {
    return InvJobObjectHelper.fromMapList(outputMap, "InvJobList");
  }
}
