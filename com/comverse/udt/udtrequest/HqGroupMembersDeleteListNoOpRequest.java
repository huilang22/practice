/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupMembersDeleteListNoOpRequest.java
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
 * NoOp class used to simulate a HqGroupMembersDeleteListNoOpRequest Udt Request/Response
 *
 */
public class HqGroupMembersDeleteListNoOpRequest extends HqGroupMembersRequest {
/**
 *
 * Constructor to create a   HqGroupMembersDeleteListNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqGroupMembersDeleteListNoOpRequest(String id, HqGroupMembersObjectDataList noOpIn) {
    super(id, "HqGroupMembersDeleteListNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = HqGroupMembersObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HqGroupMembers", noOpIn);
      }
      addInput("HqGroupMembers", mapList);
    }
  }
/**
 *
 * Retrieves the HqGroupMembersObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupMembersObjectDataList getOutput() {
    return HqGroupMembersObjectHelper.fromMapList(outputMap, "HqGroupMembersList");
  }
}
