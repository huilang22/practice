/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrDefinitionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all UnitCrDefinition related UdtRequests
 *
 */

public abstract class UnitCrDefinitionRequest extends UdtRequest {

/**
 *
 * Constructor for UnitCrDefinitionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public UnitCrDefinitionRequest(String id, String method) {
    super(id, "UnitCrDefinition", method);
  }
}
