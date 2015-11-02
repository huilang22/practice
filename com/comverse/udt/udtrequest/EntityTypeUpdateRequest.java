/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeUpdateRequest.java
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
 * Class used to create a EntityTypeUpdateRequest Udt Request
 *
 */

public class EntityTypeUpdateRequest extends EntityTypeSubRequestParent {
/**
 *
 * Constructor to create a  EntityTypeUpdateRequest
 * @param id Unique request name
 * @param EntityTypeUpdateIn EntityTypeObjectData for EntityTypeUpdateRequest
 *
 */
@JsonCreator
  public EntityTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EntityType")EntityTypeObjectData EntityTypeUpdateIn) {
    super(id, "EntityTypeUpdate");
    if (EntityTypeUpdateIn != null) {
      addInput("EntityType", EntityTypeObjectHelper.toMap(EntityTypeUpdateIn, new HashMap(), "EntityType").get("EntityType"));
    }
  }

/**
 *
 * Retrieves the EntityTypeObjectData that results from the EntityTypeUpdateRequest call
 * @return EntityTypeObjectData resulting from udt call
 *
 */

  public EntityTypeObjectData getOutput() {
    return EntityTypeObjectHelper.fromMap(outputMap, "EntityType");
  }
}
