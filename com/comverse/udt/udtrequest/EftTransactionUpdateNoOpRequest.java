/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftTransactionUpdateNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a EftTransactionUpdateNoOpRequest Udt Request/Response
 *
 */
public class EftTransactionUpdateNoOpRequest extends EftTransactionSubRequestParent {
/**
 *
 * Constructor to create a   EftTransactionUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EftTransactionUpdateNoOpRequest(String id, EftTransactionObjectData noOpIn) {
    super(id, "EftTransactionUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("EftTransaction", EftTransactionObjectHelper.toMap(noOpIn, new HashMap(), "EftTransaction").get("EftTransaction"));
    }
  }
/**
 *
 * Retrieves the EftTransactionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public EftTransactionObjectData getOutput() {
    return EftTransactionObjectHelper.fromMap(outputMap, "EftTransaction");
  }
}
