/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmEnumerationSubRequestParent.java
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
 * Abstract base class for all CtmEnumeration related UdtSubRequestParents
 *
 */
public abstract class CtmEnumerationSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtmEnumerationRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtmEnumerationRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtmEnumerationSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtmEnumerationSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtmEnumerationSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtmEnumerationSubRequestParent(String id, String method) {
    super(id, "CtmEnumeration", method);
  }
}
