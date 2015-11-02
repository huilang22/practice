/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepartmentSubRequestParent.java
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
 * Abstract base class for all Department related UdtSubRequestParents
 *
 */
public abstract class DepartmentSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on DepartmentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DepartmentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on DepartmentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DepartmentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for DepartmentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public DepartmentSubRequestParent(String id, String method) {
    super(id, "Department", method);
  }
}
