/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataAssociationRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ExtendedDataAssociation related UdtRequests
 *
 */

public abstract class ExtendedDataAssociationRequest extends UdtRequest {

/**
 *
 * Constructor for ExtendedDataAssociationRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ExtendedDataAssociationRequest(String id, String method) {
    super(id, "ExtendedDataAssociation", method);
  }
}
