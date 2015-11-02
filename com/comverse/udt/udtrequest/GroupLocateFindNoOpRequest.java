/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupLocateFindNoOpRequest.java
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
 * NoOp class used to simulate a GroupLocateFindNoOpRequest Udt Request/Response
 *
 */
public class GroupLocateFindNoOpRequest extends GroupLocateRequest {
/**
 *
 * Constructor to create a   GroupLocateFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GroupLocateFindNoOpRequest(String id, GroupLocateObjectDataList noOpIn) {
    super(id, "GroupLocateFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GroupLocateObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GroupLocate", noOpIn);
      }
      addInput("GroupLocate", mapList);
    }
  }
/**
 *
 * Retrieves the GroupLocateObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GroupLocateObjectDataList getOutput() {
    return GroupLocateObjectHelper.fromMapList(outputMap, "GroupLocateList");
  }
}
