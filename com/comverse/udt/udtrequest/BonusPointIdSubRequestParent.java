/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointIdSubRequestParent.java
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
 * Abstract base class for all BonusPointId related UdtSubRequestParents
 *
 */
public abstract class BonusPointIdSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BonusPointIdRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BonusPointIdRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BonusPointIdSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BonusPointIdSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BonusPointIdSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BonusPointIdSubRequestParent(String id, String method) {
    super(id, "BonusPointId", method);
  }
}
