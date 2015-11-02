/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StoredProcedureSubRequestParent.java
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
 * Abstract base class for all StoredProcedure related UdtSubRequestParents
 *
 */
public abstract class StoredProcedureSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on StoredProcedureRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(StoredProcedureRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on StoredProcedureSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(StoredProcedureSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for StoredProcedureSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public StoredProcedureSubRequestParent(String id, String method) {
    super(id, "StoredProcedure", method);
  }
}
