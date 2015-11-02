/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDefinitionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ComponentDefinition related UdtRequests
 *
 */

public abstract class ComponentDefinitionRequest extends UdtRequest {

/**
 *
 * Constructor for ComponentDefinitionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ComponentDefinitionRequest(String id, String method) {
    super(id, "ComponentDefinition", method);
  }
}
