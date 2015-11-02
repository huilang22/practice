/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TechnicianCreateRequest.java
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
 * Class used to create a TechnicianCreateRequest Udt Request
 *
 */

public class TechnicianCreateRequest extends TechnicianSubRequestParent {
/**
 *
 * Constructor to create a  TechnicianCreateRequest
 * @param id Unique request name
 * @param TechnicianCreateIn TechnicianObjectData for TechnicianCreateRequest
 *
 */
@JsonCreator
  public TechnicianCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Technician")TechnicianObjectData TechnicianCreateIn) {
    super(id, "TechnicianCreate");
    if (TechnicianCreateIn != null) {
      addInput("Technician", TechnicianObjectHelper.toMap(TechnicianCreateIn, new HashMap(), "Technician").get("Technician"));
    }
  }

/**
 *
 * Retrieves the TechnicianObjectData that results from the TechnicianCreateRequest call
 * @return TechnicianObjectData resulting from udt call
 *
 */

  public TechnicianObjectData getOutput() {
    return TechnicianObjectHelper.fromMap(outputMap, "Technician");
  }
}
