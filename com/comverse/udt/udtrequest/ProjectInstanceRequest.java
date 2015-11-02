/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectInstanceRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ProjectInstance related UdtRequests
 *
 */

public abstract class ProjectInstanceRequest extends UdtRequest {

/**
 *
 * Constructor for ProjectInstanceRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ProjectInstanceRequest(String id, String method) {
    super(id, "ProjectInstance", method);
  }
}
