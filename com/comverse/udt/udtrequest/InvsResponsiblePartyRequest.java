/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsResponsiblePartyRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsResponsibleParty related UdtRequests
 *
 */

public abstract class InvsResponsiblePartyRequest extends UdtRequest {

/**
 *
 * Constructor for InvsResponsiblePartyRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsResponsiblePartyRequest(String id, String method) {
    super(id, "InvsResponsibleParty", method);
  }
}
