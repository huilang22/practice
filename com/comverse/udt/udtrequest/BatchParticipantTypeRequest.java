/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchParticipantTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BatchParticipantType related UdtRequests
 *
 */

public abstract class BatchParticipantTypeRequest extends UdtRequest {

/**
 *
 * Constructor for BatchParticipantTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BatchParticipantTypeRequest(String id, String method) {
    super(id, "BatchParticipantType", method);
  }
}
