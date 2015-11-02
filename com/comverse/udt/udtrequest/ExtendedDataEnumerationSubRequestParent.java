/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataEnumerationSubRequestParent.java
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
 * Abstract base class for all ExtendedDataEnumeration related UdtSubRequestParents
 *
 */
public abstract class ExtendedDataEnumerationSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ExtendedDataEnumerationRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExtendedDataEnumerationRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ExtendedDataEnumerationSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExtendedDataEnumerationSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ExtendedDataEnumerationSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ExtendedDataEnumerationSubRequestParent(String id, String method) {
    super(id, "ExtendedDataEnumeration", method);
  }
}
