/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ArmStatusGetRequest.java
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
 * Class used to create a ArmStatusGetRequest Udt Request
 *
 */

public class ArmStatusGetRequest extends ArmStatusSubRequestParent {
/**
 *
 * Constructor to create a  ArmStatusGetRequest
 * @param id Unique request name
 * @param ASGetIn ASObjectKeyData for ArmStatusGetRequest
 *
 */
@JsonCreator
  public ArmStatusGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ArmStatus")ASObjectKeyData ASGetIn) {
    super(id, "ArmStatusGet");
    if (ASGetIn != null) {
      addInput("ArmStatus", ASObjectKeyHelper.toMap(ASGetIn, new HashMap(), "ASObjectKeyData").get("ASObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ASObjectData that results from the ArmStatusGetRequest call
 * @return ASObjectData resulting from udt call
 *
 */

  public ASObjectData getOutput() {
    return ASObjectHelper.fromMap(outputMap, "ArmStatus");
  }
}
