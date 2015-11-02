/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxAbandonedGetRequest.java
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
 * Class used to create a TaxAbandonedGetRequest Udt Request
 *
 */

public class TaxAbandonedGetRequest extends TaxAbandonedSubRequestParent {
/**
 *
 * Constructor to create a  TaxAbandonedGetRequest
 * @param id Unique request name
 * @param TAget_In TaxAbandonedObjectKeyData for TaxAbandonedGetRequest
 *
 */
@JsonCreator
  public TaxAbandonedGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("TaxAbandoned")TaxAbandonedObjectKeyData TAget_In) {
    super(id, "TaxAbandonedGet");
    if (TAget_In != null) {
      addInput("TaxAbandoned", TaxAbandonedObjectKeyHelper.toMap(TAget_In, new HashMap(), "TaxAbandonedObjectKeyData").get("TaxAbandonedObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the TaxAbandonedObjectData that results from the TaxAbandonedGetRequest call
 * @return TaxAbandonedObjectData resulting from udt call
 *
 */

  public TaxAbandonedObjectData getOutput() {
    return TaxAbandonedObjectHelper.fromMap(outputMap, "TaxAbandoned");
  }
}
