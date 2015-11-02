/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdWorkpointAssocRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvdWorkpointAssoc related UdtRequests
 *
 */

public abstract class InvdWorkpointAssocRequest extends UdtRequest {

/**
 *
 * Constructor for InvdWorkpointAssocRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvdWorkpointAssocRequest(String id, String method) {
    super(id, "InvdWorkpointAssoc", method);
  }
}
