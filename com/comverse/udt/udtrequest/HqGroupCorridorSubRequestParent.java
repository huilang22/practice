/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupCorridorSubRequestParent.java
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
 * Abstract base class for all HqGroupCorridor related UdtSubRequestParents
 *
 */
public abstract class HqGroupCorridorSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on HqGroupCorridorRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(HqGroupCorridorRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on HqGroupCorridorSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(HqGroupCorridorSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for HqGroupCorridorSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public HqGroupCorridorSubRequestParent(String id, String method) {
    super(id, "HqGroupCorridor", method);
  }
}
