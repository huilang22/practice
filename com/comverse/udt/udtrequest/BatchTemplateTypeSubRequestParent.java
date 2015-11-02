/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTemplateTypeSubRequestParent.java
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
 * Abstract base class for all BatchTemplateType related UdtSubRequestParents
 *
 */
public abstract class BatchTemplateTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchTemplateTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchTemplateTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchTemplateTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchTemplateTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchTemplateTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchTemplateTypeSubRequestParent(String id, String method) {
    super(id, "BatchTemplateType", method);
  }
}
