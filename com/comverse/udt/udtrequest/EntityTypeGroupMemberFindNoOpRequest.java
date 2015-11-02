/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupMemberFindNoOpRequest.java
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
 * NoOp class used to simulate a EntityTypeGroupMemberFindNoOpRequest Udt Request/Response
 *
 */
public class EntityTypeGroupMemberFindNoOpRequest extends EntityTypeGroupMemberRequest {
/**
 *
 * Constructor to create a   EntityTypeGroupMemberFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EntityTypeGroupMemberFindNoOpRequest(String id, EntityTypeGroupMemberObjectDataList noOpIn) {
    super(id, "EntityTypeGroupMemberFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = EntityTypeGroupMemberObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EntityTypeGroupMember", noOpIn);
      }
      addInput("EntityTypeGroupMember", mapList);
    }
  }
/**
 *
 * Retrieves the EntityTypeGroupMemberObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public EntityTypeGroupMemberObjectDataList getOutput() {
    return EntityTypeGroupMemberObjectHelper.fromMapList(outputMap, "EntityTypeGroupMemberList");
  }
}
