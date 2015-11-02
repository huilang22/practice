/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTypeGroupFindNoOpRequest.java
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
 * NoOp class used to simulate a NrcTypeGroupFindNoOpRequest Udt Request/Response
 *
 */
public class NrcTypeGroupFindNoOpRequest extends NrcTypeGroupRequest {
/**
 *
 * Constructor to create a   NrcTypeGroupFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NrcTypeGroupFindNoOpRequest(String id, NrcTypeGroupObjectDataList noOpIn) {
    super(id, "NrcTypeGroupFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = NrcTypeGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NrcTypeGroup", noOpIn);
      }
      addInput("NrcTypeGroup", mapList);
    }
  }
/**
 *
 * Retrieves the NrcTypeGroupObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public NrcTypeGroupObjectDataList getOutput() {
    return NrcTypeGroupObjectHelper.fromMapList(outputMap, "NrcTypeGroupList");
  }
}
