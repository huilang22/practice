/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeCreateRequest.java
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
 * Class used to create a ExternalIdTypeCreateRequest Udt Request
 *
 */

public class ExternalIdTypeCreateRequest extends ExternalIdTypeSubRequestParent {
/**
 *
 * Constructor to create a  ExternalIdTypeCreateRequest
 * @param id Unique request name
 * @param EITCreateIn ExternalIdTypeObjectData for ExternalIdTypeCreateRequest
 *
 */
@JsonCreator
  public ExternalIdTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExternalIdType")ExternalIdTypeObjectData EITCreateIn) {
    super(id, "ExternalIdTypeCreate");
    if (EITCreateIn != null) {
      addInput("ExternalIdType", ExternalIdTypeObjectHelper.toMap(EITCreateIn, new HashMap(), "ExternalIdType").get("ExternalIdType"));
    }
  }

/**
 *
 * Retrieves the ExternalIdTypeObjectData that results from the ExternalIdTypeCreateRequest call
 * @return ExternalIdTypeObjectData resulting from udt call
 *
 */

  public ExternalIdTypeObjectData getOutput() {
    return ExternalIdTypeObjectHelper.fromMap(outputMap, "ExternalIdType");
  }
}
