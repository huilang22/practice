/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitsTypeCreateRequest.java
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
 * Class used to create a UnitsTypeCreateRequest Udt Request
 *
 */

public class UnitsTypeCreateRequest extends UnitsTypeSubRequestParent {
/**
 *
 * Constructor to create a  UnitsTypeCreateRequest
 * @param id Unique request name
 * @param utCrIn UnitsTypeObjectData for UnitsTypeCreateRequest
 *
 */
@JsonCreator
  public UnitsTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitsType")UnitsTypeObjectData utCrIn) {
    super(id, "UnitsTypeCreate");
    if (utCrIn != null) {
      addInput("UnitsType", UnitsTypeObjectHelper.toMap(utCrIn, new HashMap(), "UnitsType").get("UnitsType"));
    }
  }

/**
 *
 * Retrieves the UnitsTypeObjectData that results from the UnitsTypeCreateRequest call
 * @return UnitsTypeObjectData resulting from udt call
 *
 */

  public UnitsTypeObjectData getOutput() {
    return UnitsTypeObjectHelper.fromMap(outputMap, "UnitsType");
  }
}
