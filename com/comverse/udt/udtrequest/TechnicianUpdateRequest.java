/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TechnicianUpdateRequest.java
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

import com.csgsystems.we.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a TechnicianUpdateRequest Udt Request
 *
 */

public class TechnicianUpdateRequest extends TechnicianSubRequestParent {
/**
 *
 * Constructor to create a  TechnicianUpdateRequest
 * @param id Unique request name
 * @param TechnicianUpdateIn TechnicianObjectData for TechnicianUpdateRequest
 *
 */
@JsonCreator
  public TechnicianUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Technician")TechnicianObjectData TechnicianUpdateIn) {
    super(id, "TechnicianUpdate");
    if (TechnicianUpdateIn != null) {
      addInput("Technician", TechnicianObjectHelper.toMap(TechnicianUpdateIn, new HashMap(), "Technician").get("Technician"));
    }
  }

/**
 *
 * Retrieves the TechnicianObjectData that results from the TechnicianUpdateRequest call
 * @return TechnicianObjectData resulting from udt call
 *
 */

  public TechnicianObjectData getOutput() {
    return TechnicianObjectHelper.fromMap(outputMap, "Technician");
  }
}
