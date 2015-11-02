/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JobResourcesFindNoOpRequest.java
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

import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a JobResourcesFindNoOpRequest Udt Request/Response
 *
 */
public class JobResourcesFindNoOpRequest extends JobResourcesRequest {
/**
 *
 * Constructor to create a   JobResourcesFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public JobResourcesFindNoOpRequest(String id, JobResourcesObjectDataList noOpIn) {
    super(id, "JobResourcesFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = JobResourcesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("JobResources", noOpIn);
      }
      addInput("JobResources", mapList);
    }
  }
/**
 *
 * Retrieves the JobResourcesObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public JobResourcesObjectDataList getOutput() {
    return JobResourcesObjectHelper.fromMapList(outputMap, "JobResourcesList");
  }
}
