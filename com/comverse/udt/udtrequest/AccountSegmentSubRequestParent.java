/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentSubRequestParent.java
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
 * Abstract base class for all AccountSegment related UdtSubRequestParents
 *
 */
public abstract class AccountSegmentSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AccountSegmentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountSegmentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AccountSegmentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountSegmentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AccountSegmentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AccountSegmentSubRequestParent(String id, String method) {
    super(id, "AccountSegment", method);
  }
}
