/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupCreateRequest.java
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
 * Class used to create a EntityTypeGroupCreateRequest Udt Request
 *
 */

public class EntityTypeGroupCreateRequest extends EntityTypeGroupSubRequestParent {
/**
 *
 * Constructor to create a  EntityTypeGroupCreateRequest
 * @param id Unique request name
 * @param EntityTypeGRPCreateIn EntityTypeGroupObjectData for EntityTypeGroupCreateRequest
 *
 */
@JsonCreator
  public EntityTypeGroupCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EntityTypeGroup")EntityTypeGroupObjectData EntityTypeGRPCreateIn) {
    super(id, "EntityTypeGroupCreate");
    if (EntityTypeGRPCreateIn != null) {
      addInput("EntityTypeGroup", EntityTypeGroupObjectHelper.toMap(EntityTypeGRPCreateIn, new HashMap(), "EntityTypeGroup").get("EntityTypeGroup"));
    }
  }

/**
 *
 * Retrieves the EntityTypeGroupObjectData that results from the EntityTypeGroupCreateRequest call
 * @return EntityTypeGroupObjectData resulting from udt call
 *
 */

  public EntityTypeGroupObjectData getOutput() {
    return EntityTypeGroupObjectHelper.fromMap(outputMap, "EntityTypeGroup");
  }
}
