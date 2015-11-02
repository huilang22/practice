/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsHlrSubRequestParent.java
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
 * Abstract base class for all InvsHlr related UdtSubRequestParents
 *
 */
public abstract class InvsHlrSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsHlrRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsHlrRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsHlrSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsHlrSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsHlrSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsHlrSubRequestParent(String id, String method) {
    super(id, "InvsHlr", method);
  }
}
