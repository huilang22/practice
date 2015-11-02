/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewDefRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CcViewDef related UdtRequests
 *
 */

public abstract class CcViewDefRequest extends UdtRequest {

/**
 *
 * Constructor for CcViewDefRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CcViewDefRequest(String id, String method) {
    super(id, "CcViewDef", method);
  }
}
