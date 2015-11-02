/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAttributesDefRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CcAttributesDef related UdtRequests
 *
 */

public abstract class CcAttributesDefRequest extends UdtRequest {

/**
 *
 * Constructor for CcAttributesDefRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CcAttributesDefRequest(String id, String method) {
    super(id, "CcAttributesDef", method);
  }
}
