/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVanitySubRequestParent.java
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
 * Abstract base class for all InvsVanity related UdtSubRequestParents
 *
 */
public abstract class InvsVanitySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsVanityRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsVanityRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsVanitySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsVanitySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsVanitySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsVanitySubRequestParent(String id, String method) {
    super(id, "InvsVanity", method);
  }
}
