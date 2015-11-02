/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrAccountSegmentSubRequestParent.java
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
 * Abstract base class for all CsrAccountSegment related UdtSubRequestParents
 *
 */
public abstract class CsrAccountSegmentSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CsrAccountSegmentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CsrAccountSegmentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CsrAccountSegmentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CsrAccountSegmentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CsrAccountSegmentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CsrAccountSegmentSubRequestParent(String id, String method) {
    super(id, "CsrAccountSegment", method);
  }
}
