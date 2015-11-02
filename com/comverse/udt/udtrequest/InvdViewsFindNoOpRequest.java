/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdViewsFindNoOpRequest.java
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
 * NoOp class used to simulate a InvdViewsFindNoOpRequest Udt Request/Response
 *
 */
public class InvdViewsFindNoOpRequest extends InvdViewsRequest {
/**
 *
 * Constructor to create a   InvdViewsFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvdViewsFindNoOpRequest(String id, InvdViewsObjectDataList noOpIn) {
    super(id, "InvdViewsFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvdViewsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvdViews", noOpIn);
      }
      addInput("InvdViews", mapList);
    }
  }
/**
 *
 * Retrieves the InvdViewsObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvdViewsObjectDataList getOutput() {
    return InvdViewsObjectHelper.fromMapList(outputMap, "InvdViewsList");
  }
}
