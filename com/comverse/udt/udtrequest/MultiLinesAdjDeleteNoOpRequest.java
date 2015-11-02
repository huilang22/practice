/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MultiLinesAdjDeleteNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a MultiLinesAdjDeleteNoOpRequest Udt Request/Response
 *
 */
public class MultiLinesAdjDeleteNoOpRequest extends MultiLinesAdjRequest {
/**
 *
 * Constructor to create a   MultiLinesAdjDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MultiLinesAdjDeleteNoOpRequest(String id, MultiLinesAdjObjectDataList noOpIn) {
    super(id, "MultiLinesAdjDeleteNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = MultiLinesAdjObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("MultiLinesAdj", noOpIn);
      }
      addInput("MultiLinesAdj", mapList);
    }
  }
/**
 *
 * Retrieves the MultiLinesAdjObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public MultiLinesAdjObjectDataList getOutput() {
    return MultiLinesAdjObjectHelper.fromMapList(outputMap, "MultiLinesAdjList");
  }
}
