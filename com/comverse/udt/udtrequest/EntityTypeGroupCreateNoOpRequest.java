/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupCreateNoOpRequest.java
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
 * NoOp class used to simulate a EntityTypeGroupCreateNoOpRequest Udt Request/Response
 *
 */
public class EntityTypeGroupCreateNoOpRequest extends EntityTypeGroupSubRequestParent {
/**
 *
 * Constructor to create a   EntityTypeGroupCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EntityTypeGroupCreateNoOpRequest(String id, EntityTypeGroupObjectData noOpIn) {
    super(id, "EntityTypeGroupCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("EntityTypeGroup", EntityTypeGroupObjectHelper.toMap(noOpIn, new HashMap(), "EntityTypeGroup").get("EntityTypeGroup"));
    }
  }
/**
 *
 * Retrieves the EntityTypeGroupObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public EntityTypeGroupObjectData getOutput() {
    return EntityTypeGroupObjectHelper.fromMap(outputMap, "EntityTypeGroup");
  }
}
