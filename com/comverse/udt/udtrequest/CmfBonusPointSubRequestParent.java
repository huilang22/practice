/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfBonusPointSubRequestParent.java
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
 * Abstract base class for all CmfBonusPoint related UdtSubRequestParents
 *
 */
public abstract class CmfBonusPointSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CmfBonusPointRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CmfBonusPointRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CmfBonusPointSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CmfBonusPointSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CmfBonusPointSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CmfBonusPointSubRequestParent(String id, String method) {
    super(id, "CmfBonusPoint", method);
  }
}
