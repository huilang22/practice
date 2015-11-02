/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcComponentSubRequestParent.java
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
 * Abstract base class for all SvcComponent related UdtSubRequestParents
 *
 */
public abstract class SvcComponentSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on SvcComponentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SvcComponentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on SvcComponentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SvcComponentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for SvcComponentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public SvcComponentSubRequestParent(String id, String method) {
    super(id, "SvcComponent", method);
  }
}
