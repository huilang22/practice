/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvPlaceholderSubRequestParent.java
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
 * Abstract base class for all InvPlaceholder related UdtSubRequestParents
 *
 */
public abstract class InvPlaceholderSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvPlaceholderRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvPlaceholderRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvPlaceholderSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvPlaceholderSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvPlaceholderSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvPlaceholderSubRequestParent(String id, String method) {
    super(id, "InvPlaceholder", method);
  }
}
