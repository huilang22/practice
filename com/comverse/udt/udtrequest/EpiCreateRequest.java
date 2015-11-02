/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiCreateRequest.java
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
 * Class used to create a EpiCreateRequest Udt Request
 *
 */

public class EpiCreateRequest extends EpiSubRequestParent {
/**
 *
 * Constructor to create a  EpiCreateRequest
 * @param id Unique request name
 * @param EpiCreateIn EpiObjectData for EpiCreateRequest
 *
 */
@JsonCreator
  public EpiCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Epi")EpiObjectData EpiCreateIn) {
    super(id, "EpiCreate");
    if (EpiCreateIn != null) {
      addInput("Epi", EpiObjectHelper.toMap(EpiCreateIn, new HashMap(), "Epi").get("Epi"));
    }
  }

/**
 *
 * Retrieves the EpiObjectData that results from the EpiCreateRequest call
 * @return EpiObjectData resulting from udt call
 *
 */

  public EpiObjectData getOutput() {
    return EpiObjectHelper.fromMap(outputMap, "Epi");
  }
}
