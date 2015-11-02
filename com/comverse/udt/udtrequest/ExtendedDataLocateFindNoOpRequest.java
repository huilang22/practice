/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataLocateFindNoOpRequest.java
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
 * NoOp class used to simulate a ExtendedDataLocateFindNoOpRequest Udt Request/Response
 *
 */
public class ExtendedDataLocateFindNoOpRequest extends ExtendedDataLocateRequest {
/**
 *
 * Constructor to create a   ExtendedDataLocateFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExtendedDataLocateFindNoOpRequest(String id, ExtendedDataLocateObjectDataList noOpIn) {
    super(id, "ExtendedDataLocateFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ExtendedDataLocateObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExtendedDataLocate", noOpIn);
      }
      addInput("ExtendedDataLocate", mapList);
    }
  }
/**
 *
 * Retrieves the ExtendedDataLocateObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ExtendedDataLocateObjectDataList getOutput() {
    return ExtendedDataLocateObjectHelper.fromMapList(outputMap, "ExtendedDataLocateList");
  }
}
