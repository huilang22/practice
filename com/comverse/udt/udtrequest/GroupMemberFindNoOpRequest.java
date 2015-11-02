/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupMemberFindNoOpRequest.java
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
 * NoOp class used to simulate a GroupMemberFindNoOpRequest Udt Request/Response
 *
 */
public class GroupMemberFindNoOpRequest extends GroupMemberRequest {
/**
 *
 * Constructor to create a   GroupMemberFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GroupMemberFindNoOpRequest(String id, GroupMemberObjectDataList noOpIn) {
    super(id, "GroupMemberFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GroupMemberObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GroupMember", noOpIn);
      }
      addInput("GroupMember", mapList);
    }
  }
/**
 *
 * Retrieves the GroupMemberObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GroupMemberObjectDataList getOutput() {
    return GroupMemberObjectHelper.fromMapList(outputMap, "GroupMemberList");
  }
}
