/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrivacyLevelSubRequestParent.java
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
 * Abstract base class for all PrivacyLevel related UdtSubRequestParents
 *
 */
public abstract class PrivacyLevelSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on PrivacyLevelRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PrivacyLevelRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PrivacyLevelSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PrivacyLevelSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for PrivacyLevelSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PrivacyLevelSubRequestParent(String id, String method) {
    super(id, "PrivacyLevel", method);
  }
}
