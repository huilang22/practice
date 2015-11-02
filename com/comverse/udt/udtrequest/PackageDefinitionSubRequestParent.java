/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionSubRequestParent.java
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
 * Abstract base class for all PackageDefinition related UdtSubRequestParents
 *
 */
public abstract class PackageDefinitionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on PackageDefinitionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PackageDefinitionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PackageDefinitionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PackageDefinitionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for PackageDefinitionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PackageDefinitionSubRequestParent(String id, String method) {
    super(id, "PackageDefinition", method);
  }
}
