/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeGetRequest.java
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
 * Class used to create a InvsContainerTypeGetRequest Udt Request
 *
 */

public class InvsContainerTypeGetRequest extends InvsContainerTypeSubRequestParent {
/**
 *
 * Constructor to create a  InvsContainerTypeGetRequest
 * @param id Unique request name
 * @param InvsContainerTypeGetIn InvsContainerTypeObjectKeyData for InvsContainerTypeGetRequest
 *
 */
@JsonCreator
  public InvsContainerTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsContainerType")InvsContainerTypeObjectKeyData InvsContainerTypeGetIn) {
    super(id, "InvsContainerTypeGet");
    if (InvsContainerTypeGetIn != null) {
      addInput("InvsContainerType", InvsContainerTypeObjectKeyHelper.toMap(InvsContainerTypeGetIn, new HashMap(), "InvsContainerTypeObjectKeyData").get("InvsContainerTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsContainerTypeObjectData that results from the InvsContainerTypeGetRequest call
 * @return InvsContainerTypeObjectData resulting from udt call
 *
 */

  public InvsContainerTypeObjectData getOutput() {
    return InvsContainerTypeObjectHelper.fromMap(outputMap, "InvsContainerType");
  }
}
