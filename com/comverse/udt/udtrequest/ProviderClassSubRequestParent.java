/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProviderClassSubRequestParent.java
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
 * Abstract base class for all ProviderClass related UdtSubRequestParents
 *
 */
public abstract class ProviderClassSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ProviderClassRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProviderClassRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ProviderClassSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProviderClassSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ProviderClassSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ProviderClassSubRequestParent(String id, String method) {
    super(id, "ProviderClass", method);
  }
}
