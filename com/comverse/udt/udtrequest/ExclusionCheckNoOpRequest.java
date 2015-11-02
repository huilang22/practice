/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExclusionCheckNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ExclusionCheckNoOpRequest Udt Request/Response
 *
 */
public class ExclusionCheckNoOpRequest extends ExclusionRequest {
/**
 *
 * Constructor to create a   ExclusionCheckNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExclusionCheckNoOpRequest(String id, ExclusionObjectDataList noOpIn) {
    super(id, "ExclusionCheckNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ExclusionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Exclusion", noOpIn);
      }
      addInput("Exclusion", mapList);
    }
  }
/**
 *
 * Retrieves the ExclusionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ExclusionObjectDataList getOutput() {
    return ExclusionObjectHelper.fromMapList(outputMap, "ExclusionList");
  }
}
