/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageJurisdictionSubRequestParent.java
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
 * Abstract base class for all UsageJurisdiction related UdtSubRequestParents
 *
 */
public abstract class UsageJurisdictionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on UsageJurisdictionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsageJurisdictionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on UsageJurisdictionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsageJurisdictionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for UsageJurisdictionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public UsageJurisdictionSubRequestParent(String id, String method) {
    super(id, "UsageJurisdiction", method);
  }
}
