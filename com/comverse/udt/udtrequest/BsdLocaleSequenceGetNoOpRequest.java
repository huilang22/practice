/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdLocaleSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdLocaleSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BsdLocaleSequenceGetNoOpRequest extends BsdLocaleSubRequestParent {
/**
 *
 * Constructor to create a   BsdLocaleSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdLocaleSequenceGetNoOpRequest(String id, BsdLocaleObjectKeyData noOpIn) {
    super(id, "BsdLocaleSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdLocale", BsdLocaleObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdLocale").get("BsdLocale"));
    }
  }
/**
 *
 * Retrieves the BsdLocaleObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdLocaleObjectKeyData getOutput() {
    return BsdLocaleObjectKeyHelper.fromMap(outputMap, "BsdLocale");
  }
}
