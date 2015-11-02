/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewAttributesGetRequest.java
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
 * Class used to create a CcViewAttributesGetRequest Udt Request
 *
 */

public class CcViewAttributesGetRequest extends CcViewAttributesSubRequestParent {
/**
 *
 * Constructor to create a  CcViewAttributesGetRequest
 * @param id Unique request name
 * @param CVAget_In CcViewAttributesObjectKeyData for CcViewAttributesGetRequest
 *
 */
@JsonCreator
  public CcViewAttributesGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CcViewAttributes")CcViewAttributesObjectKeyData CVAget_In) {
    super(id, "CcViewAttributesGet");
    if (CVAget_In != null) {
      addInput("CcViewAttributes", CcViewAttributesObjectKeyHelper.toMap(CVAget_In, new HashMap(), "CcViewAttributesObjectKeyData").get("CcViewAttributesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CcViewAttributesObjectData that results from the CcViewAttributesGetRequest call
 * @return CcViewAttributesObjectData resulting from udt call
 *
 */

  public CcViewAttributesObjectData getOutput() {
    return CcViewAttributesObjectHelper.fromMap(outputMap, "CcViewAttributes");
  }
}
