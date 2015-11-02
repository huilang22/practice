/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ParentCodeFindNoOpRequest.java
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
 * NoOp class used to simulate a ParentCodeFindNoOpRequest Udt Request/Response
 *
 */
public class ParentCodeFindNoOpRequest extends ParentCodeRequest {
/**
 *
 * Constructor to create a   ParentCodeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ParentCodeFindNoOpRequest(String id, ParentCodeObjectDataList noOpIn) {
    super(id, "ParentCodeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ParentCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ParentCode", noOpIn);
      }
      addInput("ParentCode", mapList);
    }
  }
/**
 *
 * Retrieves the ParentCodeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ParentCodeObjectDataList getOutput() {
    return ParentCodeObjectHelper.fromMapList(outputMap, "ParentCodeList");
  }
}
