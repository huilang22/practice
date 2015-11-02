/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDisplayFormatFindRequest.java
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
 * Class used to create a ChargeDisplayFormatFindRequest Udt Request
 *
 */

public class ChargeDisplayFormatFindRequest extends ChargeDisplayFormatRequest {
/**
 *
 * Constructor to create a  ChargeDisplayFormatFindRequest
 * @param id Unique request name
 * @param ChargeDisplayFormatFindIn ChargeDisplayFormatObjectFilter for ChargeDisplayFormatFindRequest
 *
 */
@JsonCreator
  public ChargeDisplayFormatFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ChargeDisplayFormat")ChargeDisplayFormatObjectFilter ChargeDisplayFormatFindIn) {
    super(id, "ChargeDisplayFormatFind");
    if (ChargeDisplayFormatFindIn != null) {
      Integer index =  ChargeDisplayFormatFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ChargeDisplayFormat", ChargeDisplayFormatObjectHelper.toMap(ChargeDisplayFormatFindIn, new HashMap(), "ChargeDisplayFormat").get("ChargeDisplayFormat"));
    }
  }

/**
 *
 * Retrieves the ChargeDisplayFormatObjectDataList that results from the ChargeDisplayFormatFindRequest call
 * @return ChargeDisplayFormatObjectDataList resulting from udt call
 *
 */

  public ChargeDisplayFormatObjectDataList getOutput() {
    return ChargeDisplayFormatObjectHelper.fromMapList(outputMap, "ChargeDisplayFormatList");
  }
}
