/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DocumentTypeRefSubRequestParent.java
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
 * Abstract base class for all DocumentTypeRef related UdtSubRequestParents
 *
 */
public abstract class DocumentTypeRefSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on DocumentTypeRefRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DocumentTypeRefRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on DocumentTypeRefSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DocumentTypeRefSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for DocumentTypeRefSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public DocumentTypeRefSubRequestParent(String id, String method) {
    super(id, "DocumentTypeRef", method);
  }
}
