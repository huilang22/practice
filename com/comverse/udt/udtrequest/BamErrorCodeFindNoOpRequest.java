/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BamErrorCodeFindNoOpRequest.java
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
 * NoOp class used to simulate a BamErrorCodeFindNoOpRequest Udt Request/Response
 *
 */
public class BamErrorCodeFindNoOpRequest extends BamErrorCodeRequest {
/**
 *
 * Constructor to create a   BamErrorCodeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BamErrorCodeFindNoOpRequest(String id, BECObjectDataList noOpIn) {
    super(id, "BamErrorCodeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BECObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BamErrorCode", noOpIn);
      }
      addInput("BamErrorCode", mapList);
    }
  }
/**
 *
 * Retrieves the BECObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BECObjectDataList getOutput() {
    return BECObjectHelper.fromMapList(outputMap, "BamErrorCodeList");
  }
}
