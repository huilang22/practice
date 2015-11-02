/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyGroupMemberFindNoOpRequest.java
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
 * NoOp class used to simulate a DependencyGroupMemberFindNoOpRequest Udt Request/Response
 *
 */
public class DependencyGroupMemberFindNoOpRequest extends DependencyGroupMemberRequest {
/**
 *
 * Constructor to create a   DependencyGroupMemberFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DependencyGroupMemberFindNoOpRequest(String id, DependencyGroupMemberObjectDataList noOpIn) {
    super(id, "DependencyGroupMemberFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = DependencyGroupMemberObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DependencyGroupMember", noOpIn);
      }
      addInput("DependencyGroupMember", mapList);
    }
  }
/**
 *
 * Retrieves the DependencyGroupMemberObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public DependencyGroupMemberObjectDataList getOutput() {
    return DependencyGroupMemberObjectHelper.fromMapList(outputMap, "DependencyGroupMemberList");
  }
}
