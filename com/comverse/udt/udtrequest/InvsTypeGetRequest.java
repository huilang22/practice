/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeGetRequest.java
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
 * Class used to create a InvsTypeGetRequest Udt Request
 *
 */

public class InvsTypeGetRequest extends InvsTypeSubRequestParent {
/**
 *
 * Constructor to create a  InvsTypeGetRequest
 * @param id Unique request name
 * @param InvsTypeGetIn InvsTypeObjectKeyData for InvsTypeGetRequest
 *
 */
@JsonCreator
  public InvsTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsType")InvsTypeObjectKeyData InvsTypeGetIn) {
    super(id, "InvsTypeGet");
    if (InvsTypeGetIn != null) {
      addInput("InvsType", InvsTypeObjectKeyHelper.toMap(InvsTypeGetIn, new HashMap(), "InvsTypeObjectKeyData").get("InvsTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsTypeObjectData that results from the InvsTypeGetRequest call
 * @return InvsTypeObjectData resulting from udt call
 *
 */

  public InvsTypeObjectData getOutput() {
    return InvsTypeObjectHelper.fromMap(outputMap, "InvsType");
  }
}
