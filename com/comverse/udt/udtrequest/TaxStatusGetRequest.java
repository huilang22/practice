/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxStatusGetRequest.java
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
 * Class used to create a TaxStatusGetRequest Udt Request
 *
 */

public class TaxStatusGetRequest extends TaxStatusSubRequestParent {
/**
 *
 * Constructor to create a  TaxStatusGetRequest
 * @param id Unique request name
 * @param TSGetIn TSObjectKeyData for TaxStatusGetRequest
 *
 */
@JsonCreator
  public TaxStatusGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("TaxStatus")TSObjectKeyData TSGetIn) {
    super(id, "TaxStatusGet");
    if (TSGetIn != null) {
      addInput("TaxStatus", TSObjectKeyHelper.toMap(TSGetIn, new HashMap(), "TSObjectKeyData").get("TSObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the TSObjectData that results from the TaxStatusGetRequest call
 * @return TSObjectData resulting from udt call
 *
 */

  public TSObjectData getOutput() {
    return TSObjectHelper.fromMap(outputMap, "TaxStatus");
  }
}
