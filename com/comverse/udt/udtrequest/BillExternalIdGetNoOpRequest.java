/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillExternalIdGetNoOpRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.si.data.*;

/**
 *
 * NoOp class used to simulate a BillExternalIdGetNoOpRequest Udt Request/Response
 *
 */
public class BillExternalIdGetNoOpRequest extends BillExternalIdSubRequestParent {
/**
 *
 * Constructor to create a   BillExternalIdGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillExternalIdGetNoOpRequest(String id, BillExternalIdObjectData noOpIn) {
    super(id, "BillExternalIdGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BillExternalId", BillExternalIdObjectHelper.toMap(noOpIn, new HashMap(), "BillExternalId").get("BillExternalId"));
    }
  }
/**
 *
 * Retrieves the BillExternalIdObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BillExternalIdObjectData getOutput() {
    return BillExternalIdObjectHelper.fromMap(outputMap, "BillExternalId");
  }
}
