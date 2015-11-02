/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcExternalFindNoOpRequest.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a NrcExternalFindNoOpRequest Udt Request/Response
 *
 */
public class NrcExternalFindNoOpRequest extends NrcRequest {
/**
 *
 * Constructor to create a   NrcExternalFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NrcExternalFindNoOpRequest(String id, NrcObjectDataList noOpIn) {
    super(id, "NrcExternalFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = NrcObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Nrc", noOpIn);
      }
      addInput("Nrc", mapList);
    }
  }
/**
 *
 * Retrieves the NrcObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public NrcObjectDataList getOutput() {
    return NrcObjectHelper.fromMapList(outputMap, "NrcList");
  }
}
