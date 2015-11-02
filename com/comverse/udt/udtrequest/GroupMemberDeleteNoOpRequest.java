/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupMemberDeleteNoOpRequest.java
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
 * NoOp class used to simulate a GroupMemberDeleteNoOpRequest Udt Request/Response
 *
 */
public class GroupMemberDeleteNoOpRequest extends GroupMemberSubRequestParent {
/**
 *
 * Constructor to create a   GroupMemberDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GroupMemberDeleteNoOpRequest(String id, GroupMemberObjectData noOpIn) {
    super(id, "GroupMemberDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("GroupMember", GroupMemberObjectHelper.toMap(noOpIn, new HashMap(), "GroupMember").get("GroupMember"));
    }
  }
/**
 *
 * Retrieves the GroupMemberObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public GroupMemberObjectData getOutput() {
    return GroupMemberObjectHelper.fromMap(outputMap, "GroupMember");
  }
}
