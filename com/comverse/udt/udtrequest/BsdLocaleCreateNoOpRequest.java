/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdLocaleCreateNoOpRequest.java
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
 * NoOp class used to simulate a BsdLocaleCreateNoOpRequest Udt Request/Response
 *
 */
public class BsdLocaleCreateNoOpRequest extends BsdLocaleSubRequestParent {
/**
 *
 * Constructor to create a   BsdLocaleCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdLocaleCreateNoOpRequest(String id, BsdLocaleObjectData noOpIn) {
    super(id, "BsdLocaleCreateNoOpRequest");
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
