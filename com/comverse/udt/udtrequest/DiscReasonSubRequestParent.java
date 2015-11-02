/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscReasonSubRequestParent.java
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
 * Abstract base class for all DiscReason related UdtSubRequestParents
 *
 */
public abstract class DiscReasonSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on DiscReasonRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DiscReasonRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on DiscReasonSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DiscReasonSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for DiscReasonSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public DiscReasonSubRequestParent(String id, String method) {
    super(id, "DiscReason", method);
  }
}
