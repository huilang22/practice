/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ArmStatusSubRequestParent.java
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
 * Abstract base class for all ArmStatus related UdtSubRequestParents
 *
 */
public abstract class ArmStatusSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ArmStatusRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ArmStatusRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ArmStatusSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ArmStatusSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ArmStatusSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ArmStatusSubRequestParent(String id, String method) {
    super(id, "ArmStatus", method);
  }
}
