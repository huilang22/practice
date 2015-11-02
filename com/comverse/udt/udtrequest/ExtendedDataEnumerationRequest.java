/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataEnumerationRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ExtendedDataEnumeration related UdtRequests
 *
 */

public abstract class ExtendedDataEnumerationRequest extends UdtRequest {

/**
 *
 * Constructor for ExtendedDataEnumerationRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ExtendedDataEnumerationRequest(String id, String method) {
    super(id, "ExtendedDataEnumeration", method);
  }
}
