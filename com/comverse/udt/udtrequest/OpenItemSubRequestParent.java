/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OpenItemSubRequestParent.java
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
 * Abstract base class for all OpenItem related UdtSubRequestParents
 *
 */
public abstract class OpenItemSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on OpenItemRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OpenItemRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OpenItemSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OpenItemSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for OpenItemSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OpenItemSubRequestParent(String id, String method) {
    super(id, "OpenItem", method);
  }
}
