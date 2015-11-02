/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TechnicianGetRequest.java
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
 * Class used to create a TechnicianGetRequest Udt Request
 *
 */

public class TechnicianGetRequest extends TechnicianSubRequestParent {
/**
 *
 * Constructor to create a  TechnicianGetRequest
 * @param id Unique request name
 * @param TechnicianGetIn TechnicianObjectKeyData for TechnicianGetRequest
 *
 */
@JsonCreator
  public TechnicianGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Technician")TechnicianObjectKeyData TechnicianGetIn) {
    super(id, "TechnicianGet");
    if (TechnicianGetIn != null) {
      addInput("Technician", TechnicianObjectKeyHelper.toMap(TechnicianGetIn, new HashMap(), "TechnicianObjectKeyData").get("TechnicianObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the TechnicianObjectData that results from the TechnicianGetRequest call
 * @return TechnicianObjectData resulting from udt call
 *
 */

  public TechnicianObjectData getOutput() {
    return TechnicianObjectHelper.fromMap(outputMap, "Technician");
  }
}
