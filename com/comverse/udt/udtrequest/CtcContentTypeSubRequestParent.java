/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcContentTypeSubRequestParent.java
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
 * Abstract base class for all CtcContentType related UdtSubRequestParents
 *
 */
public abstract class CtcContentTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcContentTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcContentTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcContentTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcContentTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcContentTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcContentTypeSubRequestParent(String id, String method) {
    super(id, "CtcContentType", method);
  }
}
