/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdLocaleDeleteNoOpRequest.java
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

import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdLocaleDeleteNoOpRequest Udt Request/Response
 *
 */
public class BsdLocaleDeleteNoOpRequest extends BsdLocaleSubRequestParent {
/**
 *
 * Constructor to create a   BsdLocaleDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdLocaleDeleteNoOpRequest(String id, BsdLocaleObjectData noOpIn) {
    super(id, "BsdLocaleDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdLocale", BsdLocaleObjectHelper.toMap(noOpIn, new HashMap(), "BsdLocale").get("BsdLocale"));
    }
  }
/**
 *
 * Retrieves the BsdLocaleObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdLocaleObjectData getOutput() {
    return BsdLocaleObjectHelper.fromMap(outputMap, "BsdLocale");
  }
}
