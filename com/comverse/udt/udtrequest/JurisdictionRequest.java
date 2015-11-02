/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JurisdictionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Jurisdiction related UdtRequests
 *
 */

public abstract class JurisdictionRequest extends UdtRequest {

/**
 *
 * Constructor for JurisdictionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public JurisdictionRequest(String id, String method) {
    super(id, "Jurisdiction", method);
  }
}
