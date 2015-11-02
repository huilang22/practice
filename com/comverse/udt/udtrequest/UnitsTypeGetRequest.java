/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitsTypeGetRequest.java
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
 * Class used to create a UnitsTypeGetRequest Udt Request
 *
 */

public class UnitsTypeGetRequest extends UnitsTypeSubRequestParent {
/**
 *
 * Constructor to create a  UnitsTypeGetRequest
 * @param id Unique request name
 * @param utGetIn UnitsTypeObjectKeyData for UnitsTypeGetRequest
 *
 */
@JsonCreator
  public UnitsTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitsType")UnitsTypeObjectKeyData utGetIn) {
    super(id, "UnitsTypeGet");
    if (utGetIn != null) {
      addInput("UnitsType", UnitsTypeObjectKeyHelper.toMap(utGetIn, new HashMap(), "UnitsTypeObjectKeyData").get("UnitsTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UnitsTypeObjectData that results from the UnitsTypeGetRequest call
 * @return UnitsTypeObjectData resulting from udt call
 *
 */

  public UnitsTypeObjectData getOutput() {
    return UnitsTypeObjectHelper.fromMap(outputMap, "UnitsType");
  }
}
