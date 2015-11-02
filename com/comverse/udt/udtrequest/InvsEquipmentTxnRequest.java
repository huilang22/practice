/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsEquipmentTxn related UdtRequests
 *
 */

public abstract class InvsEquipmentTxnRequest extends UdtRequest {

/**
 *
 * Constructor for InvsEquipmentTxnRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsEquipmentTxnRequest(String id, String method) {
    super(id, "InvsEquipmentTxn", method);
  }
}
