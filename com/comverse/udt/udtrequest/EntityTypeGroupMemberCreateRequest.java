/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupMemberCreateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a EntityTypeGroupMemberCreateRequest Udt Request
 *
 */

public class EntityTypeGroupMemberCreateRequest extends EntityTypeGroupMemberSubRequestParent {
/**
 *
 * Constructor to create a  EntityTypeGroupMemberCreateRequest
 * @param id Unique request name
 * @param entTypeGrpCrIn EntityTypeGroupMemberObjectData for EntityTypeGroupMemberCreateRequest
 *
 */
@JsonCreator
  public EntityTypeGroupMemberCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EntityTypeGroupMember")EntityTypeGroupMemberObjectData entTypeGrpCrIn) {
    super(id, "EntityTypeGroupMemberCreate");
    if (entTypeGrpCrIn != null) {
      addInput("EntityTypeGroupMember", EntityTypeGroupMemberObjectHelper.toMap(entTypeGrpCrIn, new HashMap(), "EntityTypeGroupMember").get("EntityTypeGroupMember"));
    }
  }

/**
 *
 * Retrieves the EntityTypeGroupMemberObjectData that results from the EntityTypeGroupMemberCreateRequest call
 * @return EntityTypeGroupMemberObjectData resulting from udt call
 *
 */

  public EntityTypeGroupMemberObjectData getOutput() {
    return EntityTypeGroupMemberObjectHelper.fromMap(outputMap, "EntityTypeGroupMember");
  }
}
