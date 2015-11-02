/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeUpdateRequest.java
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
 * Class used to create a ExternalIdTypeUpdateRequest Udt Request
 *
 */

public class ExternalIdTypeUpdateRequest extends ExternalIdTypeSubRequestParent {
/**
 *
 * Constructor to create a  ExternalIdTypeUpdateRequest
 * @param id Unique request name
 * @param EITUpdateIn ExternalIdTypeObjectData for ExternalIdTypeUpdateRequest
 *
 */
@JsonCreator
  public ExternalIdTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExternalIdType")ExternalIdTypeObjectData EITUpdateIn) {
    super(id, "ExternalIdTypeUpdate");
    if (EITUpdateIn != null) {
      addInput("ExternalIdType", ExternalIdTypeObjectHelper.toMap(EITUpdateIn, new HashMap(), "ExternalIdType").get("ExternalIdType"));
    }
  }

/**
 *
 * Retrieves the ExternalIdTypeObjectData that results from the ExternalIdTypeUpdateRequest call
 * @return ExternalIdTypeObjectData resulting from udt call
 *
 */

  public ExternalIdTypeObjectData getOutput() {
    return ExternalIdTypeObjectHelper.fromMap(outputMap, "ExternalIdType");
  }
}
