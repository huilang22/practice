/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcComponentFindNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a SvcComponentFindNoOpRequest Udt Request/Response
 *
 */
public class SvcComponentFindNoOpRequest extends SvcComponentRequest {
/**
 *
 * Constructor to create a   SvcComponentFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SvcComponentFindNoOpRequest(String id, SvcComponentObjectDataList noOpIn) {
    super(id, "SvcComponentFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = SvcComponentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SvcComponent", noOpIn);
      }
      addInput("SvcComponent", mapList);
    }
  }
/**
 *
 * Retrieves the SvcComponentObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public SvcComponentObjectDataList getOutput() {
    return SvcComponentObjectHelper.fromMapList(outputMap, "SvcComponentList");
  }
}
