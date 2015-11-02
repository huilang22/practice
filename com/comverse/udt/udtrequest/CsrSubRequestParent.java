/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrSubRequestParent.java
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
 * Abstract base class for all Csr related UdtSubRequestParents
 *
 */
public abstract class CsrSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CsrRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CsrRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CsrSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CsrSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CsrSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CsrSubRequestParent(String id, String method) {
    super(id, "Csr", method);
  }
}
