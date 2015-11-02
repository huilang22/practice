/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOrderMethodSubRequestParent.java
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
 * Abstract base class for all CtcOrderMethod related UdtSubRequestParents
 *
 */
public abstract class CtcOrderMethodSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcOrderMethodRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcOrderMethodRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcOrderMethodSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcOrderMethodSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcOrderMethodSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcOrderMethodSubRequestParent(String id, String method) {
    super(id, "CtcOrderMethod", method);
  }
}
