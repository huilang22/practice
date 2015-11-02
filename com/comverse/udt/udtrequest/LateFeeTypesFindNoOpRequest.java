/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeTypesFindNoOpRequest.java
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
 * NoOp class used to simulate a LateFeeTypesFindNoOpRequest Udt Request/Response
 *
 */
public class LateFeeTypesFindNoOpRequest extends LateFeeTypesRequest {
/**
 *
 * Constructor to create a   LateFeeTypesFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LateFeeTypesFindNoOpRequest(String id, LFTObjectDataList noOpIn) {
    super(id, "LateFeeTypesFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = LFTObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("LateFeeTypes", noOpIn);
      }
      addInput("LateFeeTypes", mapList);
    }
  }
/**
 *
 * Retrieves the LFTObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public LFTObjectDataList getOutput() {
    return LFTObjectHelper.fromMapList(outputMap, "LateFeeTypesList");
  }
}
