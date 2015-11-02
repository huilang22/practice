/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VipCodeSubRequestParent.java
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
 * Abstract base class for all VipCode related UdtSubRequestParents
 *
 */
public abstract class VipCodeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on VipCodeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(VipCodeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on VipCodeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(VipCodeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for VipCodeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public VipCodeSubRequestParent(String id, String method) {
    super(id, "VipCode", method);
  }
}
