/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDocumentSubRequestParent.java
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
 * Abstract base class for all CustomerDocument related UdtSubRequestParents
 *
 */
public abstract class CustomerDocumentSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CustomerDocumentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CustomerDocumentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CustomerDocumentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CustomerDocumentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CustomerDocumentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CustomerDocumentSubRequestParent(String id, String method) {
    super(id, "CustomerDocument", method);
  }
}
