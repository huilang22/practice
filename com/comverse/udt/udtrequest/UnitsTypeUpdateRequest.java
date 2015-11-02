/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitsTypeUpdateRequest.java
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
 * Class used to create a UnitsTypeUpdateRequest Udt Request
 *
 */

public class UnitsTypeUpdateRequest extends UnitsTypeSubRequestParent {
/**
 *
 * Constructor to create a  UnitsTypeUpdateRequest
 * @param id Unique request name
 * @param utUpdIn UnitsTypeObjectData for UnitsTypeUpdateRequest
 *
 */
@JsonCreator
  public UnitsTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitsType")UnitsTypeObjectData utUpdIn) {
    super(id, "UnitsTypeUpdate");
    if (utUpdIn != null) {
      addInput("UnitsType", UnitsTypeObjectHelper.toMap(utUpdIn, new HashMap(), "UnitsType").get("UnitsType"));
    }
  }

/**
 *
 * Retrieves the UnitsTypeObjectData that results from the UnitsTypeUpdateRequest call
 * @return UnitsTypeObjectData resulting from udt call
 *
 */

  public UnitsTypeObjectData getOutput() {
    return UnitsTypeObjectHelper.fromMap(outputMap, "UnitsType");
  }
}
