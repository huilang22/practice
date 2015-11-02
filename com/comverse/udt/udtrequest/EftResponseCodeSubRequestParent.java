/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftResponseCodeSubRequestParent.java
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
 * Abstract base class for all EftResponseCode related UdtSubRequestParents
 *
 */
public abstract class EftResponseCodeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on EftResponseCodeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EftResponseCodeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on EftResponseCodeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EftResponseCodeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for EftResponseCodeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public EftResponseCodeSubRequestParent(String id, String method) {
    super(id, "EftResponseCode", method);
  }
}
