/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CollectorSubRequestParent.java
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
 * Abstract base class for all Collector related UdtSubRequestParents
 *
 */
public abstract class CollectorSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CollectorRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CollectorRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CollectorSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CollectorSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CollectorSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CollectorSubRequestParent(String id, String method) {
    super(id, "Collector", method);
  }
}
