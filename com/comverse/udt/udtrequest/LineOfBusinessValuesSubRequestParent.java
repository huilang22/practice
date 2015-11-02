/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LineOfBusinessValuesSubRequestParent.java
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
 * Abstract base class for all LineOfBusinessValues related UdtSubRequestParents
 *
 */
public abstract class LineOfBusinessValuesSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on LineOfBusinessValuesRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LineOfBusinessValuesRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on LineOfBusinessValuesSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LineOfBusinessValuesSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for LineOfBusinessValuesSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public LineOfBusinessValuesSubRequestParent(String id, String method) {
    super(id, "LineOfBusinessValues", method);
  }
}
