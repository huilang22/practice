/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupMemberGetNoOpRequest.java
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
 * NoOp class used to simulate a GroupMemberGetNoOpRequest Udt Request/Response
 *
 */
public class GroupMemberGetNoOpRequest extends GroupMemberSubRequestParent {
/**
 *
 * Constructor to create a   GroupMemberGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GroupMemberGetNoOpRequest(String id, GroupMemberObjectData noOpIn) {
    super(id, "GroupMemberGetNoOpRequest");
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
