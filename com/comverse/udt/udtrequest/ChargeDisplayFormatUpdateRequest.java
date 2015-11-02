/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDisplayFormatUpdateRequest.java
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
 * Class used to create a ChargeDisplayFormatUpdateRequest Udt Request
 *
 */

public class ChargeDisplayFormatUpdateRequest extends ChargeDisplayFormatSubRequestParent {
/**
 *
 * Constructor to create a  ChargeDisplayFormatUpdateRequest
 * @param id Unique request name
 * @param ChargeDisplayFormatUpdateIn ChargeDisplayFormatObjectData for ChargeDisplayFormatUpdateRequest
 *
 */
@JsonCreator
  public ChargeDisplayFormatUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ChargeDisplayFormat")ChargeDisplayFormatObjectData ChargeDisplayFormatUpdateIn) {
    super(id, "ChargeDisplayFormatUpdate");
    if (ChargeDisplayFormatUpdateIn != null) {
      addInput("ChargeDisplayFormat", ChargeDisplayFormatObjectHelper.toMap(ChargeDisplayFormatUpdateIn, new HashMap(), "ChargeDisplayFormat").get("ChargeDisplayFormat"));
    }
  }

/**
 *
 * Retrieves the ChargeDisplayFormatObjectData that results from the ChargeDisplayFormatUpdateRequest call
 * @return ChargeDisplayFormatObjectData resulting from udt call
 *
 */

  public ChargeDisplayFormatObjectData getOutput() {
    return ChargeDisplayFormatObjectHelper.fromMap(outputMap, "ChargeDisplayFormat");
  }
}
