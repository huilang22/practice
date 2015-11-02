/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxPackageInstRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all TaxPackageInst related UdtRequests
 *
 */

public abstract class TaxPackageInstRequest extends UdtRequest {

/**
 *
 * Constructor for TaxPackageInstRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public TaxPackageInstRequest(String id, String method) {
    super(id, "TaxPackageInst", method);
  }
}
