/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDisplayFormatGetRequest.java
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
 * Class used to create a ChargeDisplayFormatGetRequest Udt Request
 *
 */

public class ChargeDisplayFormatGetRequest extends ChargeDisplayFormatSubRequestParent {
/**
 *
 * Constructor to create a  ChargeDisplayFormatGetRequest
 * @param id Unique request name
 * @param ChargeDisplayFormatGetIn ChargeDisplayFormatObjectKeyData for ChargeDisplayFormatGetRequest
 *
 */
@JsonCreator
  public ChargeDisplayFormatGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ChargeDisplayFormat")ChargeDisplayFormatObjectKeyData ChargeDisplayFormatGetIn) {
    super(id, "ChargeDisplayFormatGet");
    if (ChargeDisplayFormatGetIn != null) {
      addInput("ChargeDisplayFormat", ChargeDisplayFormatObjectKeyHelper.toMap(ChargeDisplayFormatGetIn, new HashMap(), "ChargeDisplayFormatObjectKeyData").get("ChargeDisplayFormatObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ChargeDisplayFormatObjectData that results from the ChargeDisplayFormatGetRequest call
 * @return ChargeDisplayFormatObjectData resulting from udt call
 *
 */

  public ChargeDisplayFormatObjectData getOutput() {
    return ChargeDisplayFormatObjectHelper.fromMap(outputMap, "ChargeDisplayFormat");
  }
}
