/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjTransGroupDeleteRequest.java
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
 * Class used to create a AdjTransGroupDeleteRequest Udt Request
 *
 */

public class AdjTransGroupDeleteRequest extends AdjTransGroupSubRequestParent {
/**
 *
 * Constructor to create a  AdjTransGroupDeleteRequest
 * @param id Unique request name
 * @param ADGDeleteIn ATGObjectKeyData for AdjTransGroupDeleteRequest
 *
 */
@JsonCreator
  public AdjTransGroupDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdjTransGroup")ATGObjectKeyData ADGDeleteIn) {
    super(id, "AdjTransGroupDelete");
    if (ADGDeleteIn != null) {
      addInput("AdjTransGroup", ATGObjectKeyHelper.toMap(ADGDeleteIn, new HashMap(), "ATGObjectKeyData").get("ATGObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ATGObjectData that results from the AdjTransGroupDeleteRequest call
 * @return ATGObjectData resulting from udt call
 *
 */

  public ATGObjectData getOutput() {
    return ATGObjectHelper.fromMap(outputMap, "AdjTransGroup");
  }
}
