/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeTypesGetRequest.java
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
 * Class used to create a LateFeeTypesGetRequest Udt Request
 *
 */

public class LateFeeTypesGetRequest extends LateFeeTypesSubRequestParent {
/**
 *
 * Constructor to create a  LateFeeTypesGetRequest
 * @param id Unique request name
 * @param LFTGetIn LFTObjectKeyData for LateFeeTypesGetRequest
 *
 */
@JsonCreator
  public LateFeeTypesGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("LateFeeTypes")LFTObjectKeyData LFTGetIn) {
    super(id, "LateFeeTypesGet");
    if (LFTGetIn != null) {
      addInput("LateFeeTypes", LFTObjectKeyHelper.toMap(LFTGetIn, new HashMap(), "LFTObjectKeyData").get("LFTObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the LFTObjectData that results from the LateFeeTypesGetRequest call
 * @return LFTObjectData resulting from udt call
 *
 */

  public LFTObjectData getOutput() {
    return LFTObjectHelper.fromMap(outputMap, "LateFeeTypes");
  }
}
