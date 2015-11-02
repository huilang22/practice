/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdAcctMapGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ExternalIdAcctMapGetRequest Udt Request
 *
 */

public class ExternalIdAcctMapGetRequest extends ExternalIdAcctMapSubRequestParent {
/**
 *
 * Constructor to create a  ExternalIdAcctMapGetRequest
 * @param id Unique request name
 * @param getIn EIAMObjectKeyData for ExternalIdAcctMapGetRequest
 *
 */
@JsonCreator
  public ExternalIdAcctMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExternalIdAcctMap")EIAMObjectKeyData getIn) {
    super(id, "ExternalIdAcctMapGet");
    if (getIn != null) {
      addInput("ExternalIdAcctMap", EIAMObjectKeyHelper.toMap(getIn, new HashMap(), "EIAMObjectKeyData").get("EIAMObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EIAMObjectData that results from the ExternalIdAcctMapGetRequest call
 * @return EIAMObjectData resulting from udt call
 *
 */

  public EIAMObjectData getOutput() {
    return EIAMObjectHelper.fromMap(outputMap, "ExternalIdAcctMap");
  }
}
