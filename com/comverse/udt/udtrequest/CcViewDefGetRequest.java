/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewDefGetRequest.java
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
 * Class used to create a CcViewDefGetRequest Udt Request
 *
 */

public class CcViewDefGetRequest extends CcViewDefSubRequestParent {
/**
 *
 * Constructor to create a  CcViewDefGetRequest
 * @param id Unique request name
 * @param CVDget_In CcViewDefObjectKeyData for CcViewDefGetRequest
 *
 */
@JsonCreator
  public CcViewDefGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CcViewDef")CcViewDefObjectKeyData CVDget_In) {
    super(id, "CcViewDefGet");
    if (CVDget_In != null) {
      addInput("CcViewDef", CcViewDefObjectKeyHelper.toMap(CVDget_In, new HashMap(), "CcViewDefObjectKeyData").get("CcViewDefObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CcViewDefObjectData that results from the CcViewDefGetRequest call
 * @return CcViewDefObjectData resulting from udt call
 *
 */

  public CcViewDefObjectData getOutput() {
    return CcViewDefObjectHelper.fromMap(outputMap, "CcViewDef");
  }
}
