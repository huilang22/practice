/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAttributesDefGetRequest.java
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
 * Class used to create a CcAttributesDefGetRequest Udt Request
 *
 */

public class CcAttributesDefGetRequest extends CcAttributesDefSubRequestParent {
/**
 *
 * Constructor to create a  CcAttributesDefGetRequest
 * @param id Unique request name
 * @param CADget_In CcAttributesDefObjectKeyData for CcAttributesDefGetRequest
 *
 */
@JsonCreator
  public CcAttributesDefGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CcAttributesDef")CcAttributesDefObjectKeyData CADget_In) {
    super(id, "CcAttributesDefGet");
    if (CADget_In != null) {
      addInput("CcAttributesDef", CcAttributesDefObjectKeyHelper.toMap(CADget_In, new HashMap(), "CcAttributesDefObjectKeyData").get("CcAttributesDefObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CcAttributesDefObjectData that results from the CcAttributesDefGetRequest call
 * @return CcAttributesDefObjectData resulting from udt call
 *
 */

  public CcAttributesDefObjectData getOutput() {
    return CcAttributesDefObjectHelper.fromMap(outputMap, "CcAttributesDef");
  }
}
