/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionSubRequestParent.java
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
 * Abstract base class for all BatchRequestTemplateDefinition related UdtSubRequestParents
 *
 */
public abstract class BatchRequestTemplateDefinitionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchRequestTemplateDefinitionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchRequestTemplateDefinitionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchRequestTemplateDefinitionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchRequestTemplateDefinitionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchRequestTemplateDefinitionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchRequestTemplateDefinitionSubRequestParent(String id, String method) {
    super(id, "BatchRequestTemplateDefinition", method);
  }
}
