/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxTypeCommSubRequestParent.java
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
 * Abstract base class for all TaxTypeComm related UdtSubRequestParents
 *
 */
public abstract class TaxTypeCommSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on TaxTypeCommRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TaxTypeCommRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on TaxTypeCommSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TaxTypeCommSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for TaxTypeCommSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public TaxTypeCommSubRequestParent(String id, String method) {
    super(id, "TaxTypeComm", method);
  }
}
