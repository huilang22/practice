/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentMapSubRequestParent.java
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
 * Abstract base class for all AccountSegmentMap related UdtSubRequestParents
 *
 */
public abstract class AccountSegmentMapSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AccountSegmentMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountSegmentMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AccountSegmentMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountSegmentMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AccountSegmentMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AccountSegmentMapSubRequestParent(String id, String method) {
    super(id, "AccountSegmentMap", method);
  }
}
