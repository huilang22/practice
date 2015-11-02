/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcDeleteValidateRequest.java
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
 * Class used to create a NrcDeleteValidateRequest Udt Request
 *
 */

public class NrcDeleteValidateRequest extends NrcRequest {
/**
 *
 * Constructor to create a  NrcDeleteValidateRequest
 * @param id Unique request name
 * @param NrcDeleteValidateIn NrcObjectBaseData for NrcDeleteValidateRequest
 *
 */
@JsonCreator
  public NrcDeleteValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Nrc")NrcObjectBaseData NrcDeleteValidateIn) {
    super(id, "NrcDeleteValidate");
    if (NrcDeleteValidateIn != null) {
      addInput("Nrc", NrcObjectBaseHelper.toMap(NrcDeleteValidateIn, new HashMap(), "Void").get("Void"));
    }
  }

}
