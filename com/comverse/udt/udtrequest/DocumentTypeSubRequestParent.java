/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DocumentTypeSubRequestParent.java
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
 * Abstract base class for all DocumentType related UdtSubRequestParents
 *
 */
public abstract class DocumentTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on DocumentTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DocumentTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on DocumentTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DocumentTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for DocumentTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public DocumentTypeSubRequestParent(String id, String method) {
    super(id, "DocumentType", method);
  }
}
