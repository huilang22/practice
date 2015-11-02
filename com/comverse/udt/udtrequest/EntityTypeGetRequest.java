/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGetRequest.java
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
 * Class used to create a EntityTypeGetRequest Udt Request
 *
 */

public class EntityTypeGetRequest extends EntityTypeSubRequestParent {
/**
 *
 * Constructor to create a  EntityTypeGetRequest
 * @param id Unique request name
 * @param EntityTypeGetIn EntityTypeObjectKeyData for EntityTypeGetRequest
 *
 */
@JsonCreator
  public EntityTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("EntityType")EntityTypeObjectKeyData EntityTypeGetIn) {
    super(id, "EntityTypeGet");
    if (EntityTypeGetIn != null) {
      addInput("EntityType", EntityTypeObjectKeyHelper.toMap(EntityTypeGetIn, new HashMap(), "EntityTypeObjectKeyData").get("EntityTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EntityTypeObjectData that results from the EntityTypeGetRequest call
 * @return EntityTypeObjectData resulting from udt call
 *
 */

  public EntityTypeObjectData getOutput() {
    return EntityTypeObjectHelper.fromMap(outputMap, "EntityType");
  }
}
