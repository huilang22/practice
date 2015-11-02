/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcLineFindNoOpRequest.java
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
 * NoOp class used to simulate a NrcLineFindNoOpRequest Udt Request/Response
 *
 */
public class NrcLineFindNoOpRequest extends NrcLineRequest {
/**
 *
 * Constructor to create a   NrcLineFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NrcLineFindNoOpRequest(String id, NrcLineObjectDataList noOpIn) {
    super(id, "NrcLineFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = NrcLineObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NrcLine", noOpIn);
      }
      addInput("NrcLine", mapList);
    }
  }
/**
 *
 * Retrieves the NrcLineObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public NrcLineObjectDataList getOutput() {
    return NrcLineObjectHelper.fromMapList(outputMap, "NrcLineList");
  }
}
