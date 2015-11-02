/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxTypeCommRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all TaxTypeComm related UdtRequests
 *
 */

public abstract class TaxTypeCommRequest extends UdtRequest {

/**
 *
 * Constructor for TaxTypeCommRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public TaxTypeCommRequest(String id, String method) {
    super(id, "TaxTypeComm", method);
  }
}
