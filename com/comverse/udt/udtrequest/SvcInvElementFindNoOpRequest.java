/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcInvElementFindNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a SvcInvElementFindNoOpRequest Udt Request/Response
 *
 */
public class SvcInvElementFindNoOpRequest extends SvcInventoryRequest {
/**
 *
 * Constructor to create a   SvcInvElementFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SvcInvElementFindNoOpRequest(String id, SvcInvElementObjectDataList noOpIn) {
    super(id, "SvcInvElementFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = SvcInvElementObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SvcInventory", noOpIn);
      }
      addInput("SvcInventory", mapList);
    }
  }
/**
 *
 * Retrieves the SvcInvElementObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public SvcInvElementObjectDataList getOutput() {
    return SvcInvElementObjectHelper.fromMapList(outputMap, "SvcInventoryList");
  }
}
