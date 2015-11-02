/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointTextFindNoOpRequest.java
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
 * NoOp class used to simulate a UsagePointTextFindNoOpRequest Udt Request/Response
 *
 */
public class UsagePointTextFindNoOpRequest extends UsagePointTextRequest {
/**
 *
 * Constructor to create a   UsagePointTextFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsagePointTextFindNoOpRequest(String id, UsagePointTextObjectDataList noOpIn) {
    super(id, "UsagePointTextFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = UsagePointTextObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsagePointText", noOpIn);
      }
      addInput("UsagePointText", mapList);
    }
  }
/**
 *
 * Retrieves the UsagePointTextObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public UsagePointTextObjectDataList getOutput() {
    return UsagePointTextObjectHelper.fromMapList(outputMap, "UsagePointTextList");
  }
}
