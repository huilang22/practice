/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AsyncRequestSubRequestParent.java
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
 * Abstract base class for all AsyncRequest related UdtSubRequestParents
 *
 */
public abstract class AsyncRequestSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AsyncRequestRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AsyncRequestRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AsyncRequestSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AsyncRequestSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AsyncRequestSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AsyncRequestSubRequestParent(String id, String method) {
    super(id, "AsyncRequest", method);
  }
}
