/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateSubRequestParent.java
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
 * Abstract base class for all AccountLocate related UdtSubRequestParents
 *
 */
public abstract class AccountLocateSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AccountLocateRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountLocateRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AccountLocateSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountLocateSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AccountLocateSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AccountLocateSubRequestParent(String id, String method) {
    super(id, "AccountLocate", method);
  }
}
