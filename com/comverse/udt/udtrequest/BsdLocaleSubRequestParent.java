/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdLocaleSubRequestParent.java
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
 * Abstract base class for all BsdLocale related UdtSubRequestParents
 *
 */
public abstract class BsdLocaleSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdLocaleRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdLocaleRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdLocaleSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdLocaleSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdLocaleSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdLocaleSubRequestParent(String id, String method) {
    super(id, "BsdLocale", method);
  }
}
