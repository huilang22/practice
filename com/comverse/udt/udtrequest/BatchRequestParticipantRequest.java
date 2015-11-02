/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BatchRequestParticipant related UdtRequests
 *
 */

public abstract class BatchRequestParticipantRequest extends UdtRequest {

/**
 *
 * Constructor for BatchRequestParticipantRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BatchRequestParticipantRequest(String id, String method) {
    super(id, "BatchRequestParticipant", method);
  }
}
