/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all NrcTransDescr related UdtRequests
 *
 */

public abstract class NrcTransDescrRequest extends UdtRequest {

/**
 *
 * Constructor for NrcTransDescrRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public NrcTransDescrRequest(String id, String method) {
    super(id, "NrcTransDescr", method);
  }
}
