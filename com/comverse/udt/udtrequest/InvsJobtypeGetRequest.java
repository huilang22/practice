/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobtypeGetRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsJobtypeGetRequest Udt Request
 *
 */

public class InvsJobtypeGetRequest extends InvsJobtypeSubRequestParent {
/**
 *
 * Constructor to create a  InvsJobtypeGetRequest
 * @param id Unique request name
 * @param InvsJobtypeGetIn InvsJobtypeObjectKeyData for InvsJobtypeGetRequest
 *
 */
@JsonCreator
  public InvsJobtypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsJobtype")InvsJobtypeObjectKeyData InvsJobtypeGetIn) {
    super(id, "InvsJobtypeGet");
    if (InvsJobtypeGetIn != null) {
      addInput("InvsJobtype", InvsJobtypeObjectKeyHelper.toMap(InvsJobtypeGetIn, new HashMap(), "InvsJobtypeObjectKeyData").get("InvsJobtypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsJobtypeObjectData that results from the InvsJobtypeGetRequest call
 * @return InvsJobtypeObjectData resulting from udt call
 *
 */

  public InvsJobtypeObjectData getOutput() {
    return InvsJobtypeObjectHelper.fromMap(outputMap, "InvsJobtype");
  }
}
