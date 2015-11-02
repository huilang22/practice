/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptDeleteNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a BillFmtOptDeleteNoOpRequest Udt Request/Response
 *
 */
public class BillFmtOptDeleteNoOpRequest extends BillFmtOptSubRequestParent {
/**
 *
 * Constructor to create a   BillFmtOptDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillFmtOptDeleteNoOpRequest(String id, BllFmtOptObjectData noOpIn) {
    super(id, "BillFmtOptDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("BillFmtOpt", BllFmtOptObjectHelper.toMap(noOpIn, new HashMap(), "BillFmtOpt").get("BillFmtOpt"));
    }
  }
/**
 *
 * Retrieves the BllFmtOptObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BllFmtOptObjectData getOutput() {
    return BllFmtOptObjectHelper.fromMap(outputMap, "BillFmtOpt");
  }
}
