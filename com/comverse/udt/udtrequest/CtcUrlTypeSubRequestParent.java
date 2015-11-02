/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcUrlTypeSubRequestParent.java
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
 * Abstract base class for all CtcUrlType related UdtSubRequestParents
 *
 */
public abstract class CtcUrlTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcUrlTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcUrlTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcUrlTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcUrlTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcUrlTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcUrlTypeSubRequestParent(String id, String method) {
    super(id, "CtcUrlType", method);
  }
}
