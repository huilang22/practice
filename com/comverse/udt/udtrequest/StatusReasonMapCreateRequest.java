/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonMapCreateRequest.java
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
 * Class used to create a StatusReasonMapCreateRequest Udt Request
 *
 */

public class StatusReasonMapCreateRequest extends StatusReasonMapSubRequestParent {
/**
 *
 * Constructor to create a  StatusReasonMapCreateRequest
 * @param id Unique request name
 * @param SRMCreateIn SRMObjectData for StatusReasonMapCreateRequest
 *
 */
@JsonCreator
  public StatusReasonMapCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("StatusReasonMap")SRMObjectData SRMCreateIn) {
    super(id, "StatusReasonMapCreate");
    if (SRMCreateIn != null) {
      addInput("StatusReasonMap", SRMObjectHelper.toMap(SRMCreateIn, new HashMap(), "StatusReasonMap").get("StatusReasonMap"));
    }
  }

/**
 *
 * Retrieves the SRMObjectData that results from the StatusReasonMapCreateRequest call
 * @return SRMObjectData resulting from udt call
 *
 */

  public SRMObjectData getOutput() {
    return SRMObjectHelper.fromMap(outputMap, "StatusReasonMap");
  }
}
