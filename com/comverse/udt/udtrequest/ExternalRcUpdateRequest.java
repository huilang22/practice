/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalRcUpdateRequest.java
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
 * Class used to create a ExternalRcUpdateRequest Udt Request
 *
 */

public class ExternalRcUpdateRequest extends ExternalRcSubRequestParent {
/**
 *
 * Constructor to create a  ExternalRcUpdateRequest
 * @param id Unique request name
 * @param ExternalRcUpdateIn ExternalRcObjectData for ExternalRcUpdateRequest
 *
 */
@JsonCreator
  public ExternalRcUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExternalRc")ExternalRcObjectData ExternalRcUpdateIn) {
    super(id, "ExternalRcUpdate");
    if (ExternalRcUpdateIn != null) {
      addInput("ExternalRc", ExternalRcObjectHelper.toMap(ExternalRcUpdateIn, new HashMap(), "ExternalRc").get("ExternalRc"));
    }
  }

/**
 *
 * Retrieves the ExternalRcObjectData that results from the ExternalRcUpdateRequest call
 * @return ExternalRcObjectData resulting from udt call
 *
 */

  public ExternalRcObjectData getOutput() {
    return ExternalRcObjectHelper.fromMap(outputMap, "ExternalRc");
  }
}
