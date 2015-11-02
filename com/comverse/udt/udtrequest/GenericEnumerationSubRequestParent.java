/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenericEnumerationSubRequestParent.java
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
 * Abstract base class for all GenericEnumeration related UdtSubRequestParents
 *
 */
public abstract class GenericEnumerationSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on GenericEnumerationRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GenericEnumerationRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on GenericEnumerationSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GenericEnumerationSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for GenericEnumerationSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public GenericEnumerationSubRequestParent(String id, String method) {
    super(id, "GenericEnumeration", method);
  }
}
