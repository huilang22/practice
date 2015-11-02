/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSalesChannelRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsSalesChannel related UdtRequests
 *
 */

public abstract class InvsSalesChannelRequest extends UdtRequest {

/**
 *
 * Constructor for InvsSalesChannelRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsSalesChannelRequest(String id, String method) {
    super(id, "InvsSalesChannel", method);
  }
}
