/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrXmlRuleSubRequestParent.java
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
 * Abstract base class for all RbrXmlRule related UdtSubRequestParents
 *
 */
public abstract class RbrXmlRuleSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RbrXmlRuleRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RbrXmlRuleRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RbrXmlRuleSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RbrXmlRuleSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RbrXmlRuleSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RbrXmlRuleSubRequestParent(String id, String method) {
    super(id, "RbrXmlRule", method);
  }
}
