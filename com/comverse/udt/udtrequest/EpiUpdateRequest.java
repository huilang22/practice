/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiUpdateRequest.java
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
 * Class used to create a EpiUpdateRequest Udt Request
 *
 */

public class EpiUpdateRequest extends EpiSubRequestParent {
/**
 *
 * Constructor to create a  EpiUpdateRequest
 * @param id Unique request name
 * @param EpiUpdateIn EpiObjectData for EpiUpdateRequest
 *
 */
@JsonCreator
  public EpiUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Epi")EpiObjectData EpiUpdateIn) {
    super(id, "EpiUpdate");
    if (EpiUpdateIn != null) {
      addInput("Epi", EpiObjectHelper.toMap(EpiUpdateIn, new HashMap(), "Epi").get("Epi"));
    }
  }

/**
 *
 * Retrieves the EpiObjectData that results from the EpiUpdateRequest call
 * @return EpiObjectData resulting from udt call
 *
 */

  public EpiObjectData getOutput() {
    return EpiObjectHelper.fromMap(outputMap, "Epi");
  }
}
