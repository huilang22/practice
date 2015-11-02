/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MasterAddressSubRequestParent.java
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
 * Abstract base class for all MasterAddress related UdtSubRequestParents
 *
 */
public abstract class MasterAddressSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on MasterAddressRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(MasterAddressRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on MasterAddressSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(MasterAddressSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for MasterAddressSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public MasterAddressSubRequestParent(String id, String method) {
    super(id, "MasterAddress", method);
  }
}
