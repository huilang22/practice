/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjTransGroupGetRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AdjTransGroupGetRequest Udt Request
 *
 */

public class AdjTransGroupGetRequest extends AdjTransGroupSubRequestParent {
/**
 *
 * Constructor to create a  AdjTransGroupGetRequest
 * @param id Unique request name
 * @param ADGGetIn ATGObjectKeyData for AdjTransGroupGetRequest
 *
 */
@JsonCreator
  public AdjTransGroupGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdjTransGroup")ATGObjectKeyData ADGGetIn) {
    super(id, "AdjTransGroupGet");
    if (ADGGetIn != null) {
      addInput("AdjTransGroup", ATGObjectKeyHelper.toMap(ADGGetIn, new HashMap(), "ATGObjectKeyData").get("ATGObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ATGObjectData that results from the AdjTransGroupGetRequest call
 * @return ATGObjectData resulting from udt call
 *
 */

  public ATGObjectData getOutput() {
    return ATGObjectHelper.fromMap(outputMap, "AdjTransGroup");
  }
}
