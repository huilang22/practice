/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrSubRequestParent.java
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
 * Abstract base class for all NrcTransDescr related UdtSubRequestParents
 *
 */
public abstract class NrcTransDescrSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on NrcTransDescrRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(NrcTransDescrRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on NrcTransDescrSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(NrcTransDescrSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for NrcTransDescrSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public NrcTransDescrSubRequestParent(String id, String method) {
    super(id, "NrcTransDescr", method);
  }
}
