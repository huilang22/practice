/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupMemberCreateNoOpRequest.java
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
 * NoOp class used to simulate a EntityTypeGroupMemberCreateNoOpRequest Udt Request/Response
 *
 */
public class EntityTypeGroupMemberCreateNoOpRequest extends EntityTypeGroupMemberSubRequestParent {
/**
 *
 * Constructor to create a   EntityTypeGroupMemberCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EntityTypeGroupMemberCreateNoOpRequest(String id, EntityTypeGroupMemberObjectData noOpIn) {
    super(id, "EntityTypeGroupMemberCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("EntityTypeGroupMember", EntityTypeGroupMemberObjectHelper.toMap(noOpIn, new HashMap(), "EntityTypeGroupMember").get("EntityTypeGroupMember"));
    }
  }
/**
 *
 * Retrieves the EntityTypeGroupMemberObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public EntityTypeGroupMemberObjectData getOutput() {
    return EntityTypeGroupMemberObjectHelper.fromMap(outputMap, "EntityTypeGroupMember");
  }
}
