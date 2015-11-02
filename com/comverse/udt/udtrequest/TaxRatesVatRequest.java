/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxRatesVatRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all TaxRatesVat related UdtRequests
 *
 */

public abstract class TaxRatesVatRequest extends UdtRequest {

/**
 *
 * Constructor for TaxRatesVatRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public TaxRatesVatRequest(String id, String method) {
    super(id, "TaxRatesVat", method);
  }
}
