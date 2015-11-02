/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LanguageCodeSubRequestParent.java
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
 * Abstract base class for all LanguageCode related UdtSubRequestParents
 *
 */
public abstract class LanguageCodeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on LanguageCodeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LanguageCodeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on LanguageCodeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LanguageCodeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for LanguageCodeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public LanguageCodeSubRequestParent(String id, String method) {
    super(id, "LanguageCode", method);
  }
}
