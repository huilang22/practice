/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateClassDescrCreateRequest.java
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
 * Class used to create a RateClassDescrCreateRequest Udt Request
 *
 */

public class RateClassDescrCreateRequest extends RateClassDescrSubRequestParent {
/**
 *
 * Constructor to create a  RateClassDescrCreateRequest
 * @param id Unique request name
 * @param RCDCrIn RateClassDescrObjectData for RateClassDescrCreateRequest
 *
 */
@JsonCreator
  public RateClassDescrCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateClassDescr")RateClassDescrObjectData RCDCrIn) {
    super(id, "RateClassDescrCreate");
    if (RCDCrIn != null) {
      addInput("RateClassDescr", RateClassDescrObjectHelper.toMap(RCDCrIn, new HashMap(), "RateClassDescr").get("RateClassDescr"));
    }
  }

/**
 *
 * Retrieves the RateClassDescrObjectData that results from the RateClassDescrCreateRequest call
 * @return RateClassDescrObjectData resulting from udt call
 *
 */

  public RateClassDescrObjectData getOutput() {
    return RateClassDescrObjectHelper.fromMap(outputMap, "RateClassDescr");
  }
}
