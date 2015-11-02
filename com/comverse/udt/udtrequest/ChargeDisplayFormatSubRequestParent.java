/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDisplayFormatSubRequestParent.java
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
 * Abstract base class for all ChargeDisplayFormat related UdtSubRequestParents
 *
 */
public abstract class ChargeDisplayFormatSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ChargeDisplayFormatRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ChargeDisplayFormatRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ChargeDisplayFormatSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ChargeDisplayFormatSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ChargeDisplayFormatSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ChargeDisplayFormatSubRequestParent(String id, String method) {
    super(id, "ChargeDisplayFormat", method);
  }
}
