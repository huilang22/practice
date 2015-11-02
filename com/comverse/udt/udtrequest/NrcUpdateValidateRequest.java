/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcUpdateValidateRequest.java
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
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a NrcUpdateValidateRequest Udt Request
 *
 */

public class NrcUpdateValidateRequest extends NrcRequest {
/**
 *
 * Constructor to create a  NrcUpdateValidateRequest
 * @param id Unique request name
 * @param NrcUpdateValidateIn NrcObjectBaseData for NrcUpdateValidateRequest
 *
 */
@JsonCreator
  public NrcUpdateValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Nrc")NrcObjectBaseData NrcUpdateValidateIn) {
    super(id, "NrcUpdateValidate");
    if (NrcUpdateValidateIn != null) {
      addInput("Nrc", NrcObjectBaseHelper.toMap(NrcUpdateValidateIn, new HashMap(), "Void").get("Void"));
    }
  }

}
