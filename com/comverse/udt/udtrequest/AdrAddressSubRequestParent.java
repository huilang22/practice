/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressSubRequestParent.java
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
 * Abstract base class for all AdrAddress related UdtSubRequestParents
 *
 */
public abstract class AdrAddressSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AdrAddressRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AdrAddressRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AdrAddressSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AdrAddressSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AdrAddressSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AdrAddressSubRequestParent(String id, String method) {
    super(id, "AdrAddress", method);
  }
}
