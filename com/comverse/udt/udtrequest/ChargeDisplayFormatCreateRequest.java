/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDisplayFormatCreateRequest.java
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
 * Class used to create a ChargeDisplayFormatCreateRequest Udt Request
 *
 */

public class ChargeDisplayFormatCreateRequest extends ChargeDisplayFormatSubRequestParent {
/**
 *
 * Constructor to create a  ChargeDisplayFormatCreateRequest
 * @param id Unique request name
 * @param ChargeDisplayFormatCreateIn ChargeDisplayFormatObjectData for ChargeDisplayFormatCreateRequest
 *
 */
@JsonCreator
  public ChargeDisplayFormatCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ChargeDisplayFormat")ChargeDisplayFormatObjectData ChargeDisplayFormatCreateIn) {
    super(id, "ChargeDisplayFormatCreate");
    if (ChargeDisplayFormatCreateIn != null) {
      addInput("ChargeDisplayFormat", ChargeDisplayFormatObjectHelper.toMap(ChargeDisplayFormatCreateIn, new HashMap(), "ChargeDisplayFormat").get("ChargeDisplayFormat"));
    }
  }

/**
 *
 * Retrieves the ChargeDisplayFormatObjectData that results from the ChargeDisplayFormatCreateRequest call
 * @return ChargeDisplayFormatObjectData resulting from udt call
 *
 */

  public ChargeDisplayFormatObjectData getOutput() {
    return ChargeDisplayFormatObjectHelper.fromMap(outputMap, "ChargeDisplayFormat");
  }
}
