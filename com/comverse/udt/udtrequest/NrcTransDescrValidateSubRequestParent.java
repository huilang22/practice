/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrValidateSubRequestParent.java
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
 * Abstract base class for all NrcTransDescrValidate related UdtSubRequestParents
 *
 */
public abstract class NrcTransDescrValidateSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on NrcTransDescrValidateRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(NrcTransDescrValidateRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on NrcTransDescrValidateSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(NrcTransDescrValidateSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for NrcTransDescrValidateSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public NrcTransDescrValidateSubRequestParent(String id, String method) {
    super(id, "NrcTransDescrValidate", method);
  }
}
