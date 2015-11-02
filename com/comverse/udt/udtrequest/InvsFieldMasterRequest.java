/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsFieldMasterRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsFieldMaster related UdtRequests
 *
 */

public abstract class InvsFieldMasterRequest extends UdtRequest {

/**
 *
 * Constructor for InvsFieldMasterRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsFieldMasterRequest(String id, String method) {
    super(id, "InvsFieldMaster", method);
  }
}
