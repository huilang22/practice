/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxRatesVatSubRequestParent.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtSubRequestParent;
import com.csgsystems.udt.SubRequestWrapper;
import com.csgsystems.udt.SubRequestData;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all TaxRatesVat related UdtSubRequestParents
 *
 */
public abstract class TaxRatesVatSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on TaxRatesVatRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TaxRatesVatRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on TaxRatesVatSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TaxRatesVatSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for TaxRatesVatSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public TaxRatesVatSubRequestParent(String id, String method) {
    super(id, "TaxRatesVat", method);
  }
}
