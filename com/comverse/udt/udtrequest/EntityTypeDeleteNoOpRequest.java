/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeDeleteNoOpRequest.java
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
 * NoOp class used to simulate a EntityTypeDeleteNoOpRequest Udt Request/Response
 *
 */
public class EntityTypeDeleteNoOpRequest extends EntityTypeSubRequestParent {
/**
 *
 * Constructor to create a   EntityTypeDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EntityTypeDeleteNoOpRequest(String id, EntityTypeObjectData noOpIn) {
    super(id, "EntityTypeDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("EntityType", EntityTypeObjectHelper.toMap(noOpIn, new HashMap(), "EntityType").get("EntityType"));
    }
  }
/**
 *
 * Retrieves the EntityTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public EntityTypeObjectData getOutput() {
    return EntityTypeObjectHelper.fromMap(outputMap, "EntityType");
  }
}
