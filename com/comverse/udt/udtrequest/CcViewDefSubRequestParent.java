/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewDefSubRequestParent.java
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
 * Abstract base class for all CcViewDef related UdtSubRequestParents
 *
 */
public abstract class CcViewDefSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CcViewDefRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CcViewDefRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CcViewDefSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CcViewDefSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CcViewDefSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CcViewDefSubRequestParent(String id, String method) {
    super(id, "CcViewDef", method);
  }
}
