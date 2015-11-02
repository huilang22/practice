/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalRcGetRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ExternalRcGetRequest Udt Request
 *
 */

public class ExternalRcGetRequest extends ExternalRcSubRequestParent {
/**
 *
 * Constructor to create a  ExternalRcGetRequest
 * @param id Unique request name
 * @param ExternalRcGetIn ExternalRcObjectKeyData for ExternalRcGetRequest
 *
 */
@JsonCreator
  public ExternalRcGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExternalRc")ExternalRcObjectKeyData ExternalRcGetIn) {
    super(id, "ExternalRcGet");
    if (ExternalRcGetIn != null) {
      addInput("ExternalRc", ExternalRcObjectKeyHelper.toMap(ExternalRcGetIn, new HashMap(), "ExternalRcObjectKeyData").get("ExternalRcObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ExternalRcObjectData that results from the ExternalRcGetRequest call
 * @return ExternalRcObjectData resulting from udt call
 *
 */

  public ExternalRcObjectData getOutput() {
    return ExternalRcObjectHelper.fromMap(outputMap, "ExternalRc");
  }
}
