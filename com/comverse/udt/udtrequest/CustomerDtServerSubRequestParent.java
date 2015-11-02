/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDtServerSubRequestParent.java
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
 * Abstract base class for all CustomerDtServer related UdtSubRequestParents
 *
 */
public abstract class CustomerDtServerSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CustomerDtServerRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CustomerDtServerRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CustomerDtServerSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CustomerDtServerSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CustomerDtServerSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CustomerDtServerSubRequestParent(String id, String method) {
    super(id, "CustomerDtServer", method);
  }
}
