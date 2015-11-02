/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcExtendedDataFindNoOpRequest.java
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
 * NoOp class used to simulate a NrcExtendedDataFindNoOpRequest Udt Request/Response
 *
 */
public class NrcExtendedDataFindNoOpRequest extends NrcRequest {
/**
 *
 * Constructor to create a   NrcExtendedDataFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NrcExtendedDataFindNoOpRequest(String id, NrcEDObjectDataList noOpIn) {
    super(id, "NrcExtendedDataFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = NrcEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NrcExtendedData", noOpIn);
      }
      addInput("NrcExtendedData", mapList);
    }
  }
/**
 *
 * Retrieves the NrcEDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public NrcEDObjectDataList getOutput() {
    return NrcEDObjectHelper.fromMapList(outputMap, "NrcExtendedDataList");
  }
}
