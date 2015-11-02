/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxStatusSubRequestParent.java
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
 * Abstract base class for all TaxStatus related UdtSubRequestParents
 *
 */
public abstract class TaxStatusSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on TaxStatusRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TaxStatusRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on TaxStatusSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TaxStatusSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for TaxStatusSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public TaxStatusSubRequestParent(String id, String method) {
    super(id, "TaxStatus", method);
  }
}
