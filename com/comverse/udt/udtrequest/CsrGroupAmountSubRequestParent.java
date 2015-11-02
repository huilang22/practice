/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupAmountSubRequestParent.java
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
 * Abstract base class for all CsrGroupAmount related UdtSubRequestParents
 *
 */
public abstract class CsrGroupAmountSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CsrGroupAmountRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CsrGroupAmountRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CsrGroupAmountSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CsrGroupAmountSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CsrGroupAmountSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CsrGroupAmountSubRequestParent(String id, String method) {
    super(id, "CsrGroupAmount", method);
  }
}
