/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all EntityTypeGroup related UdtRequests
 *
 */

public abstract class EntityTypeGroupRequest extends UdtRequest {

/**
 *
 * Constructor for EntityTypeGroupRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public EntityTypeGroupRequest(String id, String method) {
    super(id, "EntityTypeGroup", method);
  }
}
