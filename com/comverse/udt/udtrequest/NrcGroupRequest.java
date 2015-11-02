/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcGroupRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all NrcGroup related UdtRequests
 *
 */

public abstract class NrcGroupRequest extends UdtRequest {

/**
 *
 * Constructor for NrcGroupRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public NrcGroupRequest(String id, String method) {
    super(id, "NrcGroup", method);
  }
}
