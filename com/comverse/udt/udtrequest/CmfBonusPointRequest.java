/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfBonusPointRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CmfBonusPoint related UdtRequests
 *
 */

public abstract class CmfBonusPointRequest extends UdtRequest {

/**
 *
 * Constructor for CmfBonusPointRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CmfBonusPointRequest(String id, String method) {
    super(id, "CmfBonusPoint", method);
  }
}
