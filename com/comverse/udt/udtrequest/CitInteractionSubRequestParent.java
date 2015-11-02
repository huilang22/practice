/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitInteractionSubRequestParent.java
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
 * Abstract base class for all CitInteraction related UdtSubRequestParents
 *
 */
public abstract class CitInteractionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CitInteractionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CitInteractionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CitInteractionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CitInteractionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CitInteractionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CitInteractionSubRequestParent(String id, String method) {
    super(id, "CitInteraction", method);
  }
}
