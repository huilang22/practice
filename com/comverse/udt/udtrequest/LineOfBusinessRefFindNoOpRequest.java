/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LineOfBusinessRefFindNoOpRequest.java
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
 * NoOp class used to simulate a LineOfBusinessRefFindNoOpRequest Udt Request/Response
 *
 */
public class LineOfBusinessRefFindNoOpRequest extends LineOfBusinessRefRequest {
/**
 *
 * Constructor to create a   LineOfBusinessRefFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LineOfBusinessRefFindNoOpRequest(String id, LineOfBusinessRefObjectDataList noOpIn) {
    super(id, "LineOfBusinessRefFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = LineOfBusinessRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("LineOfBusinessRef", noOpIn);
      }
      addInput("LineOfBusinessRef", mapList);
    }
  }
/**
 *
 * Retrieves the LineOfBusinessRefObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public LineOfBusinessRefObjectDataList getOutput() {
    return LineOfBusinessRefObjectHelper.fromMapList(outputMap, "LineOfBusinessRefList");
  }
}
