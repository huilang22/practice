/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupFindNoOpRequest.java
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
 * NoOp class used to simulate a GroupFindNoOpRequest Udt Request/Response
 *
 */
public class GroupFindNoOpRequest extends GroupRequest {
/**
 *
 * Constructor to create a   GroupFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GroupFindNoOpRequest(String id, GroupObjectDataList noOpIn) {
    super(id, "GroupFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Group", noOpIn);
      }
      addInput("Group", mapList);
    }
  }
/**
 *
 * Retrieves the GroupObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GroupObjectDataList getOutput() {
    return GroupObjectHelper.fromMapList(outputMap, "GroupList");
  }
}
