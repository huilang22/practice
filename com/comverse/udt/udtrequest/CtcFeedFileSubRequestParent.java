/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFeedFileSubRequestParent.java
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
 * Abstract base class for all CtcFeedFile related UdtSubRequestParents
 *
 */
public abstract class CtcFeedFileSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcFeedFileRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcFeedFileRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcFeedFileSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcFeedFileSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcFeedFileSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcFeedFileSubRequestParent(String id, String method) {
    super(id, "CtcFeedFile", method);
  }
}
