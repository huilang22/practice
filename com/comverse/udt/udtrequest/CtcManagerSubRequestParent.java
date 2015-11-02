/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcManagerSubRequestParent.java
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
 * Abstract base class for all CtcManager related UdtSubRequestParents
 *
 */
public abstract class CtcManagerSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcManagerRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcManagerRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcManagerSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcManagerSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcManagerSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcManagerSubRequestParent(String id, String method) {
    super(id, "CtcManager", method);
  }
}
