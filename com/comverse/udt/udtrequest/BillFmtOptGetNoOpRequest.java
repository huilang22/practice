/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptGetNoOpRequest.java
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
 * NoOp class used to simulate a BillFmtOptGetNoOpRequest Udt Request/Response
 *
 */
public class BillFmtOptGetNoOpRequest extends BillFmtOptSubRequestParent {
/**
 *
 * Constructor to create a   BillFmtOptGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillFmtOptGetNoOpRequest(String id, BllFmtOptObjectData noOpIn) {
    super(id, "BillFmtOptGetNoOpRequest");
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
