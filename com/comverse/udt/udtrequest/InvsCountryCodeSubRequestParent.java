/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsCountryCodeSubRequestParent.java
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
 * Abstract base class for all InvsCountryCode related UdtSubRequestParents
 *
 */
public abstract class InvsCountryCodeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsCountryCodeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsCountryCodeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsCountryCodeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsCountryCodeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsCountryCodeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsCountryCodeSubRequestParent(String id, String method) {
    super(id, "InvsCountryCode", method);
  }
}
