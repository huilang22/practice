/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDtUrlGetRequest.java
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
 * Class used to create a CustomerDtUrlGetRequest Udt Request
 *
 */

public class CustomerDtUrlGetRequest extends CustomerDtUrlSubRequestParent {
/**
 *
 * Constructor to create a  CustomerDtUrlGetRequest
 * @param id Unique request name
 * @param DocumentId Integer for CustomerDtUrlGetRequest
 *
 */
@JsonCreator
  public CustomerDtUrlGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("DocumentId")Integer DocumentId) {
    super(id, "CustomerDtUrlGet");
    if (DocumentId != null) {
      addInput("DocumentId", DocumentId);
    }
  }

/**
 *
 * Retrieves the CustomerDtUrlObjectData that results from the CustomerDtUrlGetRequest call
 * @return CustomerDtUrlObjectData resulting from udt call
 *
 */

  public CustomerDtUrlObjectData getOutput() {
    return CustomerDtUrlObjectHelper.fromMap(outputMap, "CustomerDtUrl");
  }
}
