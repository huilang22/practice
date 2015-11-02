/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeCreateRequest.java
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
 * Class used to create a EntityTypeCreateRequest Udt Request
 *
 */

public class EntityTypeCreateRequest extends EntityTypeSubRequestParent {
/**
 *
 * Constructor to create a  EntityTypeCreateRequest
 * @param id Unique request name
 * @param EntityTypeCreateIn EntityTypeObjectData for EntityTypeCreateRequest
 *
 */
@JsonCreator
  public EntityTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EntityType")EntityTypeObjectData EntityTypeCreateIn) {
    super(id, "EntityTypeCreate");
    if (EntityTypeCreateIn != null) {
      addInput("EntityType", EntityTypeObjectHelper.toMap(EntityTypeCreateIn, new HashMap(), "EntityType").get("EntityType"));
    }
  }

/**
 *
 * Retrieves the EntityTypeObjectData that results from the EntityTypeCreateRequest call
 * @return EntityTypeObjectData resulting from udt call
 *
 */

  public EntityTypeObjectData getOutput() {
    return EntityTypeObjectHelper.fromMap(outputMap, "EntityType");
  }
}
