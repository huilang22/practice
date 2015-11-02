/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransSourceTypeGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a TransSourceTypeGetRequest Udt Request
 *
 */

public class TransSourceTypeGetRequest extends TransSourceTypeSubRequestParent {
/**
 *
 * Constructor to create a  TransSourceTypeGetRequest
 * @param id Unique request name
 * @param TSGetIn TransSourceTypeObjectKeyData for TransSourceTypeGetRequest
 *
 */
@JsonCreator
  public TransSourceTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("TransSourceType")TransSourceTypeObjectKeyData TSGetIn) {
    super(id, "TransSourceTypeGet");
    if (TSGetIn != null) {
      addInput("TransSourceType", TransSourceTypeObjectKeyHelper.toMap(TSGetIn, new HashMap(), "TransSourceTypeObjectKeyData").get("TransSourceTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the TransSourceTypeObjectData that results from the TransSourceTypeGetRequest call
 * @return TransSourceTypeObjectData resulting from udt call
 *
 */

  public TransSourceTypeObjectData getOutput() {
    return TransSourceTypeObjectHelper.fromMap(outputMap, "TransSourceType");
  }
}
