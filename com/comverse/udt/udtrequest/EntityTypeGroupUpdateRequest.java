/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupUpdateRequest.java
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
 * Class used to create a EntityTypeGroupUpdateRequest Udt Request
 *
 */

public class EntityTypeGroupUpdateRequest extends EntityTypeGroupSubRequestParent {
/**
 *
 * Constructor to create a  EntityTypeGroupUpdateRequest
 * @param id Unique request name
 * @param EntityTypeGRPUpdateIn EntityTypeGroupObjectData for EntityTypeGroupUpdateRequest
 *
 */
@JsonCreator
  public EntityTypeGroupUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EntityTypeGroup")EntityTypeGroupObjectData EntityTypeGRPUpdateIn) {
    super(id, "EntityTypeGroupUpdate");
    if (EntityTypeGRPUpdateIn != null) {
      addInput("EntityTypeGroup", EntityTypeGroupObjectHelper.toMap(EntityTypeGRPUpdateIn, new HashMap(), "EntityTypeGroup").get("EntityTypeGroup"));
    }
  }

/**
 *
 * Retrieves the EntityTypeGroupObjectData that results from the EntityTypeGroupUpdateRequest call
 * @return EntityTypeGroupObjectData resulting from udt call
 *
 */

  public EntityTypeGroupObjectData getOutput() {
    return EntityTypeGroupObjectHelper.fromMap(outputMap, "EntityTypeGroup");
  }
}
