/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataAssociationSubRequestParent.java
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
 * Abstract base class for all ExtendedDataAssociation related UdtSubRequestParents
 *
 */
public abstract class ExtendedDataAssociationSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ExtendedDataAssociationRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExtendedDataAssociationRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ExtendedDataAssociationSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExtendedDataAssociationSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ExtendedDataAssociationSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ExtendedDataAssociationSubRequestParent(String id, String method) {
    super(id, "ExtendedDataAssociation", method);
  }
}
