/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeDeleteRequest.java
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
 * Class used to create a ExternalIdTypeDeleteRequest Udt Request
 *
 */

public class ExternalIdTypeDeleteRequest extends ExternalIdTypeSubRequestParent {
/**
 *
 * Constructor to create a  ExternalIdTypeDeleteRequest
 * @param id Unique request name
 * @param EITDeleteIn ExternalIdTypeObjectKeyData for ExternalIdTypeDeleteRequest
 *
 */
@JsonCreator
  public ExternalIdTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExternalIdType")ExternalIdTypeObjectKeyData EITDeleteIn) {
    super(id, "ExternalIdTypeDelete");
    if (EITDeleteIn != null) {
      addInput("ExternalIdType", ExternalIdTypeObjectKeyHelper.toMap(EITDeleteIn, new HashMap(), "ExternalIdTypeObjectKeyData").get("ExternalIdTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ExternalIdTypeObjectData that results from the ExternalIdTypeDeleteRequest call
 * @return ExternalIdTypeObjectData resulting from udt call
 *
 */

  public ExternalIdTypeObjectData getOutput() {
    return ExternalIdTypeObjectHelper.fromMap(outputMap, "ExternalIdType");
  }
}
