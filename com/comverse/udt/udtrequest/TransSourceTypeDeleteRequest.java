/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransSourceTypeDeleteRequest.java
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
 * Class used to create a TransSourceTypeDeleteRequest Udt Request
 *
 */

public class TransSourceTypeDeleteRequest extends TransSourceTypeSubRequestParent {
/**
 *
 * Constructor to create a  TransSourceTypeDeleteRequest
 * @param id Unique request name
 * @param TSDeleteIn TransSourceTypeObjectKeyData for TransSourceTypeDeleteRequest
 *
 */
@JsonCreator
  public TransSourceTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("TransSourceType")TransSourceTypeObjectKeyData TSDeleteIn) {
    super(id, "TransSourceTypeDelete");
    if (TSDeleteIn != null) {
      addInput("TransSourceType", TransSourceTypeObjectKeyHelper.toMap(TSDeleteIn, new HashMap(), "TransSourceTypeObjectKeyData").get("TransSourceTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the TransSourceTypeObjectData that results from the TransSourceTypeDeleteRequest call
 * @return TransSourceTypeObjectData resulting from udt call
 *
 */

  public TransSourceTypeObjectData getOutput() {
    return TransSourceTypeObjectHelper.fromMap(outputMap, "TransSourceType");
  }
}
