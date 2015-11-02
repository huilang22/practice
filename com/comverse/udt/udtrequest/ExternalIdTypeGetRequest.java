/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeGetRequest.java
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
 * Class used to create a ExternalIdTypeGetRequest Udt Request
 *
 */

public class ExternalIdTypeGetRequest extends ExternalIdTypeSubRequestParent {
/**
 *
 * Constructor to create a  ExternalIdTypeGetRequest
 * @param id Unique request name
 * @param EITGetIn ExternalIdTypeObjectKeyData for ExternalIdTypeGetRequest
 *
 */
@JsonCreator
  public ExternalIdTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExternalIdType")ExternalIdTypeObjectKeyData EITGetIn) {
    super(id, "ExternalIdTypeGet");
    if (EITGetIn != null) {
      addInput("ExternalIdType", ExternalIdTypeObjectKeyHelper.toMap(EITGetIn, new HashMap(), "ExternalIdTypeObjectKeyData").get("ExternalIdTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ExternalIdTypeObjectData that results from the ExternalIdTypeGetRequest call
 * @return ExternalIdTypeObjectData resulting from udt call
 *
 */

  public ExternalIdTypeObjectData getOutput() {
    return ExternalIdTypeObjectHelper.fromMap(outputMap, "ExternalIdType");
  }
}
