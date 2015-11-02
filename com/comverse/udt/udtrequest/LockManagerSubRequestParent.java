/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LockManagerSubRequestParent.java
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
 * Abstract base class for all LockManager related UdtSubRequestParents
 *
 */
public abstract class LockManagerSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on LockManagerRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LockManagerRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on LockManagerSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LockManagerSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for LockManagerSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public LockManagerSubRequestParent(String id, String method) {
    super(id, "LockManager", method);
  }
}
