/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ActivityDefSubRequestParent.java
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
 * Abstract base class for all ActivityDef related UdtSubRequestParents
 *
 */
public abstract class ActivityDefSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ActivityDefRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ActivityDefRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ActivityDefSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ActivityDefSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ActivityDefSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ActivityDefSubRequestParent(String id, String method) {
    super(id, "ActivityDef", method);
  }
}
