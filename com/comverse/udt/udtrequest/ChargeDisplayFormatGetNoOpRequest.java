/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDisplayFormatGetNoOpRequest.java
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
 * NoOp class used to simulate a ChargeDisplayFormatGetNoOpRequest Udt Request/Response
 *
 */
public class ChargeDisplayFormatGetNoOpRequest extends ChargeDisplayFormatSubRequestParent {
/**
 *
 * Constructor to create a   ChargeDisplayFormatGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ChargeDisplayFormatGetNoOpRequest(String id, ChargeDisplayFormatObjectData noOpIn) {
    super(id, "ChargeDisplayFormatGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ChargeDisplayFormat", ChargeDisplayFormatObjectHelper.toMap(noOpIn, new HashMap(), "ChargeDisplayFormat").get("ChargeDisplayFormat"));
    }
  }
/**
 *
 * Retrieves the ChargeDisplayFormatObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ChargeDisplayFormatObjectData getOutput() {
    return ChargeDisplayFormatObjectHelper.fromMap(outputMap, "ChargeDisplayFormat");
  }
}
