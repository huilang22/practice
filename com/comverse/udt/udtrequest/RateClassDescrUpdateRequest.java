/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateClassDescrUpdateRequest.java
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
 * Class used to create a RateClassDescrUpdateRequest Udt Request
 *
 */

public class RateClassDescrUpdateRequest extends RateClassDescrSubRequestParent {
/**
 *
 * Constructor to create a  RateClassDescrUpdateRequest
 * @param id Unique request name
 * @param RCDUpdIn RateClassDescrObjectData for RateClassDescrUpdateRequest
 *
 */
@JsonCreator
  public RateClassDescrUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateClassDescr")RateClassDescrObjectData RCDUpdIn) {
    super(id, "RateClassDescrUpdate");
    if (RCDUpdIn != null) {
      addInput("RateClassDescr", RateClassDescrObjectHelper.toMap(RCDUpdIn, new HashMap(), "RateClassDescr").get("RateClassDescr"));
    }
  }

/**
 *
 * Retrieves the RateClassDescrObjectData that results from the RateClassDescrUpdateRequest call
 * @return RateClassDescrObjectData resulting from udt call
 *
 */

  public RateClassDescrObjectData getOutput() {
    return RateClassDescrObjectHelper.fromMap(outputMap, "RateClassDescr");
  }
}
