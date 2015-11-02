/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvAccountQdeCheckRequest.java
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
import com.csgsystems.cf.data.*;
import com.csgsystems.ctc.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PpvAccountQdeCheckRequest Udt Request
 *
 */

public class PpvAccountQdeCheckRequest extends PpvSubRequestParent {
/**
 *
 * Constructor to create a  PpvAccountQdeCheckRequest
 * @param id Unique request name
 * @param __AccountIn PpvAccountObjectData for PpvAccountQdeCheckRequest
 *
 */
@JsonCreator
  public PpvAccountQdeCheckRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountIn")PpvAccountObjectData __AccountIn) {
    super(id, "PpvAccountQdeCheck");
    if (__AccountIn != null) {
      addInput("AccountIn", PpvAccountObjectHelper.toMap(__AccountIn, new HashMap(), "AccountOut").get("AccountOut"));
    }
  }

/**
 *
 * Retrieves the PpvAccountObjectData that results from the PpvAccountQdeCheckRequest call
 * @return PpvAccountObjectData resulting from udt call
 *
 */

  public PpvAccountObjectData getOutput() {
    return PpvAccountObjectHelper.fromMap(outputMap, "AccountOut");
  }
}
