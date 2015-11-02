/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxAbandonedSubRequestParent.java
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
 * Abstract base class for all TaxAbandoned related UdtSubRequestParents
 *
 */
public abstract class TaxAbandonedSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on TaxAbandonedRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TaxAbandonedRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on TaxAbandonedSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TaxAbandonedSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for TaxAbandonedSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public TaxAbandonedSubRequestParent(String id, String method) {
    super(id, "TaxAbandoned", method);
  }
}
