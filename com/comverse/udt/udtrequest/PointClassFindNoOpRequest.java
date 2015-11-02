/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointClassFindNoOpRequest.java
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
 * NoOp class used to simulate a PointClassFindNoOpRequest Udt Request/Response
 *
 */
public class PointClassFindNoOpRequest extends PointClassRequest {
/**
 *
 * Constructor to create a   PointClassFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PointClassFindNoOpRequest(String id, PointClassObjectDataList noOpIn) {
    super(id, "PointClassFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PointClassObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PointClass", noOpIn);
      }
      addInput("PointClass", mapList);
    }
  }
/**
 *
 * Retrieves the PointClassObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PointClassObjectDataList getOutput() {
    return PointClassObjectHelper.fromMapList(outputMap, "PointClassList");
  }
}
