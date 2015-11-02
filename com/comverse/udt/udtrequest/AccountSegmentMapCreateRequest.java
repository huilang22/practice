/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentMapCreateRequest.java
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
 * Class used to create a AccountSegmentMapCreateRequest Udt Request
 *
 */

public class AccountSegmentMapCreateRequest extends AccountSegmentMapSubRequestParent {
/**
 *
 * Constructor to create a  AccountSegmentMapCreateRequest
 * @param id Unique request name
 * @param ASMCreateIn AccountSegmentMapObjectData for AccountSegmentMapCreateRequest
 *
 */
@JsonCreator
  public AccountSegmentMapCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountSegmentMap")AccountSegmentMapObjectData ASMCreateIn) {
    super(id, "AccountSegmentMapCreate");
    if (ASMCreateIn != null) {
      addInput("AccountSegmentMap", AccountSegmentMapObjectHelper.toMap(ASMCreateIn, new HashMap(), "AccountSegmentMap").get("AccountSegmentMap"));
    }
  }

/**
 *
 * Retrieves the AccountSegmentMapObjectData that results from the AccountSegmentMapCreateRequest call
 * @return AccountSegmentMapObjectData resulting from udt call
 *
 */

  public AccountSegmentMapObjectData getOutput() {
    return AccountSegmentMapObjectHelper.fromMap(outputMap, "AccountSegmentMap");
  }
}
