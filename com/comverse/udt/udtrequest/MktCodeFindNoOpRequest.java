/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MktCodeFindNoOpRequest.java
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
 * NoOp class used to simulate a MktCodeFindNoOpRequest Udt Request/Response
 *
 */
public class MktCodeFindNoOpRequest extends MktCodeRequest {
/**
 *
 * Constructor to create a   MktCodeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MktCodeFindNoOpRequest(String id, MCObjectDataList noOpIn) {
    super(id, "MktCodeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = MCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("MktCode", noOpIn);
      }
      addInput("MktCode", mapList);
    }
  }
/**
 *
 * Retrieves the MCObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public MCObjectDataList getOutput() {
    return MCObjectHelper.fromMapList(outputMap, "MktCodeList");
  }
}
