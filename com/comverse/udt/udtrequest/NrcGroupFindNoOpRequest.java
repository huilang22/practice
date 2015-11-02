/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcGroupFindNoOpRequest.java
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
 * NoOp class used to simulate a NrcGroupFindNoOpRequest Udt Request/Response
 *
 */
public class NrcGroupFindNoOpRequest extends NrcGroupRequest {
/**
 *
 * Constructor to create a   NrcGroupFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NrcGroupFindNoOpRequest(String id, NrcGroupObjectDataList noOpIn) {
    super(id, "NrcGroupFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = NrcGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NrcGroup", noOpIn);
      }
      addInput("NrcGroup", mapList);
    }
  }
/**
 *
 * Retrieves the NrcGroupObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public NrcGroupObjectDataList getOutput() {
    return NrcGroupObjectHelper.fromMapList(outputMap, "NrcGroupList");
  }
}
