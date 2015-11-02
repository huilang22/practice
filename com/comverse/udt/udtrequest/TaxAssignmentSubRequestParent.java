/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxAssignmentSubRequestParent.java
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
 * Abstract base class for all TaxAssignment related UdtSubRequestParents
 *
 */
public abstract class TaxAssignmentSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on TaxAssignmentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TaxAssignmentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on TaxAssignmentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TaxAssignmentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for TaxAssignmentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public TaxAssignmentSubRequestParent(String id, String method) {
    super(id, "TaxAssignment", method);
  }
}
